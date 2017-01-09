import java.util.List;
import java.util.ArrayList;

public class FooSet{

       // private instance variables declared here
       private List<String> _availableFoos;
       private int _fooLength;

       //Constructor  
       public FooSet(int len){
		_fooLength = len;
		_availableFoos = new ArrayList<String>();
			
	}
       

       // precondition : key != null
       // postcondition: Returns true if the string key, is found
       //                in the FooSet, false otherwise.
       public boolean found(String key){
              boolean ans = false;
		for (String x : _availableFoos){
			if ( x.equals(key)){
				ans = true;
			}
		}
		return ans;
       }

       // precondition: entry != null
       // postcondition: adds the string, entry, to FooSet if
       //                it is the correct length and not already
       //                in the FooSet. If the string is already
       //                in the FooSet or the string is not the 
       //                correct length, it is not added and false
       //                is returned.
       public boolean addFoo(String entry){ //Add to end, so it is a O(n) linear
           if (!found(entry) && entry.length() == _fooLength){
		int i = (int) (Math.random() * (_availableFoos.size() + 1));
		_availableFoos.add(i, entry);
	}
		return false;

       }

       // precondition: the FooSet is not empty.
       // postcondition: removes and returns a random
       //                string entry from FooSet.
       public String removeRandomFoo(){
       	      int i = (int) (Math.random() * _availableFoos.size());
		if(i != _availableFoos.size() - 1)
		return _availableFoos.set(i,_availableFoos.remove(_fooLength - 1));
		else
		return _availableFoos.remove(_availableFoos.size() - 1);
       }



       //postcondition: returns length of a foo.
       public int getLength(){
       	      return _fooLength;
       }

       // precondition: foos != null
       // postcondition : attempts to fill the FooSet
       //                 with the strings contained in foos
       public void fillFooSet(String [] foos){
       	    for(String x: foos)
		addFoo(x);
       }

	/*
	FooSet foos = new FooSet(3);
	String [] animals = {"cat", "dog", "ape"};
	foos.fill(animals)

	*/


       // postcondition: returns true if the set is empty;
       //               otherwise false.
       public boolean isEmpty(){
		if (_availableFoos.size() == 0)
			return true;
		else
			return false;
	}




       // postcondition: returns a string verison of
       //                _availableFoos with [] replaced with {}.
       //              Ex. [] -> {}
       //                  [cat,dog,ape] = {cat,dog,ape}
       public String toString(){
        	return _availableFoos + "";
       }

	public static void main(String [] args){
	int n = Integer.parseInt(args[0]);
	FooSet h = new FooSet(n);
	System.out.println(h);
	h.addFoo("cd");
	System.out.println(h);
	h.addFoo("yj");
	System.out.println(h);
	h.addFoo("cdrt");
	System.out.println(h);
	

    }


}

