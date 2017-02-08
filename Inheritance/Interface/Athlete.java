public abstract class Athlete implements Trainable{

	protected String _first;
	protected String _last;
    	protected int _hours;

	public double getHoursTrained(){
		return _hours;
	}

	public double setHoursTrained(double newSession){
		return _hours += newSession;
	}

	public Athlete( String first, String last){
		_first = first;
		_last = last;
		_hours = 0;
		
	}

	public String toString(){
	return _last + ", " + _first + " | Hours Trained: " + _hours;
	}

}
