import wheels.users.*;
import java.awt.Color;

public class Hat {

    private Rectangle _brim, _top;

    public Hat(){
	super();
	_top = new Rectangle(Color.BLACK);
	_top.setSize(80,80);
	_top.setLocation(70,60);
	
	_brim = new Rectangle(Color.BLACK);
	_brim.setSize(150,20);
       	_brim.setLocation(40,140);	  

     }

    public void setLocation(int x, int y){
	_top.setLocation(x + 35, y);
	_brim.setLocation(x, y + _top.getHeight());

    }
    
}
