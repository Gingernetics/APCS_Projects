public class SortTrialRuns{



    public static void main (String [] args){
	int N = Integer.parseInt(args[0]);
	int trials = Integer.parseInt(args[0]);
	
	System.out.println("*** Selection Sort ***");
       
	 SelectionSort ss = new SelectionSort();
	 for (int i = 2; i < Integer.MAX_VALUE; i*= 2)
	    ss.sort(i,trials);
	 ss.printStats();

	InsertionSort ii = new InsertionSort();
	 for (int i = 2; i < Integer.MAX_VALUE; i*= 2)
	    ii.sort(i,trials);
	 ii.printStats();

    }
    

}
