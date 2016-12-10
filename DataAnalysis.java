public class DataAnalysis {

    //attributes
    private static int [] data = {2,3,2};
    //private static int [] data = {3,5,9,10,12,11,9,4};
    
	public static void main(String args[]){
		printHistogram(data, 9, "x");
	}

	public static boolean isMode(int [] data, int k){			
		boolean ans = false;
		if (data[k] > data[k - 1]  && data[k] > data[k + 1])
			ans = true;
		return ans;
	}

	public static int modeIndex(int[] data){
		int ans = 0;
		for(int i = 1; i < data.length - 1; i++)
			if (isMode(data, i)){
				ans = i;
			  break;
			}
	    return ans;
	}

	
	public static void printHistogram(int[] data, int longestBar, String barChar){
		System.out.println("Index k  \tdata[k]\tLength of bar \tOutput of call");
		for(int k = 0; k < data.length; k++){
			int mode = data[modeIndex(data)];
			int proportion = longestBar * data[k] / mode;
			System.out.println(k + "\t\t" + data[k] + "\t\t" + proportion + "\t" + barmaker(proportion));
		}
	}

	public static String barmaker(int num){
		String ans = "";
		for (int i = 0; i < num; i++){
			ans += "X";
		}
		return ans;
	}

}
