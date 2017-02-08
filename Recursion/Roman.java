public class Roman{
	private int _n; //n < 4000
	private String _value;

	public Roman(int n){
	    _n = n;
	    _value = numerals(n);
    }

    public static String numerals(int n){
    	int[] v = {1,5,10,50,100,500,1000};
	String[] d = {"I","V","X","L","C","D","M","TOO FAR"};
	if (n > 3999) return "Out of bounds";
	for (int i = 6; i >= 0; i--){
		if (n < v[i]){
			if (n + 1 == v[i]) return "I" + d[i] + numerals(n - v[i]) ;
			if (n + v[i - 1] == v[i]) return d[i - 1] + d[i] + numerals(n - v[i]) ;
			else continue;
		}
		if (n == v[i])
			return d[i];
		if (n > v[i]){
			return d[i] + numerals(n - v[i]);
		}
	}
	return "";
    }


    public String toString(){
	return _n + " : " + _value;
    }
    

    public static void main(String [] args){
	int n = 200;
	for (int i = 1; i < n; i++){
	    System.out.println(new Roman(i));
	}
    }

}
