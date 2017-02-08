public class Roman{
	private int _n; //n < 4000
	private String _value;

	public Roman(int n){
	    _n = n;
	    _value = convert(n);
    }

    public static String onetofive(int n){
    //int[] v = {1,5,10,50,100,500,1000};
	//String[] d = {"I","V","X","L","C","D","M"};
	String[] d = {"I","II","III","IV","V"};
	if (n > 4000) return "Out of bounds";
	return d[n];
    }
    
    public static String numerals(int n){
    //int[] v = {1,5,10,50,100,500,1000};
	//String[] d = {"I","V","X","L","C","D","M"};
	String[] d = {"I","II","III","IV","V","D","M"};
	if (n > 999) return "Out of bounds";
	if 
	return d[n];
    }


    public static String convert(int n){
	if ( n < 5) return onetofive(n);
    
	return "DONE";
    }

    public String toString(){
	return _n + " : " + _eng;
    }
    

    public static void main(String [] args){
	int n = 20;
	for (int i = 0; i < n; i++){
	    System.out.println(new NumToEng(i));
	}
    }

}
