public class Node<E>{

	public void push(E value){
		_head = new Node(value, _head);
	}
    	public E pop(){
		 if (empty())
			throw new EmptyStackException("Don't peek at an empty Stack");
		return _head.getValue();  
	}

    	public E peek(){
		if (empty())
			throw new EmptyStackException("Don't peek at an empty Stack");
		return _head.getValue();
	}  
    	public boolean empty();
    
	/*
	1) Write a static function that uses a stack to reverse a string
		public static String revers(String word){}
	2) Add the NodeStack method
		public int search(E value)
			that returns -1 if value not found or the distance from the top
		top element has distance of 1
	*/

public static void main(String args){
	System.out.println("HelloWorld");
}
