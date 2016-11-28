/*public class ArrayTools{

	public static void main(String args[]){
		int N = 4;
      		MyNumber[] nums = new MyNumber[N];
      		for (int i = 0; i < N; i++)
      	  		nums[i] = i;
      		ArrayTools.printArray(nums);
	}

	public static String printArray(MyNumber[] nums){
		for (MyNumber x : nums)
			System.out.println(x);
		return "";
	}

	//This can take int, double, of boolean arrays
}


 Example with int, as I am having trouble getting MyNumber to work */

public class ArrayTools{

	public static void main(String args[]){
		int N = 10;
      		int[] nums = new int[N];
      		for (int i = 0; i < N; i++)
      	  		nums[i] = i;
      		ArrayTools.printArray(nums);
		System.out.println(ArrayTools.linearSearch(nums, 6));
	}

	public static String printArray(int[] nums){
		int i = 0;
		for (int x : nums){
			if (i != (nums.length - 1))
				System.out.print(x + ", ");
			else
				System.out.println(x);
			i++;
		}
		return "";
	}

	/*public static void shuffleArray(int[] nums){
		int n = array.length;
		for (int i = 0; i < (n - 1); i++){
			int r = i + (int) (Math.random() * (n - i));
			int rElement = array[r];
			array[r] = array[i];
			array[i] = rElement;
		}

	}*/

	public static int linearSearch(int [] data, int key){
		int i = 0;
		for (int x : data){
			if (x == key)
				return i; 
			i++;
		}
		return -1;
	}

	//This can take int, double, of boolean arrays
}


