public class DLinkedList<E> {
    
    private DNode<E> _header, _trailer;  // dummy (sentinel) nodes
    private int _size;

    // constructor
    // instantiates an empty DLinkedList object
    public DLinkedList(){
	_header = new DNode<E>(null, null, null);
	_trailer = new DNode<E>(null,_header, null);
	_header.setNext(_trailer);
	_size  = 0;
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
	DNode<E> prevB = getPrevious(b); // throws exception
	prevB.setNext(a);
	a.setNext(b);
	a.setPrevious(prevB);
	b.setPrevious(a);
	_size++;
    }

    public void addLast(DNode<E> node){
	addBefore(_trailer, node);
    }

    // Needed for the List interface.
    public void add(E value){
	addLast(new DNode<E>(value,null,null));
    }

    public void add(int index, E val){
	if (index < 0 || index >= size())
	    throw new IndexOutOfBoundsException("i : " + index + "index < 0 || index >= size()");
	addBefore(getNode(index), new DNode(val, null, null));
	}


    //************* HW ******************************************************
    // inserts node b after node a
    // throw exception if b is the trailer node
    public void addAfter(DNode<E> a, DNode<E> b){
	DNode<E> afterA = getNext(a);
	a.setNext(b);
	b.setPrevious(a);
	afterA.setPrevious(b);
	b.setNext(afterA);
	_size++;
    }


    public void addFirst(DNode<E> current){
	addAfter(_header,current);
    }

    public void addFirst(E value){
	addFirst(new DNode<E>(value,null,null));
    }


    //*************************************************************
    // post: returns the (i+1)th DNode of the DLinkedList.
    //       Start at the _header when (i+1) is in the first half off
    //       the list; otherwise start at _trailer.
    public DNode<E> getNode(int i){
	if (i < 0 || i >= size())
	    throw new IndexOutOfBoundsException("i : " + i + "index < 0 || index >= size()");
        DNode<E> current = null;
        if ( i < size() / 2){
            current = _header;  
            for (int j = 0; j <= i ; j++){
                current = current.getNext();
                //System.out.print("h");
            }
        }
        else{
            current = _trailer;
            for (int j = 0; j < size() - i; j++){
                current = current.getPrevious();
                //System.out.print("t");
            }
        }
        return current;

    }
    // post: returns the value stored at the (i+1)th DNode.
    public E get(int i){
	if (i < 0 || i >= size())
	    throw new IndexOutOfBoundsException("i : " + i + "index < 0 || index >= size()");
	return getNode(i).getValue();
    }
    //****************************************************************
    // post: sets the value of the (i+1)th DNode to obj then returns
    //       the old value stored at the index.
    public  E set(int index, E obj){
	DNode<E> temp = getNode(index);
        return temp.setValue(obj);

    }

    
    //*******************************************************************
    //precondition: v != null and is a node in the list
    //postconditon: removes the DNode which v refers to.
    //              Throws exception if v is header or trailer.
    public void remove(DNode<E> v){
        if (v.equals(_header) || v.equals(_trailer))
		throw new IllegalArgumentException("Can't remove dummy nodes");
	DNode <E> prev = v.getPrevious();
	DNode <E> next = v.getNext();
	prev.setNext(next);
	next.setPrevious(prev);
	v.setNext(null);
	v.setPrevious(null);
    }

    // postcondition: removes the 1st DNode and returns the value stored
    //                in the removed DNode
    public E removeFirst(){
	DNode <E> temp = _header.getNext();
	remove(temp);
	return temp.getValue();
    }

    // postcondition: removes the last DNode and returns the value stored
    //                in the removed DNode
    public E removeLast(){
        DNode <E> temp = _trailer.getPrevious();
	remove(temp);
	return temp.getValue();
    }
    // postcondtion: removes the (i+1)th value from the DNode
    public E remove(int i){
	if (i < 0 || i >= size())
	    throw new IndexOutOfBoundsException("i < 0 || i >= size");
	DNode <E> temp = getNode(i);
	remove(temp);
	return temp.getValue();	
    }

    public void takeAll(DLinkedList source, DLinkedList output){

    }
    

    //*******************************************************************   
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
	DLinkedList<Integer> L = new DLinkedList<Integer>();
	System.out.println("*********testing  add **************");
        System.out.println("L : " + L);
        for (int i = 0; i < 5; i++){
            L.add(i);
            System.out.println("add " + i + " : " + L);
        }

	System.out.println("*********testing  addFirst **************");
	for (int i = -1; i > -5; i--){
            L.addFirst(i);
            System.out.println("addFirst " + i + " : " + L);
        }

	
	System.out.println("*********testing  get **************");
	for(int i = 0; i < 9; i++){
	    System.out.println("get " + i + " : " + L.get(i));
	}

	System.out.println("*********testing  set **************");
	System.out.println("L : " + L);
        for (int i = 0; i < L.size(); i++){
	    int r = (int)(Math.random() * (L.size() - i)) + i;
	    System.out.println("swap " + L.get(i)  + " and " + L.get(r));
	    L.set(i, L.set(r,L.get(i)));
	    System.out.println("L : " + L);
	}
	
	
	System.out.println("*********testing  remove **************");
	int i;
	System.out.println("L : " + L);
        while (!L.empty()){
	    i = (int)(Math.random() * L.size());
	    System.out.println("remove " + i + " : " + L.remove(i));
	    System.out.println("L : " + L);
	}
	
    }

    }
