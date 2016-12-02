public class SkiJumper extends Athlete{

	private int _numofjumps;
	
	public SkiJumper (String first, String last){
		super(first, last);
		_hours = 0;	
	}

	public void fly(){
		_numofjumps++;
	}

	public int getJumps(){
		return _numofjumps;
	}
	
	public void train(double time){
		_hours += time;
	}

	


}
