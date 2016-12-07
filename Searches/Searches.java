import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Searches{


    // precondition: words != null
    // postcondition: fills the words array with random words drawn from the input stream
    // How to use:
    //   First way enter strings and press Ctrl-D to exit
    //                      $java Searches
    //                      a b c d e Ctrl-D
    //   Second way : direct the input from a file
    //                      $java Searches < wordlist.txt
    //                      $java Searches < /usr/share/dict/american-english
    public static void fillRandom(String[] words){
	List<String> wordList = new ArrayList<String>();
	// fill wordList
	Scanner s = new Scanner(System.in);
	while (s.hasNext() && !(s.next().equals("exit"))){
	    wordList.add(s.next());
	}
	
	for (int i = 0; i < words.length; i++){
	    int r = (int)(Math.random() * wordList.size());
	    words[i] = wordList.get(r);
	}
	//	System.out.println(wordList);
    }
   
    // precondition: nums != null, low < high
    // postcondition: fills nums with random integers from low to high. [low,high).
    public static void fillRandom(Integer[] nums, int low, int high){
	for (int i = 0; i < nums.length; i++){
	    int r = (int)(Math.random() * (high - low)) + low;
	    nums[i] = r;
	}
    }
    // precondition: array != null
    // postcondition: returns -1 if key not in array; otherwise returns the index
    //                of the first occurrence of key
    public static int linearSearch(Object[] array, Object key){
	int ans = -1;
	for(int i = 0; i < array.length; i++){
	    if (array[i].equals(key)){
		ans = i;
		break;
	    }
	}
	return ans;
    }

    // precondition: data.length > 0
    // postcondition: returns a random Object
    public static Object oneOf(Object [] data){
	return data[(int)(Math.random() * data.length)];
    }
    
    // precondition: array != null
    // postcondition: prints the elements of the array seperated by commas.
    public static void printArray(Object [] array){
	String ans = "";
	for (Object x: array)
	    ans += x + ", ";
	// remove ending ,
	if (array.length > 0)
	    ans = ans.substring(0, ans.length() - 2);
	System.out.println(ans);
    }
    
    // precondition: array != null, array sorted in ascending order
    // postconditioin: returns the index of key in array; -1 if key not in array.
    // Note:                 
    // *AP Style of the Heading For a General Solution*
    // public static int binarySearch(Comparable[] array, Comparable key){}
    // This heading will compile however the compiler will produce a warning that this
    // is unsafe.
    // *In Practice this heading is used for a general solution*
    // This is a generic method. We will go over generics next semester.
    // You will not be test on generics.
    public static<T extends Comparable<? super T>> int binarySearch(T[] array, T key){
	int ans = -1;
	int lowerBound = 0, upperBound = array.length - 1;
	int middle;
	int comp;
	
	while (lowerBound <= upperBound){
	    middle = (lowerBound + upperBound) / 2;
	    comp = key.compareTo(array[middle]);
	    if (comp == 0){
		ans = middle;
		break;
	    }
	    else if (comp > 0){
		lowerBound = middle + 1;
	    }
	    else upperBound = middle - 1;
	}
	return ans;
    }


    
    public static void main(String [] args){
	// Randomize the size of the arrays
	int N = (int) (Math.random() * 10) + 1;


	// Instantiate the arrays
	String [] words = new String[N];
	Integer [] numbers = new Integer[N];

	// Initialize the arrays with random elements.
	System.out.println("************* Population ****************");
	System.out.println("Please input " + N + " elements, then type exit");
	fillRandom(words);
	fillRandom(numbers, 1, 10);

	// Print the initial ordering to the arrays.
	printArray(numbers);
	printArray(words);

	
	// Perform linear searches on arbitrary (unordered) arrays.
	System.out.println("******** Testing linear search **********");
	String keyS =(String) oneOf(words);
	int pos1 = linearSearch(words, keyS);
	System.out.println(keyS + " at index: " + pos1);

	Integer keyI =(Integer) oneOf(numbers);
	int pos2 = linearSearch(numbers, keyI);
	System.out.println(keyI + " at index: " + pos2);


	// sort(Object []) from the Array class
	Arrays.sort(words);
	Arrays.sort(numbers);

        // sorted arrays : sort the arrays in ascending order
	System.out.println("********** Sort the population **************");
	printArray(words);
	printArray(numbers);


	// binary searches
	System.out.println("********* Testing binary search **************");

	pos1  = binarySearch(words, keyS);
	System.out.println(keyS + " at index: " + pos1);
	keyS = "mmm";
       	pos1  = binarySearch(words, keyS);
	System.out.println(keyS + " at index: " + pos1);
	
	pos2  = binarySearch(numbers, keyI);
	System.out.println(keyI + " at index: " + pos2);
	keyI = -999;
	pos2  = binarySearch(numbers, keyI);
	System.out.println(keyI + " at index: " + pos2);
	
	
	
    }



    

}
