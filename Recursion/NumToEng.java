public class NumToEng{

    private String _eng;
    private int _n;

    public NumToEng(int n){
	_n = n;
	_eng = convert(n);
    }

    // precondition: 0 <= n < 10
    public static String digits(int n){
	String[] d = {"zero","one","two","three","four",
		      "five", "six","seven", "eight", "nine"};
	return d[n];
    }

 // precondition: 0 <= n < 10
    public static String teens(int n){
	String[] d = {"ten","eleven","twelve","thirteen","fourteen","fifteen",
		      "sixteen", "seventeen","eighteen", "nineteen", "twenty"};
	return d[n];
    }
    
 // precondition: 0 <= n < 10
    public static String tens(int n){
	String[] d = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	return d[n];
    }

	

    // precondition : 0 <= n < 10
    public static String convert(int n){
	if ( n < 10) return digits(n);
	if (n < 20) return teens(n - 10 );
	if (n % 10 == 0 && n < 100) return tens(n /10) ;
	if (n < 100) return tens(n / 10) + "-" + convert(n % 10);
	if (n < 1000) return digits(n / 100) + " hundred " + convert(n % 100);
	if (n < 1000000) return convert(n / 1000) + " thousand " + convert(n % 1000);
	if (n < 1000000000) return convert(n / 1000000) + " million" + convert(n % 1000000);
	return "DONE";
    }

    public String toString(){
	return _n + " : " + _eng;
    }
    

    public static void main(String [] args){
	int n = Integer.MAX_VALUE;
	for (int i = 0; i < n; i++){
	    System.out.println(new NumToEng(i));
	}
    }

}
