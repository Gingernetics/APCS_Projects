public class DoublingArrayStack<E> implements Stack<E>{

    private E[] _stack;
    private static final int  INITIAL_CAPACITY = 1;
    private int _height;

    public DoublingArrayStack(){
	// causes a compiler warning: this is ok 
	_stack = (E[]) new Object[INITIAL_CAPACITY]; 
	_height = 0;

    }

    // accessor methods
    public int size(){
	return _height;
    }

    public boolean empty(){
	return size() == 0;
    }
    // ************** Question 1 **********************
    // returns true if the stack is full
    private boolean isFull(){
	return size() == _stack.length;
    }

    
    // mutator methods
    // ************ Question 3 *************************
    // pushes val onto the top of the stack
    // if the stack if full the stack's size is doubled.
    public void push(E val){
	if(isFull())
		doubleSize();
	_stack[_height] = val;
	_height++;
    }

    // ************** Question 2 *****************************
    // Doubles the capacity of the stack.
    public void doubleSize(){
	E[] _newstack = (E[]) new Object[_height * 2];
	for (int i = 0; i < _height; i++)
		_newstack[i] = _stack[i];
	_stack = _newstack;
    }

    // ************* Question 5 ******************************
    // reduces the capacity of the stack in half
    public void halfSize(){
	if (_stack.length < 2) return;
	E[] _newstack = (E[]) new Object[_stack.length / 2];
	for (int i = 0; i < _stack.length / 2; i++)
		_newstack[i] = _stack[i];
	_stack = _newstack;
    }

    
    public E peek(){
	if (empty())
	    throw new EmptyStackException("empty stack");
	return _stack[_height - 1];
    }

    // ************* Question 4 ******************************
    // pops the top off the stack.
    // if the stack is less than 40% full, then cut the size of
    // the stack in half.
    public E pop(){
	if (empty())
	    throw new EmptyStackException("can't pop empty stack");
	E temp = _stack[_height - 1];
	_stack[_height - 1] = null;
	_height--;
	if (_height * 1.0 / _stack.length < .4) 
		halfSize();
	return temp;
    }
    
    public String toString(){
        String ans ="[";
        if (size() > 0) ans += _stack[0];
        if (size() > 1) 
            for (int i = 1; i < size(); i++)
                ans += ", " + _stack[i];
        ans += "]";
	ans += "size: " + size() + " capacity: " + _stack.length;
	ans += " % full: " + 1.0 * size()/ _stack.length;
        return ans;
    }

    public static void main(String[] args){
        Stack<Integer> s = new DoublingArrayStack<Integer>();
	System.out.println(s);
        for (int i = 0; i < 16; i++){
            s.push(i);
            System.out.println("push: " + i + " " + s);
        }
	
        System.out.println("peek: " + s.peek());
	System.out.println("**************START POPPING**************");
        while (!s.empty()){
            System.out.println("pop: " + s.pop() + " " + s);
        }
	

    }
    
}
