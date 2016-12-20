public abstract class Sort{
    /* sorts an array of integers and maintains statistics for the sort.
     * statistics maintained:
     *  number of passes
     *  number of comparisons
     *  number of swaps
     *  data size
     *  time 
     *
     * expected subclasses: SelectionSort, InsertionSort, BubbleSort,
     * ModifiedBubbleSort
     */
    protected int _numPasses, _numComparisons, _numSwaps, _size;
    protected StopWatch _watch;
    protected Integer[] _data;
    
    // constructors
    // postcondtion: all integer variables set to 0,
    //               _watch initialized
    //              _data get data
    public Sort(Integer[] data){
	_numPasses = _numComparisons = _numSwaps = 0;
	_watch = new StopWatch();
	_data = data;
	if (data != null)
	    _size = data.length;
	else
	    _size = 0;
    }

    // overloaded constructor
    // postcondition: same as Sort(Integer[]) except _data gets null.
    public Sort(){
	this(null);
    }


    // abstract method:
    // postcondition: starts the watch, sorts the data, all statistics
    //                are captured, stops the watch.
    public abstract void sort();


    // precondition: data size is N and trials > 0
    // postcondition: creates random data size N,
    //                sorts the data, then computes
    //                the average time to sort 
    public void sort(int N, int trials){
	double avg = 0.0;
	double sum = 0.0;
	_data = new Integer[N];
	for (int i = 0; i < trials; i++){
	    for (int j = 0; j < N; j++){
		_data[j] = (int)(Math.random() * Integer.MAX_VALUE);
	    }
	    sort();
	    sum += _watch.getElapsedTime();
	}
	avg = sum / trials;
	System.out.println("Size : " + N + " time: " + avg);
    }


    // postcondition: prints the order of _data
    public void printData(){
	String ans = "";
	for (Integer x: _data){
	    ans += x + ", ";
	}
	if (_data.length > 0) ans = ans.substring(0,ans.length() - 2);
	System.out.println(ans);
    }
   
    // postcondtion: prints the statistics of the Sort.
    public void  printStats(){
	System.out.println("Data size: " + _size);
	System.out.println("# passes: " + _numPasses);
	System.out.println("# comparisons: " + _numComparisons);
	System.out.println("# swaps: " + _numSwaps);
	System.out.println("# time: " + _watch.getElapsedTime() + " ms");
    }	

}
