public class SkiJumper extends Athlete implements Flier, Comparable<SkiJumper>{


    // attributes
    private int _numJumps;

    // constructor
    public SkiJumper(String first, String last){
	super(first, last);
	_numJumps = 0;
    }

    // accessor methods
    public int getJumps(){
	return _numJumps;
    }

    // modifier methods 
    public void fly(){
	_numJumps++;
    }

    public void train(double session){
	setHoursTrained(getHoursTrained() + session);

    }

    

    // override
    public String toString(){
	String ans = super.toString();
	ans += " # jumps: " + _numJumps;
	return ans;
    }

    public int compareTo(SkiJumper other){
	return this.getJumps() - other.getJumps();
    }
    
    
}
