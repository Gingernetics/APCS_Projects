public class InsertionSort extends Sort{


    public InsertionSort(Integer[] data){
	super(data);
    }
    
    public InsertionSort(){
	super();
    }

    public void sort(){
	_watch.start();
	insertionSort(_data);
	_watch.stop();

    }

	public void insertionSort(Integer [] data){
		for (int i = 0; i < data.length; i++)
			walkDown(data, i);
	}

	public static void walkDown(Integer [] data, int a){
		for (int i = a; i > 0; i--){
			if (data[i - 1] > data [i]){
				int temp = data[i - 1];
				data[i - 1] = data[i];
				data[i] = temp;
				}
			else break;
		}

	}


}
