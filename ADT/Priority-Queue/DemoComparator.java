import java.util.PriorityQueue;
import java.util.Comparator;

public class DemoComparator{


    public static void main(String [] args){
	String [] fruits = {"kiwi","pear","apple","banana","watermelon", "grapes", "cantalope", "orange"};
	// Uses the natural ordering. (Minimum at the root).
	PriorityQueue<String> pq = new PriorityQueue<String>();

	// Reverses the natural ordering. (Maximum at the root);
	Comparator<String> comp = new ReverseComparator<String>();
	// java version 7 - (school labs)
	PriorityQueue<String> pq2 = new PriorityQueue<String>(fruits.length,comp);
	// java version 8
	//PriorityQueue<String> pq2 = new PriorityQueue<String>(comp);
	
	for (String fruit: fruits){
	    pq.add(fruit);
	    pq2.add(fruit);
	    System.out.println("min pq: " + pq);
	    System.out.println("max pq: " + pq2);
	    
	}

    }
}
