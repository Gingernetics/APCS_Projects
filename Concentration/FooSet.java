import java.util.List;
import java.util.ArrayList;


public class FooSet{

    // private attributes
    private List<String> _availableFoos;
    private int _fooLength;


    // constructor
    public FooSet(int length){
	_availableFoos = new ArrayList<String>();
	_fooLength = length;
    }
    
    // O(n) where n is the size of the _availableFoos.
    public boolean found(String key){
	boolean ans = false;
	for (String x : _availableFoos){
	    if (x.equals(key)){
		ans = true;
		break;
	    }
	}
	return ans;
    }

    // O(n) where n is the size of the _availableFoos.
    public boolean addFoo(String entry){
	if (entry.length() == getFooLength() && !found(entry))
	    return _availableFoos.add(entry);
	return false;
    }

    // O(1)
    public String removeRandomFoo(){
	int i = (int)(Math.random() * _availableFoos.size());
	List<String> L = _availableFoos;
	// swap the last item and the item at index i
	L.set(i,L.set(L.size() - 1, L.get(i)));
	return L.remove(L.size() - 1);
    }
    
    
    // accessor method
    // O(1)
    public int getFooLength(){
	return _fooLength;
    }

    // O(1)
    public boolean isEmpty(){
	return _availableFoos.size() == 0;
    }
    // *** O(n*n) where n is the maximum of list.length
    // ***        and _availableFoos.size().
    // precondition : list != null
    // postcondtion: attempts to add all the items in list to
    //               the FooSet.
    public void fillFooSet(String [] list){
	for (String s : list)
	    addFoo(s); 
    }

    
    public String toString(){
	return _availableFoos.toString();
    }



    
    public static void main(String [] args){
	FooSet foos = new FooSet(3);
	System.out.println(foos);
	foos.addFoo("cat");
	foos.addFoo("dog");
	foos.addFoo("cow");
	foos.addFoo("ape");
	foos.addFoo("gorilla");
	foos.addFoo("dog");
	System.out.println(foos);
	while (! foos.isEmpty())
	    System.out.println(foos.removeRandomFoo());
    }

}
