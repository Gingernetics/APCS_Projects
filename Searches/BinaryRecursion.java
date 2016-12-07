public class Searches{
	

	public static void main(String args[]){
		String [] data = {"a", "b", "c", "d", "e", "f", "g", "h"};
		//System.out.println(linearSearch(data, "g"));
		//System.out.println(linearSearch(data, "b"));
		//System.out.println(linearSearch(data, "r"));
		System.out.println(binarySearch(data, "a"));
		System.out.println(binarySearch(data, "b"));
		System.out.println(binarySearch(data, "c"));
		System.out.println(binarySearch(data, "d"));
		System.out.println(binarySearch(data, "e"));
		System.out.println(binarySearch(data, "f"));
		System.out.println(binarySearch(data, "g"));
		System.out.println(binarySearch(data, "h"));
		//System.out.println(binarySearch(data, "r"));

	}

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
		if (data.length == 0)
			return -1;
		if (key.equals(data[length])){
			ans = length;
		}
		if (key.compareTo(data[length]) > 0){
			String [] newdata = new String[length - 1];
			for (int i = length; i < (data.length - 1); i++)
			    newdata[i - length] = data[i + 1];
			return binarySearch(newdata, key) + length + 1;
		}
		if (key.compareTo(data[length]) < 0){
		    String [] newdata = new String[length - 1];
			for (int i = 0; i < (length - 1); i++)
			    newdata[i] = data[i];
			return binarySearch(newdata,  key);
		}
		
		return ans;
				
	}


}
