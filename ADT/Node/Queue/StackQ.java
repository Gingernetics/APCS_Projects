//Implement a stack using two queues
public class StackQ<E> implements Stack<E>{
	
	private Queue<E> _queue1, _queue2;
	private int _size;

    // constructor
    public StackQ(int n){
	_queue1 = _queue2 = new NodeQueue();
	_count = 0;
    }

    public StackQ(){
	this(100);
    }

    // O(1)
    public boolean empty(){
	return _count == 0;
    }

    // O(1)
    public void push(E value){
	_queue1.enqueue(value);
    }

    // O(1)
    public E peek(){
	return _queue1.front();
    }

    // O(1)
    public E pop(){
	
    }
	public static void main(String args[]){
		Stack<Integer> s = new StackQ<Integer>();
		for (int i = 0; i < 10; i++)
	    	s.push(i);

		while (! s.empty())
	    		System.out.println(s.pop());

		s.peek();
	}
}
