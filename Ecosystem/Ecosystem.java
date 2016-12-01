public class Ecosystem{

    // attributes
    private Animal [] _river;
    private int _populationSize;

    // constructor
    // precondition: numFish + numBear <= capacity
    // postconditon: all attributes are initialized
    //               numFish Fish and numBear Bear are
    //               instantiated and place into the _river.
    public Ecosystem(int capacity, int numFish, int numBear){
	_river = new Animal[capacity];
	_populationSize = numFish + numBear;
	while (numFish-- > 0){
	    new Fish(this, getRandomPos());
		_populationSize += 1;
	}
	while (numBear-- > 0){
	    new Bear(this, getRandomPos());
		_populationSize += 1;
	}
    }
    
    // accessor methods
    public Animal[] getRiver(){
	return _river;
    }
    // precondition: _river != null
    // postcondition: returns true if _river cannot recieve a new
    //                Animal; otherwise false.
    public boolean isFull(){
	return _river.length == _populationSize;
    }
    
    // precondition: _river != null
    // postcondtion: return -1 if the _river is full.
    //               returns a random open position within
    //               _river
    public int getRandomPos(){
	int ans;
	if (isFull()) ans = -1;
	else{
	    int N = _river.length - _populationSize;
	    int [] openPos = new int[N];
	    int j = N;
	    for (int i = 0; i < _river.length && j > 0 ; i++){
		if (_river[i] == null)
		    openPos[--j] = i;
	     }
	    ans = openPos[(int)(Math.random() * N)];
	}
	    return ans;
    }
    // version 2 : does not use an auxiliary data structure.
    public int getRandomPos_V2(){
	int ans;
	if (isFull()) ans = -1;
	else {
	    // openPositions > 0
	    int openPositions = _river.length - _populationSize;
	    int nthOpen = (int)(Math.random() * openPositions);
	    int n = 0;
	    // nthOpen <= _river.length
	    for (int i = 0; n < nthOpen; i++){
		if (_river[i] == null) n++;
	    }
	    ans = n;
	}
	return ans;
    }

    
    // stub - to be completed later
    // precondition: All animals can move.
    // postcondition: Each animal in the river makes exactly one attempt
    //                to move.
	
    public void step(){
	Animal [] Animals = new Animal [_populationSize];
	int t = 0;
	for (int i = 0; i < _river.length; i++){
		Animal element = _river[i];
		if (element != null){
			Animals[t] = element;
			t++;
		}
	}
	for (Animal x : Animals){
            if (x != null)
                x.move();
        }     
			
                    
    }
	/*
	 //Buggy code, goes over what it already moved
	public void step(){
	Animal [] Animals = new Animal [_populationSize];
	int i = 0;
        for (Animal x : _river){
            if (x != null)
                x.move();
        }            
    }*/

    
    // postcondtion: return the state of the river
    //   a Bear is represented by B, F for fish
    //   ex. |  B   F F   B  F |
    // represents a ecosystem with 3 fish, 2 bears
    // and the length of the river is 17. 
    public String toString(){
	String ans = "|";
	for (Animal a : _river)
	    if (a != null) ans += a;
	    else ans += "-";
	ans += "|";
	return ans;
    }


    
    
}
