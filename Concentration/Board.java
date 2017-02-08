import java.util.ArrayList;
import java.util.List;

/*
Concentration is a game in which tiles are placed faced-down in rows on a 
"concentration board." Each tile contains an image. For each tile, there is
exactly one other tile with the same image. The player is to pick a tile, see
which image it has, and try to find its match from the remaining face-down
tiles. If the player fails to turn over its match, both tiles are turned 
face-down and the player attempts to pick a matching pair again. The game is
over when all tiles on the board are turned face-up.

In this implementation of a simplified version of concentration,
   * Images will be strings chosen from a FooSet. 
   * The concentration board will contain an even number of Tiles.
   * The Board will be implemented  as a one-dimensional array of Tiles.

For example, if the size of the concentration board is requested to be 4, the
board will have 16 Tiles. The list, _gameboard, can be viewed
as a 4-by-4 concentration board as follows:

   _gameBoard.get(0)  _gameBoard.get(1)   _gameBoard.get(2) _gameBoard.get(3)
   _gameBoard.get(4)  _gameBoard.get(5)	  _gameBoard.get(6) _gameBoard.get(7)
   _gameBoard.get(8)  _gameBoard.get(9)	  _gameBoard.get(10)_gameBoard.get(11)
   _gameBoard.get(12) _gameBoard.get(13)  _gameBoard.get(14)_gameBoard.get(15)

An incomplete implementation of the Board class appear below.
*/

public class Board{
    
    private ArrayList<Tile> _gameBoard; // concentration board of Tiles
    private int _size;   // number of Tiles on board
    private int _rowLength; // number of Tiles printed in a row
    private int _numberOfTilesFaceUp; // number of Tiles face-up
    private FooSet _possibleTileValues; // possible Tile images

    // Constructs n by n concentration board of Tiles whose values
    // are chosen from the already filled FooSet list.
    // All the tiles should be face-down.
    // Precondition: n is the length of a side of the board.
    // n is an even positive integer.
    // FooSet contains at least n * n / 2 strings.
    public Board(int n, FooSet foos){
	_gameBoard = new ArrayList<Tile>();
	_size = n*n;
	_rowLength = n;
	_numberOfTilesFaceUp = 0;
	_possibleTileValues = foos;
	fillBoard();
	for (Tile t : _gameBoard)
	    t.turnFaceDown();
    }


    // Randomly fills this concentration board with tiles. The number
    // of distinct tiles used on the board is size / 2.
    // Any one tile image appears exactly twice.
    // Precondition: number of positions on board is even.
    // possibleTileValues contains at least size / 2 elements.
    // _gameBoard is filled with Tiles, each tile is face-up
    // version 1
   
    private void fillBoard(){
	for (int i = 0; i < _size/2 ; i++){
	    String foo = _possibleTileValues.removeRandomFoo();
	    _gameBoard.add(new Tile(foo));
	    _gameBoard.add(new Tile(foo));
	}
	shuffle();
    }

    private void shuffle(){
	for (int i = 0; i < _size; i++){
	    int r = (int)(Math.random() * (_size - i)) + i;
	    _gameBoard.set(i,_gameBoard.set(r,_gameBoard.get(i)));
	}
    }
    

    //Precondition: Tile in position p is face-down.
    //Postcondition: Tile in postion p is face-up.
    //               _numberOfTilesFaceUp is updated.
    public void lookAtTile(int p){
	_gameBoard.get(p).turnFaceUp();
	_numberOfTilesFaceUp++;
    }

    //Checks whether the Tile in pos1 and pos2 have the same image.
    // If they do, the Tiles stay face-up.
    // If not, the Tiles are turned face-down and _numberOfTilesFaceUp
    // is updated.
    // If pos1 == pos2 then the tile at pos1 is turned face-down.
    // Precondition: _gameBoard.get(pos1) is face-up.
    //               _gameBoard.get(pos2) is face-up.
    public void checkMatch(int pos1, int pos2){
	Tile a = pickTile(pos1);
	Tile b = pickTile(pos2);
	if (pos1 == pos2 || !a.equals(b)){
	    a.turnFaceDown();
	    b.turnFaceDown();
	    _numberOfTilesFaceUp -= 2;
	}
    }

    // Board is printed for the player. If the Tile is turned face-up,
    // the image is printed. If the Tile is turned face-down,
    // the Tile position is printed. The format method is used in
    // this function.
    public void printBoard(){
	int len = _possibleTileValues.getFooLength() + 1;
	for (int i = 0; i < _gameBoard.size(); i++){
	    Tile t = pickTile(i);
	    String output = t.toString();
	    if (!t.isFaceUp()) output = i + "";
	    System.out.print(format(output,len));
	    if ((i + 1) % _rowLength == 0)
		System.out.println();
	}
	System.out.println();
    }

    // Returns Tile in postion pos.
    public Tile pickTile(int pos){
	return _gameBoard.get(pos);
    }

    // Returns right-justified word with p places as a string.
    // format("cat",3) -> "cat"
    // format("cat",4) -> " cat"
    // format("cat",5) -> "  cat"
    // Precondition: p >= word.length()
    public String format(String word, int p){
	while (p > word.length()){
	    word = " " + word;
	}
	return word;
    } 

    // Returns true if all Tiles are turned face-up, false otherwise.
    public boolean allTiles(){
	return _numberOfTilesFaceUp == _size;
    }
       

}
