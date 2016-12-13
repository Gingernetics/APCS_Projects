public class Insertion{
	public static void main(String args[]){
		Integer [] data = {6,3,5,76,4,5};
		walkDown(data, 5);

	}

	public void InsertionSort(Integer [] data){
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

		for (Integer x : data)
			System.out.println(x);
	}
}
