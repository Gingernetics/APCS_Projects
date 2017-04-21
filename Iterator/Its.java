import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Its {

public static int countEvens1(List<Integer> L){
	int ans = 0;	
	for (Integer i: L)
		if (i % 2 == 0) ans++;
	return ans;
}

public static int countEvens2(List<Integer> L){
	int ans = 0;
	Iterator<Integer> itr = L.iterator();
	while (itr.hasNext())
		if (itr.next() % 2 == 0) ans++;
	return ans;
}

public static int countEvens3(List<Integer> L){
	int ans = 0;
	for (int i = 0; i < L.size(); i++)
		if (L.get(i) % 2 == 0) ans++;
	return ans;
}

public static void main(String args[]){
	List<Integer> L = new ArrayList<Integer>();
	for (int i = 0; i < 20; i++){
		L.add(i);
	}
	System.out.println("One gets " + countEvens1(L));
	System.out.println("Two gets " + countEvens2(L));
	System.out.println("Three gets " + countEvens3(L));
}
//ArrayList all O(n)
//LinkedList is O(n) with 1 and 2, but 3 is O(n^2)
}
