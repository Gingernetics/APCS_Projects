public class Hadamard{

      	private static boolean [][] _mat;
	

       	// constructor
       	// precondition : n is a power of 2
       	public static void Hadamard(int n){
		int pow = (int) java.lang.Math.pow(2,n);
       		_mat = new boolean[pow][pow];
		filler(n - 1);		
       	}

       	// postcondition: prints the Hadamard matrix
       	//                use T for true, F for false
       	//public String toString(){
	public static void print(){
		int n = _mat.length;
		for(int row = 0; row < n; row++){
			for(int col = 0; col < n; col++){
				System.out.print(converter(_mat[row][col]) + " ");
			}
			System.out.println();
		}
       	}

	public static void filler(int n){
		_mat[0][0] = true;
		for (int i = 0; i <= n; i++){
			int step = (int) java.lang.Math.pow(2,i);
			for(int row = 0; row < step; row++){
				for(int col = step - 1; col < step; col++){
					_mat[row][col] = _mat[row][col - step + 1];
				}
			}	
		
		}

	}

	public static String converter(boolean value){
		if (value)
			return "T";
		else
			return "F";
	}

	public static void main(String args[]){
		Hadamard(2);
		print();
	}


}
