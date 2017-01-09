/*Implement a Tile object.

A Tile object is either face-up or face-down. On the face of a tile is a word.
On the back of a tile is "X".
*/



public class Tile{
       private String _image;
       private boolean _faceUp;

       // Constructs a Tile whose faceUp and show word
       public Tile(String word){
       	      _image = word;	
	      _faceUp = true;
       }
       
       // returns image on face of Tile
       public String showFace(){}

       // Returns true if Tile is face-up, false otherwise.
       public boolean isFaceUp() {
		return _faceUp;}

       // Returns true if the image on other is the same as this image.
       public boolean equals (Object other){
		return other instanceOf Tile && ((Tile) otehr).showFace().equals(showFace());
	}

       // Postcondition: Tile is turned face-up
       public void turnFaceUp(){
		_faceUp = true;}

       //Postcondition: Tile is turned face-down
       public void turnFaceDown(){
		_faceUp = false;}

       // returns the image when the tile is face-up
       // otherwise returns "X"
       public String toString(){
		if (_faceUp)
			return _image;
		else
			return "X";
	 }

}

