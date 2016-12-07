public class Searches{
	

	public static void main(String args[]){
		String [] data = {"a", "b", "c"};
		System.out.println(linearSearch(data, "c"));
		System.out.println(binarySearch(data, "c"));

	}
	
	//linearSearch(data, "b") --> 1
	//linearSearch(data, "e") --> -1
	//linearSearch(data, "c") --> 2


	//pre: data != null
	//post: returns -1 if key is not found in data, otherwise returns the index of the first occurance
	public static int linearSearch(String [] data, String key){
		int ans = -1;
		for (int i = 0; i < data.length; i++){
			if (data[i].equals(key)){
				ans = i;
				break;
			}
		}
				
		return ans;
	}

	//precondition: data != null, data is sorted in increasing (or decreasing) order "FOR THIS INCREASING"
	//postcondition: same as linear
	public static int binarySearch(String [] data, String key){
		int ans = -1;
		int length = data.length / 2;
		if (key.equals(data[length])){
			ans = i;
		}
		if (key.compareTo(data[i]) > 0){
			newdata = 
			binarySearch(String [] newdata, String key)
		}
		if (key.compareTo(data[i]) < 0){
			newdata = 
			binarySearch(String [] newdata, String key)
		}
		
		return ans;
				
	}


}
