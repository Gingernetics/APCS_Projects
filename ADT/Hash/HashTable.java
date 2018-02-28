public class HashTable{

    /* Uses Linear Probing 
       Assume no duplicate keys.
   */
    
    private Integer [] _table;
    private int _size;
    
    

    public HashTable(int M){
	_table = new Integer[M];
	_size = 0;
    }
    // post : return true when the table is full.
    public boolean isFull(){
	return _size >= _table.length;
    }
    
    private int hash(int key){
	return key % _table.length;
    }

    // pre: the hashtable is not full
    // post: adds an item to the hash table
    //       provided the value is not already in the table
    public void add(int x) {
	if (isFull()) return; // should resize and rehash the elements
	// no duplicate keys
	if (find(x) != -1) return;
	int i = hash(x);
	while (true){
	    if (_table[i] == null){
		_table[i] = x;
		break;
	    }
	    i = (i + 1) % _table.length;
	}
	_size++;
    }

    // post: returns the index position of x
    //       or -1 if not found
    public int find(int x){
	int i = hash(x);
	while (_table[i] != null){
	    if (_table[i].equals(x)) return i;
	    i = (i + 1) % _table.length;

	}
	return -1;
    }

    // pre:  hash table is not full
    // post: if key in table remove the key and return true.
    //       otherwise return false.
    public boolean remove(int key){
	int pos = find(key);
	if (pos == -1) return false;
	_table[pos] = null;
	return true;
    }

    
    public void print(){
	for (int i = 0; i < _table.length; i++)
	    System.out.println(i + " : " + _table[i]);

    }
    

    public static void main(String [] args){
	int N = 8;
        int M = 10;
	int [] nums = new int[N];
	HashTable ht = new HashTable(M);
	for (int i = 0; i < N; i++){
	    int r = (int) (Math.random() * 100);
	    System.out.println("add : " + r);
	    ht.add(r);
	    nums[i] = r;
	}
	System.out.println("**** Table *****************");
	ht.print();
	System.out.println("****************************");
	/*
	for (int i = 0; i < 100; i++)
	    System.out.println( i + " : " + ht.find(i));

	*/
        
	for (int i:nums){
	    System.out.println(i + " removed " + ht.remove(i));
	    ht.print();
	    
	}
	
    }
    

}
