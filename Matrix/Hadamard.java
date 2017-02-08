public class Hadamard{

    private boolean [][] _mat;

    // precondition: n is a power of 2
    public Hadamard(int n){
	_mat = new boolean [n][n];
	build(n);			      
    }

    // precondition: n is a power of 2
    // postcondition: _mat is a n x n Hadamard matrix.
    public void build(int n){
	_mat[0][0] = true;
       	for (int i = 1; i < n; i *= 2)
	    enlarge(i);
	
    }
    
    // precondition: n is the current size of the Hadamard matrix
    // postcondition: builds a 2n x 2n Hadamard matrix
    public void enlarge(int n){
	int width = 2 * n;
	for (int i = 0; i < n; i++){
	    for (int j = 0; j < n; j++){
		_mat[i][j+n] = _mat[i][j];
		_mat[i + n][j] = _mat[i][j];
		_mat[i + n][j + n] = !_mat[i][j];
	    }
	}
    }

    
    // postcondition: prints the Hadamard matix
    //                using T for true, F for false.
    public String toString(){
	String ans = "";
	for (boolean[] row: _mat){
	    for (boolean a: row){
		if (a)
		    ans +=  "T ";
		else 		ans +=  "F ";
	    }
	    ans += "\n";
	}
	return ans;
    }
    
    public static void main(String [] args){
	int n = Integer.parseInt(args[0]);
	Hadamard h = new Hadamard(n);
	System.out.println(h);

    }


}
