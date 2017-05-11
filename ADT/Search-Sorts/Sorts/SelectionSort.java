public class SelectionSort extends Sort{


    public SelectionSort(Integer[] data){
	super(data);
    }
    
    public SelectionSort(){
	super();
    }

    public void sort(){
	_watch.start();
	selectionSort(_data);
	_watch.stop();

    }

    // pre: data != null, data.length > 0, a < b, a and b-1 are in bounds
    // post : returns the position of the minimal value found
    //        between [a,b).
    private  int minPos(Integer [] data, int a, int b){
	int ans = a;
	for (int i = a + 1; i < b; i++){
	    if (data[ans] > data[i])
		ans = i;
	    _numComparisons++;
	}
	return ans;
    }

    // precondition: data != null
    // postcondition: data is sorted in ascending order.
    private  void selectionSort(Integer [] data){
	for (int i = 0; i < data.length - 1; i++){
	    int a = minPos(data,i, data.length);
	    Integer temp = data[a];
	    data[a] = data[i];
	    data[i] = temp;
	    _numPasses++;
	    _numSwaps++;
	}
    }

}
