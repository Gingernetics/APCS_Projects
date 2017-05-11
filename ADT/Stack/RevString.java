public class RevString{

    public static String reverse(String w){
	Stack <String> s = new NodeStack<String>();
	for (int i = 0; i < w.length(); i++)
	    s.push(w.substring(i,i+1));
	String ans = "";
	while (! s.empty()) 
	    ans += s.pop();
	return ans;
    }


    public static void main(String [] args){
	String w = args[0];
	System.out.println(w + " reversed " + reverse(w));

    }


}
