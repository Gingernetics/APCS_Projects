public class MatrixMult{


    public static void print(int [] [] data){
	for (int[] row: data){
	    for (int i: row){
		System.out.print(i + " ");
	    }
	    System.out.println();
	}
    }


    // precondition: a != null, b != null, both a and b are
    //               square matrices.
    public static int[][] mult(int[][] a, int [][] b){
		int[][]ans = new int[a.length][a.length];
		for (int r = 0; r < a.length; r++){
	    		for (int c = 0; c < a.length; c++){
				for (int k = 0; k < n; k++){
					ans[r][c] += a[r][k] * b[k][c];
				}
				
			}
			
		}
		return ans;
    }
    
    

    public static void main(String [] args){
	int [] [] A  = {{1,2}, {3,4}};
	int [] [] B  = {{0,-1}, {5,2}};
	System.out.println("A: ");
	print(A);
	System.out.println("B: ");
	print(B);
	System.out.println("AA: ");
	print(mult(A,A));
	System.out.println("BB: ");
	print(mult(B,B));
	System.out.println("AB: ");
	print(mult(A,B));
	System.out.println("BA: ");
	print(mult(B,A));

	

    }
    

}
