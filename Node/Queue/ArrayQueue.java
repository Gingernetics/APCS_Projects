public class ArrayQueue<E> implements Queue<E>{

    private E[] _queue;
    private int _head, _tail; //indexes for head, tail position
    private int _size;
    private final int _max;

    // constructor 
    public ArrayQueue(int n){
	_queue = (E[]) new Object[n];
	_max = n;
	_size = 0;
	_head = _tail = 0;
    }


    public int size() {
	return _size;
    }

    public boolean empty(){
	return size() == 0;
    }

    public E front() throws EmptyQueueException{
	if (_size == 0) 
		throw new EmptyQueueException("No elements in queue");
    	return _queue[_head];
    }

    public E dequeue() throws EmptyQueueException{
	if (_size == 0) 
		throw new EmptyQueueException("No elements in queue");
	E oldHead = _queue[_head];
	_queue[_head] = null;
	if (_head + 1 == _max) _head = 0;
	else _head++;
	_size--;
	return oldHead;
    }

    public void enqueue(E value) throws FullQueueException{
	if (_size == _max) 
		throw new FullQueueException("Queue is full");
	_queue[_tail] = value;
	if(_tail + 1 == _max) _tail = 0;
	else _tail++;
	_size++;
    }

    public boolean isFull(){
	return _size == _max;
    }

    public String toString(){
	String ans = "[";
	if (size() > 0) ans += _queue[_head];
	if (size() > 1){
	    int i = 0;
	    if (_head + 1 == _max) i = 0;
	    i = _head + 1;
	    while (i != _tail){
		ans += ", "  + _queue[i];
		if (i + 1 == _max) i = 0;
	    	else i++;
	    }
	}
	ans += "]";
	return ans;
    }

    public static void main(String [] args){
        Queue<Integer> q = new ArrayQueue<Integer>(10);
        System.out.println(q);
	
        for (int i = 0; i < 5 ; i++){
            q.enqueue(i);
            System.out.println("enqueue : " + i + " q: " + q);
        }

        while (!q.empty()){
            if (Math.random() < 0.75)
                System.out.println("dequeue " + q.dequeue() + " q: " + q);
            else {
                int x = (int)(Math.random() * 100) ;
                q.enqueue(x);
                System.out.println("enqueue : " + x + " q: " + q);
            }
        }

	
    }

}
