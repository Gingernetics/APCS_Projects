public class Bear extends Animal{


    // constructor
    public Bear (Ecosystem eco, int pos){
	super(eco,pos);
    }

    // override 
    public String toString(){
	return "B";
    }

    public void move()  {
        int Movement = ((int) (Math.random() * 3)) - 1; //[-1,1]
        int newPos = _pos + Movement;
        if ((newPos >= 0 && newPos < _eco.getRiver().length) && _eco.getRiver()[newPos] == null){
                _eco.getRiver()[newPos] = this;
                _eco.getRiver()[_pos] = null;
                _pos = newPos;
        }
        
    }


}
