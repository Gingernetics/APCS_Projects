import java.util.*;

public class ArrayListStack<E> implements Stack<E>{

    // private instance variables.
    private ArrayList <E> _stack;
    private int _count;

    // constructor
    public ArrayListStack(){
	_stack =  new ArrayList<E>();
	_count = 0;
    }


    // O(1)
    public boolean empty(){
	return _count == 0;
    }

    public int size(){
	return _count;
    }

    // O(1)
    public void push(E value){
	_stack.add(value);
	_count++;
    }

    // O(1)
    public E peek(){
	if (empty())
	    throw new EmptyStackException("Don't peek at an empty stack");
	return _stack.get(_count - 1);
    }
    // O(1)
    public E pop(){
	if (empty())
	    throw new EmptyStackException("Don't pop at an empty stack");
	E temp = _stack.get(_count - 1);
	_stack.remove(_count - 1);
	_count--;
	return temp;
    }

    public void transferTo(ArrayStack<E> rhs){
  	 while(!rhs.empty())
		while(_count != 0){
    			rhs.push(this.pop());
		}
    }



    public static void main(String [] args){
	Stack<Integer> s = new ArrayListStack<Integer>();
	for (int i = 0; i < 10; i++)
	    s.push(i);

	while (! s.empty())
	    System.out.println(s.pop());

    }





}
