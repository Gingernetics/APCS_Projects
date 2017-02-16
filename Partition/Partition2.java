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
    public static void partition2(int[] data){
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

	public static void partition(int[] data){
		if(data.length == 0 || isSorted(data)) return;
		int min = data[0];
		for (int i = 0; i < data.length; i++){
			if (data[i] < min){
				min = data[i];
			}
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
		for (int i = 0; i < hold.length; i++)
		    data[i] = hold[i];
		for (int i = 0; i < breakoff.length; i++)
		    data[i + hold.length] = breakoff[i];   
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
    
