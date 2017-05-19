import java.util.Comparator;

public class StringLengthComparator<E> implements Comparator<E> {
    public int compare(Object a, Object b) throws ClassCastException{
	return ((String)a).length() - ((String)b).length();
    }

}
