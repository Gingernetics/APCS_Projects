public class Merge{

    public static void printArray(int [] a){
	for (int n : a)
	    System.out.print (n + " ");
	System.out.println();

    }

    // precondition: aLow <= bLow and bLow <= bHigh
    //               the data within [aLow, bLow) is sorted in ascending order
    //               the data within [bLow, bHigh) is sorted in ascending order
    // postcondtion : Without using any additional data structure
    //                the data within [aLow, bHigh) is sorted in ascending order
    public static void mergeInPlace(int[] data, int aLow, int bLow, int bHigh){
	while (bLow < bHigh){
	    int i = bLow;
	    while (i > aLow && data[i-1] > data[i]){
		int temp = data[i];
		data[i] = data[i-1];
		data[i-1] = temp;
		i--;
	    }
	    bLow++;
	}
    }

    // precondtion: aLow <= bLow, bLow <= bHigh
    //              the data within [aLow, bLow) is sorted in ascending order
    //              the data within [bLow, bHigh) is sorted in ascending order
    // postcondition: return of copy of the data in ascending order
    public static int[] merge(int [] data, int aLow, int bLow, int bHigh){
	int n = bHigh - aLow;
	int [] result = new int[n];
	int i = 0, j = aLow, k;
	for (k = 0; k < n && i < bLow && j < bHigh; k++){
		if (data[i] < data[j])
			result[k] = data[i++];
		else result[k] = data[j++];
	}
	while(i < bLow) result[k++] = data[i++];
	while(j < bHigh) result[k++] = data[j++];
	return result;
    }

    public static void main(String [] args){
	int[] data1 = {1,3,5,8,2,6,11};
	int[] data2 = {1,3,5,8,2,6,11};
	System.out.println("****** Merge In Place *******");
	printArray(data1);
	mergeInPlace(data1,0,4,7);
	printArray(data1);

	System.out.println("****** Merge  *******");
	printArray(data2);
	data2 = merge(data2,0,4,7);
	printArray(data2);
	

    }
    


}
