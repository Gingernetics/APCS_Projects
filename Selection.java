public class Selection{
	
	//int [] data = {2,4,5,7,2,5};

	public static void main(String args[]){
		Integer [] data = {2,4,5,7,2,5};
		selectionSort(data);
	}
	
	public static int minPos( Integer [] data, int a, int b){
		int ans = 0;
		for(int i = 0; i < b; i++){
			if (data[i] < data[ans]){
				ans = i;
			}	
		}
		return ans;
	}

	public static void selectionSort(Integer [] data){
		for(int i = 0; i < data.length; i++){
			int a = minPos(data, i, data.length);
			int temp = data[i];
			data[i] = data[a];
			data[a] = temp;
			if (i + 1 == data.length - 1)
				break;
		}
		for (Integer x : data)
			System.out.println(x);
	}
}
