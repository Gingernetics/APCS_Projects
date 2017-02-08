public class EcoApp{


    public static void main(String [] args){
	Ecosystem a = new Ecosystem(50, 5 , 2);
	int N = Integer.parseInt(args[0]);
	System.out.println(a);
	while (N-- > 0){
	    a.step();
	    System.out.println(a);
	}
	


    }

}
