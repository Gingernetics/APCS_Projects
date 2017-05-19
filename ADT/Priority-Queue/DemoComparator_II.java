import java.util.PriorityQueue;
import java.util.Comparator;

public class DemoComparator_II{


    public static void main(String [] args){
	String [] fruits = {"kiwi","pear","apple","banana","watermelon", "grapes", "cantalope", "orange"};
	// Uses the natural ordering. (Minimum at the root).
	PriorityQueue<String> pq = new PriorityQueue<String>();

	// Reverses the natural ordering. (Maximum at the root);
	Comparator<String> compR = new ReverseComparator<String>();
	// java version 7 - (school labs)
	 PriorityQueue<String> pq2 = new PriorityQueue<String>(fruits.length,compR);
	// java version 8
	//PriorityQueue<String> pq2 = new PriorityQueue<String>(compR);

	
	Comparator<String> compSL = new StringLengthComparator<String>();
	// java 8
	//PriorityQueue<String> pq3 = new PriorityQueue<String>(compSL);
	// java 7
	PriorityQueue<String> pq3 = new PriorityQueue<String>(fruits.length,compSL);
	
	for (String fruit: fruits){
	    pq.add(fruit);
	    pq2.add(fruit);
	    pq3.add(fruit);
	    System.out.println("min pq: " + pq);
	    System.out.println("max pq: " + pq2);
	    System.out.println("min SL pq: " + pq3);
	    System.out.println();
	    
	}

    }
}
