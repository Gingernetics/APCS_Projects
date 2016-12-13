import wheels.users.*;
import java.awt.Color;

public class Calvin {

    private Rectangle _brim, _top, _shirt;
    private Ellipse _head, _leftEye, _rightEye, _smile;

    public Calvin(){
	super();
	_shirt = new Rectangle(Color.RED);
	_shirt.setSize(80,80);
	_shirt.setLocation(70,60);
	
	_head = new Ellipse(Color.PINK);
	_head.setSize(100,100);

	_leftEye = new Ellipse(Color.BLACK);
	_leftEye.setSize(10,10);
	_leftEye.setLocation(75, 175);
	
	_rightEye = new Ellipse(Color.BLACK);
	_rightEye.setSize(10,10);
	_rightEye.setLocation(100,175);
	
     }

    public void setLocation(int x, int y){
	_head.setLocation(x, y);
	_leftEye.setLocation(x + 10, y + 30);
	_rightEye.setLocation(x + 50, y + 30);
	_shirt.setLocation(x + 20, y + 90);

    }
    
}
