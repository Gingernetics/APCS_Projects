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
	Node h = _tail;
	Node a = new Node(val);
	if (_head == null){
		_head = a;
		_tail = a;
	}
	else {
		while (h.getNext() != null) h = h.getNext();
		h.setNext(a);	
		_tail = a;
	}
	_size++;
	return true;
    }
/*
    // postcondition: inserts val at index
    //     O(n)          
    public boolean add(int index, String value){
	if (index < 0 || index > size())
		throw new IndexOutOfBoundsException("index < 0 || index > size()");
	Node h = _head;
	Node t = new Node(value);
	if(index == 0){
		t.setNext(h);
		_head = t;
		if(size() == 0) _tail = t;
		_size++;
	}
	else{
		for(int i = 0; i < size() - 1; i++)
			if(i + 1 == index){
				t.setNext(h.getNext());
				h.setNext(t);
				_size++;
				break;
			}
		h = h.getNext();
	}
	return true;
}
*/
    
    // postcondition: places val at position index; returns
    //                old value at the index.
    //                Throws an IndexOutOfBoundsException()
    public String set(int index, String val){
	if (index < 0 || index > size())
		throw new IndexOutOfBoundsException("index < 0 || index > size()");
	Node h = _head;
	for (int i = 0; i < index; i++)
		h = h.getNext();
 
	return h.getValue();
    }
    
    // postcondition: removes and returns the value stored at index.
    //                Throws an IndexOutOfBoundsException
    public String remove(int index){
	if (index < 0 || index > size())
		throw new IndexOutOfBoundsException("index < 0 || index > size()");
	Node h = _head;
	for (int i = 0; i < index - 1; i++)
		h = h.getNext();
	String temp = h.getNext().getValue();
	Node a = h.getNext().getNext();
	h.setNext(a);
	_size--;	
	return temp;
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
