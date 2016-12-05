public abstract class MyNumber{

    // attribute
    private int _intValue;

    // constructor
    public MyNumber(int n){
	_intValue = n;
    }

    // accessor methods
    public  int intValue(){
	return _intValue;
    }
    
    public double doubleValue(){
	return (double) _intValue;
    }

    //  HOMEWORK
    /* postcondition: converts an integer to its representation in
       the base returned by getBase().
       Binary b = new Binary(5);
       b.convert() -> "101"
       Octal oct = new Octal(13);
       oct.convert() -> "15"
       Hexadecimal hex = new Hexadecimal(33);
       hex.convert() -> "21" 
    */
    public  String convert(){
	int n = intValue();
        String ans = "";
        int base = getBase();
        String digits = getDigits();
        if ( n == 0) ans = digits.substring(0,1);
        while ( n > 0){
            int r = n % base;
            ans = digits.substring(r,r+1)  + ans;
            n /= base;
        }
        return ans;
    }

    public String toString(){
	return getValue();
    }

    
    // Abstract methods
    // post: returns the base of a number
    public abstract int getBase();
    // post: returns the digits of a number
    //   ex. "01" for Binary
    //       "01234567" for Octals
    //       "0123456789ABCDEF"
    public abstract String getDigits();
    // post: returns the value of the number represented in its base
    public abstract String getValue();
}
