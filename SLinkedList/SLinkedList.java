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

//O(n)
    public SLinkedList append(SLinkedList L){
	SLinkedList ans = new SLinkedList();
	Node t = this._head;
	for(int i = 0; i < 2; i++){
		while (t != null){
			ans.add(t.getValue());//O(1)
			t = t.getNext();
		}
		t = L._head;
	}
	return ans;
}

	public Node getNode(int index){
		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException("index < 0 || index >= size()");
		Node curr = _head;
		while (index-- > 0)
			curr = curr.getNext();
		return curr;
	}
	
	// precondition: x and y refer to Nodes in the list
    	// postcondition: swaps the nodes (not the just the values)
	public void swap(Node x, Node y){ 
		if (x == y) return ;
		Node prevX = new Node(null, _head);
		while (prevX.getNext() != x && prevX.getNext() != y)
			prevX = prevX.getNext();
		Node temp;
		if (prevX.getNext() == y){
			temp = x;
			x = y;
			y = temp;
		}
		Node prevY = x;
		while (prevY.getNext() != y)
			prevY = prevY.getNext();
		if(_head == x) _head = y;
		if(_tail == y) _tail = x;
		prevX.setNext(y);
		prevY.setNext(x);
		Node afterY = y.getNext();
		y.setNext(x.getNext());
		x.setNext(afterY);
	}

	public Node reverse();
		if (_head == null || _head.getNext() == null) return;
		else 
		return this.getNext().reverse().setNext(_head);
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
