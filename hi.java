public class hi{

	public static void main(String args[]){
		int[] numbers = {3};
		int integer = 9;
		String num = "934";
		change1(numbers);
		change2(integer);
		change3(num);
		System.out.println(numbers[0]);
		System.out.println(integer);
		System.out.println(num);
	}

	public static void change1(int[] numbers){
		numbers[0] = 1;
	}

	public static void change2(int integer){
		integer = 4;
	}

	public static void change3(String num){
		num = "Hello";
	}
}
