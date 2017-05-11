import java.util.ArrayList;

public class Cult{
	
	public static <E>  Queue<E> buildQueue(ArrayList<E> array){
		Queue<E> q = new NodeQueue<E>();		
		for (E i: array)
			q.enqueue(i);
		return q;			
	}

	public static<E> E josephus(Queue<E> q, int k){
		if (k > q.size() || k < 1 || q.size() < 1) return null;
		int i = 1;
		while (q.size() != 1){
			if (i % k == 0) System.out.println(q.dequeue());
			else q.enqueue(q.dequeue());
			i++;
		}
		return q.front();
	}

	public static<E> void main(String[] args){
		ArrayList<E> names = new ArrayList<E>();
		for (int i = 0; i < 20; i++){
			Integer x = new Integer(i);
			E temp = (E) x;
			names.add(temp);
		}
		Queue<E> namesQ = buildQueue(names);
		System.out.println(namesQ);
		System.out.println("Survivor: " + josephus(namesQ, 9));
	}
}
