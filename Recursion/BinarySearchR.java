public class BinarySearchR{


    public static void printArray(int [] x){
	for (int t : x)
	    System.out.print(t + " ");
	System.out.println();
    }
    

    // precondition: x != null
    // postcodition : return the index of key or -1 if not found
    public static int binarySearchR(int [] x, int key){
	return binarySearchHelper(x, key, 0, x.length);
    }

    // precondition: x != null
    // postcondition: returns the index of key within the index positions [low, high)
    //                or -1 if not found
    public static int binarySearchHelper(int[] x, int key , int low, int high){
		int middle = low + (high - low) / 2;
		if (key == x[middle]) return middle;
        if(low != high){
		    if (key > x[middle]) return binarySearchHelper(x, key, middle + 1, x.length);
	        else return binarySearchHelper(x, key, 0, middle);
			}
		else return -1;
    }
    

    public static void main(String [] args){
	int [] array = {0,2,4,6,8,10,12};
	printArray(array);
	
	for(int key = -1; key < 11; key++){
	    System.out.println(key + " at " + binarySearchR(array,key));
	}

    }

    

}
