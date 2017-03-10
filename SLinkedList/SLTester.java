import java.util.ArrayList;

public class SLTester{


    public static void main(String [] args){
	List list = new SLinkedList();
	ArrayList aL = new ArrayList();

        System.out.println("array add: " + aL.add("8"));
	System.out.println("arraylist size: " + aL.size());
	System.out.println("array list: " + aL);
	
	System.out.println("array add: " + list.add("1"));
	System.out.println("array add: " + list.add("2"));
	System.out.println("array add: " + list.add("3"));
	System.out.println("array add: " + list.add("4"));
	System.out.println("array change 3 8: " + list.set(2, "8"));
	System.out.println("size: " + list.size());
	System.out.println("list: " + list);
	System.out.println("array del 2: " + list.remove(1));
	System.out.println("size: " + list.size());
	System.out.println("list: " + list);
	System.out.println("getNode Test: " + list.getNode(2));



    }
    

}
