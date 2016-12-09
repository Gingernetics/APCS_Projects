public class DataAnalysis {

	public static void main(String args[]){
		System.out.println(printHistogram(data, 20, "x"));
	}

	public static boolean isMode(int [] data, int k){			
		boolean ans = false;
		if (data[k].compareTo(data[k - 1]) > 0 && data[k].compareTo(data[k + 1]) > 0)
			ans = true;
		return ans;
	}

	public static int modeIndex(int[] data){
		int ans = 0;
		for( int i = 0; i < data.length; i++)
			if (isMode(data, i))
				ans = i;
	}

	
	public static void printHistogram(int[] data, int longestBar, String barChar){
		System.out.println("Index k     data[k] Length of bar Output of call");
		for(int k = 0; k < data.length; k++){
			int mode = data[modeIndex(int[] data)];
			int proportion = longestBar * data[k] / modeIndex(int[] data);
			System.out.println(k + "\t" + data[k] + "\t" + proportion + "\t" + barmaker(proportion);
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
