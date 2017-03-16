import java.util.Scanner;

public class MatchParen{

    static final String OPENING = "([{";
    static final String CLOSING = ")]}";



    // ************ QUESTION 1 *******************************
    // precondition: seq != null and length of ch is 1
    // postcondition: return true if ch is in the String seq
    //                false otherwise.
     public static boolean contains(String seq, String ch){
	return indexOf(seq, ch) != -1;

    // ************ QUESTION 2 *******************************
    // precondition: exp != null
    // post condition : Uses a stack to verfiy if the exp
    //                  contains matching parentheses
    public static boolean matching(String exp){
	boolean ans = true;
	Stack <String> s = new NodeStack(<String>);
	String temp;
	for(int i = 0; i < exp.length(); i++){
		if(contains(exp.substring(i, i+1),  "("))
			temp == "0";
		if(contains(exp.substring(i, i+1),  "{"))
			temp == "1";
		if(contains(exp.substring(i, i+1),  "["))
			temp == "2";
		s.push(temp);
		
		
    }
    


    public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	System.out.print("type an expression: ");
	String exp = s.nextLine();
	System.out.println(exp);
	if (matching(exp))
	    System.out.println("matching parentheses");
	else
	    System.out.println("mismatched parentheses");
    }


}
