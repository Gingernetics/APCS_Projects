public class SortStats{

    // precondition: n >= 0
    // postcondition: creates and returns an integer array of size n
    //                ans[i] = i
    //  ex. makeSample(3) -> [0,1,2]
    public static Integer[] makeSample(int n){
	Integer[] ans = new Integer[n];
	for (int i = 0; i < n ; ++i)
	    ans[i] = i;
	return ans;
    }

    //precondition: array != null
    // postcondition: shuffles the array in place
    public static void shuffle(Integer[] array){
	int n = array.length;
	for (int i = 0; i < n; i++){
	    int r = (int) (Math.random() * (n - i)) + i; 
	    Integer temp = array[i];
	    array[i] = array[r];
	    array[r] = temp;
	}
    }


    public static void main (String [] args){
	int N = Integer.parseInt(args[0]);
       	Integer[]  sample_1 = makeSample(N);
	Integer[]  sample_2 = makeSample(N);
	shuffle(sample_1);

	
	System.out.println("*** Selection Sort ***");
       
	 SelectionSort ss = new SelectionSort(sample_1);
	 ss.printData();
	 ss.sort();
	 ss.printData();
	 ss.printStats();

	 InsertionSort ii = new InsertionSort(sample_2);
	 ii.printData();
	 ii.sort();
	 ii.printData();
	 ii.printStats();

    }
    

}
