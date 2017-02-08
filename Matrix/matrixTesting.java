public class matrixTesting{

	static int [][] a = {	{90,80,70,0},
				{65,55,80,0},
				{80,90,100,0},
				{0,0,0,0}};
	static int [][] b = {	{9,8},
				{6,5}};
	static int [][] c = {	{9,8},
				{6,5}};
	
			
	public static void main(String args[]){
		test(a);
		printArray(a);
		testnums(a);
		printArray(a);
		printArray(b);
		printArray(add(b,c));
		printArray(transpose(a));
		
	
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
		int [][]c = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}				

	//Assume the matrix is NxN
	public static int[][] transpose(int[][] a){
		int length = a.length;
		for (int row = 0; row < length; row++){
			for (int col = row + 1; col < length; col++){
				int temp = a[col][row];
				a[col][row] = a[row][col];
				a[row][col] = temp;
			}
		}
		return a;
	}

	//Matrix is not null, no irregular  
	public static int[][] transposeAll(int[][] a){
		int[][] answer = int[a.length][a[0].length]
	}
		
}
















