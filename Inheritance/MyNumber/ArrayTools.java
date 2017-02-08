public class ArrayTools{

              

    */
    // post condition: returns the first occurrence of key in data
    public static int linearSearch(Object [] data, Object key){
	int pos = -1;
	for (int i = 0; i < data.length; i++){
	    if (key.equals(data[i])){
		pos = i;
		break;
	    }
	}
	return pos;
    }

    

    // part B
    // Note arrays are mutable
    public static void shuffle(Object [] data){
	for (int i = 0; i < data.length; i++){
	    int r = (int)(Math.random() * (data.length - i)) + i;
	    Object temp = data[i];
	    data[i] = data[r];
	    data[r] = temp;
	}
    }

    // should be N! equally likely outcomes
    // produces N^N outcomes
    //  N^N % N! != 0
    // ex. 3^3 % 3! = 27 % 6 = 3 thus upto 3 outcomes are overweighted
    public static void badShuffle(Object [] data){
	int r;
	for (int i = 0; i < data.length; i++){
	    r = (int)(Math.random() * data.length);
	    Object t = data[i];
	    data[i] = data[r];
	    data[r] = t;
	}
    }
    
   
    public static Object [] sample(Object[] data, int m){
	Object [] ans = new Object[m];
	boolean[] pos = new boolean[data.length]; // filled with false
	int i = 0;
	while (m > 0){
	    int r = (int)(Math.random() * data.length);
	    if (!pos[r] ){
		pos[r] = true;
		ans[i++] = data[r];
		m--;
	    }
	}
	return ans;
    }
    

    // part A
    public static void printArray(Object[] array){
	String ans = "";
	for (Object x : array){
	    ans += x + ", ";
	}
	if (ans.length() > 0)
	    ans = ans.substring(0,ans.length() - 2);
	System.out.println( ans);
    }

    // overloaded methods to accomodate primitive types
     
    public static void printArray(double[] array){
	String ans = "";
	for (double x : array){
	    ans += x + ", ";
	}
	if (ans.length() > 0)
	    ans = ans.substring(0,ans.length() - 2);
	System.out.println( ans);
    }
    public static void printArray(int[] array){
	String ans = "";
	for (int x : array){
	    ans += x + ", ";
	}
	if (ans.length() > 0)
	    ans = ans.substring(0,ans.length() - 2);
	System.out.println( ans);
    }
     public static void printArray(boolean[] array){
	String ans = "";
	for (boolean x : array){
	    ans += x + ", ";
	}
	if (ans.length() > 0)
	    ans = ans.substring(0,ans.length() - 2);
	System.out.println( ans);
    }
    
    

}
