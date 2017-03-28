public class DLinkedList<E>{
    
    private DNode<E> _header, _trailer;  // dummy (sentinel) nodes
    private int _size;

    // constructor
    // instantiates an empty DLinkedList object
    public DLinkedList(){
	_header = new DNode(null, null, null);
	_trailer = new DNode(null, _header, null);
	_header.setNext(_trailer);
    }

    // accessor methods
    public int size(){
	return _size;
    }

    public boolean empty(){
	return _size == 0;
    }
    // returns true if v is not the header node
    public boolean hasPrevious(DNode<E> v){
	return v != _header;
    }
    // returns true if v is not the trailer node
    public boolean hasNext(DNode<E> v){
	return v != _trailer;
    }
    
    public DNode<E> getFirst(){
	if (empty()) throw new IllegalStateException("empty list");
	return _header.getNext();
    }

    public DNode<E> getLast(){
	if (empty()) throw new IllegalStateException("empty list");
	return _trailer.getPrevious();
    }


    public DNode<E> getPrevious(DNode <E> current){
	if (!hasPrevious(current))
	    throw new IllegalArgumentException("cannot move back past header");
	return current.getPrevious();
    }

    public DNode<E> getNext(DNode<E> current){
	if (!hasNext(current))
	    throw new IllegalArgumentException("cannot move forward past trailer");
	return current.getNext();

    }

    //*******************************************************************
    // inserts node a before node b. 
    // An exception is thrown if b is the header
    public void addBefore(DNode<E> b, DNode<E> a){
	if (b.equals(_header))
		throw new IllegalArgumentException("cannot add before header");
	DNode temp = b.getPrevious();
	a.setNext(b);
	a.setPrevious(temp);
	b.setPrevious(a);
	temp.setNext(a);
	_size++;
    }

    public void addLast(DNode<E> node){
	DNode temp = _trailer.getPrevious();
	temp.setNext(node);
	_trailer.setPrevious(node);
	node.setNext(_trailer);
	node.setPrevious(temp);
	_size++;
    }

    // Needed for the List interface.
    public void add(E value){
	DNode node = new DNode<E>(value,null,null);
        addLast(node);
    }


    //*******************************************************************
    // inserts node b after node a
    // throw exception if b is the trailer node
    public void addAfter(DNode<E> a, DNode<E> b){
	if (a.equals(_trailer))
		throw new IllegalArgumentException("cannot add after trailer");
	DNode temp = a.getNext();
	b.setNext(temp);
	temp.setPrevious(b);
	a.setNext(b);
	b.setPrevious(a);
	_size++;
    }


    public void addFirst(DNode current){
	DNode temp = _header.getNext();
	temp.setPrevious(current);
	current.setNext(temp);
	_header.setNext(current);
	current.setPrevious(_header);
	_size++;
    }

    public void addFirst(String value){
	DNode first = new DNode<E>(null, _header, _header.getNext());
	first.setValue(value);
	_header.getNext().setPrevious(first);
	_header.setNext(first);
	_size++;
    }


    //*******************************************************************
    public String get(int i){
	if (i < 0 || i >= size())
	    throw new IndexOutOfBoundsException("index < 0 || index >= size()");
	DNode iter = _header;
	for (int j = 0; j < i; j++)
		 iter = iter.getNext();
	return "" + iter.getValue();
    }

   
    public String toString(){
	String ans = "";
	DNode current = _header.getNext();
	while (current != _trailer){
	    ans += current.getValue() + ", ";
	    current = current.getNext();
	}
	int len = ans.length();
	if (len > 0) ans = ans.substring(0,len - 2);
	ans = "[" + ans + " ]";
	return ans;
    }

       


    public static void main(String [] args){
	    
    }

    }
