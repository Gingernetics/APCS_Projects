public class NumberApp{


    

    public static void main(String [] args){
	// read the size of the array
	int N = Integer.parseInt(args[0]);
	MyNumber [] nums = new MyNumber[N];

	// create N Binary, Octal, or Hexadecimals
	for (int i = 0; i < N; i++){
	    nums[i] = new Binary(i);
	}
	// print the array
	ArrayTools.printArray(nums);
	// shuffle the array
	ArrayTools.shuffle(nums);
	// print the array
	ArrayTools.printArray(nums);

	// search for a number
	MyNumber key = new Binary(N/2);
	int pos = ArrayTools.linearSearch(nums, key);
	System.out.println("index of " + key + " is " + pos);
       

	
    }    
    

}
