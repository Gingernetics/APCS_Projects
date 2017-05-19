import java.util.ArrayList;
import java.util.Comparator;

public class PQHeap<K, V> implements PriorityQueue<K,V>{

    private ArrayList<Entry<K,V>> _heap;    
    private Comparator<K> _c;



    // private inner class
   
    private static class MyEntry<K, V> implements Entry<K,V>{
	private K _key;
	private V _value;


	public MyEntry(K key, V value){
	    _key = key;
	    _value = value;
	}
	public K getKey() { return _key;}
	public V getValue() { return _value;}


	public String toString(){
	    return "{" + _key + " : " + _value + "}" ;
	}
    }


    // ******** Question 1 ****************************
    // uses a default Comparator.
    public PQHeap(){
	_c = new DefaultComparator<K>();
	_heap = new ArrayList<Entry<K,V>>();
    }

    // *******  Question 2 *****************************
    public PQHeap(Comparator<K> c){
	_c = c;
	_heap = new ArrayList<Entry<K,V>>();
    }

    public boolean isEmpty(){
	return _heap.isEmpty();
    }
   
    // ******** Question 3 *****************************
    // pre: adds the key-value pair to the heap
    // post: 
    public void add(K key, V value){
	MyEntry<K,V> e = new MyEntry<K,V>(key, value);
	_heap.add(e);
	int pos = _heap.size() - 1;
	int parent;
	while (pos > 0){
	    parent = (pos - 1) / 2;
	    if (_c.compare(_heap.get(parent).getKey(), e.getKey()) < 0){
		_heap.set(parent,_heap.set(pos,_heap.get(parent)));
		pos = parent;
	    }
	    else break;

	}
	
    }

    // NEEDS TO BE COMPLETED
    // Uses minChildPos(int).(See below).
    // O(logN)
    public Entry<K,V> removeMin() throws IllegalStateException(){
	return null;
    }
    // NEEDS TO BE COMPLETED
    // return -1 if the entry at pos is a leaf
    // otherwise returns the index of the minmum child
    private int minChildPos(int pos){
	return -1;
    }



    // O(1)
    public Entry<K,V> peekMin(){
	return _heap.get(0);
    }

    public String toString(){
	return _heap.toString();
    }

   



    public static void main(String [] args){
	PriorityQueue<Integer,String> pq = new PQHeap<Integer,String>();

	// the smallest key has a highest priority 
	pq.add(1,"apple");
	pq.add(5,"kiwi");
	pq.add(3, "cantalope");
	pq.add(1,"banana");
	pq.add(2, "orange");
	pq.add(2, "grapes");
	pq.add(1, "watermelon");
	
	System.out.println(pq);
	// [{1 : apple}, {1 : banana}, {1 : watermelon},
	// {5 : kiwi}, {2 : orange}, {3 : cantalope}, {2 : grapes}]

    }


}
