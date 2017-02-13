import java.util.List;
import java.util.ArrayList;

public class MergeList{

    // precondition: aLow <= bLow and bLow <= bHigh
    //               the data within [aLow, bLow) is sorted in ascending order
    //               the data within [bLow, bHigh) is sorted in ascending order
    // postcondtion : Without using any additional data structure
    //                the data within [aLow, bHigh) is sorted in ascending order
    public static void mergeInPlace(List<Integer> data, int aLow, int bLow, int bHigh){
           while (bLow < bHigh){
		int i = bLow;
		while(i > aLow && data.get(i - 1) > data.get(i)){
			int temp = data.get(i);
			data.set(i, data.get(i - 1));
			data.set(i, temp);
			i--;
		}
		bLow++;
	}
    }

/*
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
*/
    
	// precondtion: aLow <= bLow, bLow <= bHigh
	//              the data within [aLow, bLow) is sorted in ascending order
	//              the data within [bLow, bHigh) is sorted in ascending order
	// postcondition: return of copy of the data in ascending order
	//public static List<Integer> merge(List<Integer> data, int aLow, int bLow, int bHigh){
	  // your code goes here
	//}
/*
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
*/
	public static void main(String [] args){
	    int[] d = {1,3,5,8,2,6,11};
	    List<Integer> data1 = new ArrayList<Integer>();
	    List<Integer> data2 = new ArrayList<Integer>();
	    for (int x : d){
		data1.add(x);
		data2.add(x);
	    }
	
	    System.out.println("****** Merge In Place *******");
	    System.out.println(data1);
	    mergeInPlace(data1,0,4,7);
	    System.out.println(data1);
/*
	    System.out.println("****** Merge  *******");
	    System.out.println(data2);
	    data2 = merge(data2,0,4,7);
	    System.out.println(data2);
	*/

	}
    


    }
