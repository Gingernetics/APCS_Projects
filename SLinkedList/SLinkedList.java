public class SLinkedList implements List{

    // private attributes
    private Node _head, _tail; // _head refers to first node, _tail the last
    private int _size;  // # of elements in the list


    // Constructors
    public SLinkedList(){
	_head = _tail = null;
	_size = 0;
    }
    


    // ************  Accessors Methods *************************
    /* satisfies  List interface requirements */
    // 
    public String get(int index){
	if (index < 0 || index >= size())
	    throw new IndexOutOfBoundsException("index < 0 || index >= size()");
	return null;
    }

    public int size(){
	return _size;
    }
    
    // ************* Modifier Methods **************************
    /* required by List interface. */
    // postcondition: adds val to the end of the list
    public boolean add(String val){
	return true;
    }

    // postcondition: inserts val at index
    //               
    public void add(int index, String val){
	if (index > size() ) throw new IndexOutOfBoundsException("index > size + 1");
    }
    
    // postcondition: places val at position index; returns
    //                old value at the index.
    //                Throws an IndexOutOfBoundsException()
    public String set(int index, String val){
	return null;
	
    }
    
    // postcondition: removes and returns the value stored at index.
    //                Throws an IndexOutOfBoundsException
    public String remove(int index){
	return null;
    }


    // overwrite toString
    public String toString(){
        String ans = "";
        Node t = _head;
        while (t != null){
            ans += t.getValue() + ",";
            t = t.getNext();
        }
        // remove trailing comma
        if (ans.length() > 0) ans = ans.substring(0, ans.length() - 1);
        ans = "[" + ans + "]";
        return ans;
    }



    
}
