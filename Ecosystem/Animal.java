public abstract class Animal implements Mover{

    // attributes
    protected Ecosystem _eco;
    protected int _pos;


    // constructror
    public Animal(Ecosystem eco, int pos){
	_eco = eco;
	_pos = pos;
	//	Animal [] river = eco.getRiver();
	//river[pos] = this;
	eco.getRiver()[pos] = this;
    }






}
