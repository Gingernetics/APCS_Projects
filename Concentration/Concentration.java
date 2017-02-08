import java.util.Scanner;

public class Concentration{

    public static void main(String [] args){
	String [] foos = {"cat","dog","cow","pig","rat","eel","hen","ram"};
	FooSet f = new FooSet(3);
	f.fillFooSet(foos);
	Board board  = new Board(4,f);
	Scanner s = new Scanner(System.in);
	while(!board.allTiles()){
	    board.printBoard();
	    System.out.print("enter a position: ");
	    int pos1 = s.nextInt();
	    System.out.print("enter a position: ");
	    int pos2 = s.nextInt();
	    if (pos1 != pos2 && !board.pickTile(pos1).isFaceUp() &&
		!board.pickTile(pos2).isFaceUp()){
		board.lookAtTile(pos1);
		board.lookAtTile(pos2);
		board.printBoard();
		board.checkMatch(pos1,pos2);
	    }
	}

	

    }

}
