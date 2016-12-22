public class matrixTesting{

	static int [][] a = {	{90,80,70,0},
				{65,55,80,0},
				{80,90,100,0},
				{0,0,0,0}};
			
	public static void main(String args[]){
		test(a);
		printArray(a);
		testnums(a);
		printArray(a);
	
	}
	
	public static void printArray(int [][] array){
		for (int j = 0; j < array.length; j++){
			for (int k = 0; k < array.length; k++){
				System.out.print(array[j][k] + " ");
			}
		System.out.println();
		}

	}

	public static void test(int [][] array){
		for (int j = 0; j < array.length; j++){
			int average = 0;
			for (int k = 0; k < array[j].length - 1; k++){
				average += array[j][k];
			}
			average /= 3;
			array[j][3] = average;
		}
	}

	public static void testnums(int [][] array){
		for (int c = 0; c < array[0].length; c++){
			int average = 0;
			for (int r = 0; r < array.length - 1; r++){
				average += array[r][c];
			}
			average /= array.length - 1;
			array[3][c] = average;
		}
		
			
				
	}

	public static int[][] add(int [][] a, int [][]b){
		int [][]c = new int[a.length][a[0].length]
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				c[i][j] = a[i][j] + b[i][j];
			}
		}				
}
