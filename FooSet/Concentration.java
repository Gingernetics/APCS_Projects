public class Concentration{
	public static void main(String [] args){
		int side = Integer.parseInt(args[0]);
		Tile<String> foos = {"a","b","c","d"}
		Board n = new Board(side, foos);
		n.printBoard();
		

}
