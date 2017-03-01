public class Partition2{

    public static void printArray(int [] data){
	for(int x: data)
	    System.out.print(x + " ");
	System.out.println();
    }
    // returns a random array of 0 and 1, N is the length
    public static int[] sample(int n){
	int [] ans = new int[n];
	for(int i = 0; i < n; i++)
	    ans[i] = (int)(Math.random() * 3);
	return ans;
    }

    
    
    // *************** QUESTION 1 *****************************************
    // precondition: 0 <= i,j < data.length
    // postcondition: swaps the values at positions i and j in data[]
    public static void exch(int[] data, int i , int j){
	int temp = data[i];
	data[i] = data[j];
	data[j] = temp; 
    }
        // *************** QUESTION 2 *****************************************
    // precondition: data != null
    // postcondition: returns true if data is sorted in ascending order;
    //                false otherwise
    public static boolean isSorted(int[] data){
	boolean ans = true;
	for (int i = 0; i < data.length - 1; i++)
		if (data[i + 1] < data[i])
			ans = false;
	return ans;
    }

    // *************** QUESTION 3 *****************************************
    // precondition: data.length != null
    //               has at most 2 different values.
    //public static void partition2(int[] data){
/*
		for (int i = 0, j = data.length - 1; i < j; i++, j--){
			if (data[i] > data[i + 1]){
				exch(data, i, i + 1);
				partition(data);
			}
			if (data[j] < data[j - 1]){
				exch(data, j, j - 1);
				partition(data);
			}
		}
  
  }
*/
    public static void partition2(int[] data){
	int left = 0, right = data.length - 1;
	int curr = left;
	while (curr < data.length && data[curr] == data[left] &&
	       data[curr] == data[right]) curr++;

	// all the values are the same.
	if (curr >=  data.length) return;

	// There are two different values.
	// Put the min to left, max to right
	if (data [curr] < data[left])
	    exch(data,curr,left);
	// left has min, curr has max
	if (data[curr] > data[right])
	    exch(data,curr,right);
	// right has max
	left++;
	right--;
	curr = left;
	// Invariant : every value to the left of left is min
	//             every value to the right of right is max
	while (left <= right){
	    if (data[curr] == data[left - 1]){
		exch(data,curr,left);
		left++;
	    }
	    else{
		exch(data,curr,right);
		right--;
	    }
	    curr = left;
	}
       
    }

	public static void partition(int[] data){
		if(data.length == 0 || isSorted(data)) return;
		int min = data[0];
		for (int i = 0; i < data.length; i++){
			if (data[i] < min){
				min = data[i];
			}
		}
		int left = 0;
		for (int i = 0; i < data.length; i++){
			if (data[i] == min){
				exch(data, left, i);
				left++;
			}
		}
		int border = left;
		min = data[border];
		for (int i = border; i < data.length; i++){
			if (data[i] < min){
				min = data[i];
				break;
			}
		}
		for (int i = border; i < data.length; i++){
			if (data[i] == min){
				exch(data, left, i);
				left++;
			}
		}
/*
while (low < high){
	if (data[low] == min) low++;
	else if (data[high] == min){
		exch(data,low,high);
		high--;
		low++;
	}
	else high++;
}
		int count = 0;
		for (int i = 0; i < data.length; i++){
			if (data[i] == min){
				count += 1;
			}			
		}
		int [] breakoff = new int[data.length - count];
		int bocount = 0;
		int [] hold = new int[count];
		int hcount = 0;
		for (int i = 0; i < data.length; i++){
			if (data[i] == min){
				hold[hcount] = data[i];
				hcount++;
			}
			else{
				breakoff[bocount] = data[i];
				bocount++;				
			}		
		}
		partition2(breakoff);
		for (int i = 0; i < data.length; i++){
			if (i < hold.length)
				data[i] = hold[i];
			else
				data[i] = breakoff[i - hold.length];
		}
*/
	}

	
    
    public static void main(String [] args){
	int start = 1;
	int [] data;
	for (int i = 0; i < 20; i++){
	    data = sample(i);
	    System.out.print("orig: ");
	    printArray(data);
	    partition(data);
	    System.out.print("sort: ");
	    printArray(data);
	    if (isSorted(data))
		System.out.println("***** SORTED **** ");
	    else
		System.out.println("***** NOT SORTED **** ");
	}
	

    }
}
    
