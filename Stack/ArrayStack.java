public class ArrayStack<E> implements Stack<E>{

    // private instance variables.
    private E[] _stack;
    private int _count;
    private final int _max;

    // constructor
    public ArrayStack(int n){
	_stack = (E[]) new Object[n];
	_count = 0;
	_max = n;
    }

    public ArrayStack(){
	this(100);
    }

    // O(1)
    public boolean empty(){
	return _count == 0;
    }
    // O(1)
    public void push(E value){
	if (_count == _max)
		throw new EmptyStackException("FULL STACK");
	_stack[_count] = value;
	_count++;
    }
    // O(1)
    public E peek(){
	if (empty())
	    throw new EmptyStackException("Don't peek at an empty stack");
	return _stack[_count - 1];
    }
    // O(1)
    public E pop(){
	if (empty())
	    throw new EmptyStackException("Don't pop at an empty stack");
	E temp = _stack[_count - 1];
	_stack[_count - 1] = null;
	_count--;
	return temp;
    }



    public static void main(String [] args){
	Stack<Integer> s = new ArrayStack<Integer>(10);
	for (int i = 0; i < 10; i++)
	    s.push(i);

	while (! s.empty())
	    System.out.println(s.pop());

	s.peek();
    }





}
