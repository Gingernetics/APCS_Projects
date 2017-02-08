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
       public String showFace(){
	   return _image;
       }

       // Returns true if Tile is face-up, false otherwise.
       public boolean isFaceUp() {
	   return _faceUp;
       }

       // Returns true if the image on other is the same as this image.
       public boolean equals (Object other){
	   return other instanceof Tile && showFace().equals(((Tile)other).showFace());
       }

       // Postcondition: Tile is turned face-up
       public void turnFaceUp(){
	   _faceUp = true;
       }

       //Postcondition: Tile is turned face-down
       public void turnFaceDown(){
	   _faceUp = false;
       }

       // returns the image when the tile is face-up
       // otherwise returns "X"
       public String toString(){
	   if (isFaceUp()) return showFace();
	   else return "X";
       }

    public static void main(String [] args){
	Tile t1 = new Tile("cat");
	Tile t2 = new Tile("dog");
	Tile t3 = new Tile("cow");
	System.out.println(t1);
	System.out.println(t2);
	System.out.println(t3);
	t1.turnFaceDown();
	t2.turnFaceDown();
	t3.turnFaceDown();
	System.out.println(t1);
	System.out.println(t2);
	System.out.println(t3);
	System.out.println(t1.equals(t1));
	System.out.println(t1.equals(t2));

	
    }

    
}

