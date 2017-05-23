public class lpHash{

	Integer [] _hash;
	int capacity;

	public lpHash(int size){
		_hash = new Integer[size];
		capacity = 0;
	}

	public void add(Integer x){
		if (capacity == _hash.length) return;
		Integer hash = x % _hash.length;
		while (_hash[hash] != null){
			if (hash + 1 == _hash.length)
				hash = 0;
			else hash++;
		}
		_hash[hash] = x;
	}

	public boolean find(Integer x){
		boolean ans = false;
		Integer hash = x % _hash.length;
		while (_hash[hash] != null){
			if (_hash[hash] == x)
				ans = true;
			if (hash + 1 == _hash.length)
				hash = 0;
			else hash++;
		}
		return ans;
	}

	public void remove(Integer x){
		if (! find(x)) return;
		Integer hash = x % _hash.length;
		while (_hash[hash] != x){
			if (hash + 1 == _hash.length)
				hash = 0;
			else hash++;
		}
		_hash[hash] = null;
	} 

}
