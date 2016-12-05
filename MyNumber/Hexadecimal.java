public class Hexadecimal extends MyNumber{


    private String _hexadecimal;
    

    // pre : n >= 0
    public Hexadecimal(int n){
	super(n);
	if (n < 0) throw new IllegalArgumentException("arg must be nonnegative");
	_hexadecimal = convert();
    }
    
    // Accessor Methods
    public int getBase(){
	return 16;
    }

    public String getDigits(){
	return "0123456789ABCDEF";
    }
    

    public String getValue(){
	return "0x" + _hexadecimal;
    }

}
