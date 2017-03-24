import java.util.List;
import java.util.ArrayList;

public class Evaluator{

  
    // precondition: exp is a String expression that is fully parenthesized (a set
    //               of parentheses for each operator).
    // postcodition: returns a String [] of the tokens of exp.
    //               ex. getTokens("(5-2.2)") -> ["(","5","-","2.2",")"]
    public static String[] getTokens(String exp){
	exp = exp.replaceAll(" ", "");
	String[] tokens = exp.split("(?<=[^\\.a-zA-Z\\d])|(?=[^\\.a-zA-Z\\d])");
	return tokens;
    }
    

    // precondition: receives an array of the tokens of an infix expression.
    //               tokens must be one of the following:
    //               (),+-*/%,sqrt
    // postcondition: evalutes the expression represented in expTokens
    //             ex. evaluate(["(","5","-","2.2",")"]) returns 2.8
    public static Double evaluate(String[] expTokens){
	NodeStack<String> operators = new NodeStack<String>();
	NodeStack<Double> operands = new NodeStack<Double>();
	for (String i : expTokens){
		
		if (i.equals("+") || i.equals("sqrt") || i.equals("-") || i.equals("*") || i.equals("/") || i.equals("%"))
			operators.push(i);
		else if (i.equals("("))
			continue;
		else if (i.equals(""))
			continue;
		else if (i.equals(")")){
			if (operators.peek().equals("sqrt"))
				operands.push(Math.sqrt(operands.pop()));
			if (operators.peek().equals("+"))
				operands.push(operands.pop() + operands.pop());
			if (operators.peek().equals("*"))
				operands.push(operands.pop() * operands.pop());
			if (operators.peek().equals("-")){
				double temp = operands.pop();
				operands.push(operands.pop() - temp);
			}
			if (operators.peek().equals("%")){
				double temp = operands.pop();
				operands.push(operands.pop() % temp);
			}
			if (operators.peek().equals("/")){
				double temp = operands.pop();
				operands.push(operands.pop() / temp);
			}
			operators.pop();
		}
		else operands.push(Double.parseDouble(i));
	}
	return operands.peek();
    }



    
    public static void main(String [] args){
	
	String[] expressions = {"(2+3)","(4 + (3 - 2))", "((5 *(10 + (32 - 8))/ 2.0))",
				"( sqrt  (16 * 16) )", "(( 25 % 3 ) + 9)"};
	Double[] expectedResults = {5.0,5.0,85.0,16.0,10.0};

	for (int i = 0; i < expressions.length; i++){
	    String[] tokens = getTokens(expressions[i]);
	    Double  ansObserved = evaluate(tokens);
	    Double  ansExpected = expectedResults[i];
	    System.out.println(expressions[i] + " = " + evaluate(tokens));
	    System.out.println("observed: " + ansObserved + " expected: " + ansExpected);
	    System.out.println("correct? " + (ansObserved.equals( ansExpected)));
	}
    }
    
}
