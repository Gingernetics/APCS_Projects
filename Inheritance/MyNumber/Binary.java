public class Binary extends MyNumber{


    private String _binary;

    // Constructor
    // pre : n >= 0
    public Binary(int n){
	super(n);
	if (n < 0) new IllegalArgumentException("must be nonnegative");
	_binary = convert();
    }
  
    // Accessor Methods
    public int getBase(){
	return 2;
    }

    public String getDigits(){
	return "01";
    }
    
    public String getValue(){
	return _binary;
    }

    // overwrite the equals method
    public boolean equals(Object rhs){
	return this == rhs || this.intValue() == ((Binary)rhs).intValue();
    }

    
}
