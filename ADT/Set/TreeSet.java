import java.util.Iterator;

public class TreeSet<E extends Comparable<E>> implements Set<E>{
	private BST<E> _tree;

	public void TreeSet(BST<E> tree){
		_tree = tree;
	}

    	public boolean add(E val){
		if (! contains(val)){
			_tree.add(val);
			return true;
		}
		return false;
	}

    	public boolean contains(E val){
		return _tree.isFound(val);
	}

    	public boolean remove(E val){
		return _tree.remove(val);
	}

    	public int size(){
		return _tree.size();
	}

    	public Iterator<E> iterator(){
		return _tree.iterator();
	}
}
