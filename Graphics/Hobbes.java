import wheels.users.*;
import java.awt.Color;

public class Hobbes {

    private Rectangle _body;
    private Ellipse _head, _leftEye, _rightEye, _leftEar, _rightEar;
    
    public Hobbes(){
	super();
	
	_body = new Rectangle(Color.ORANGE);
	_body.setSize(65,170);

	_leftEar = new Ellipse(Color.BLACK);
	_leftEar.setFrameColor(Color.ORANGE);
	_leftEar.setSize(10,30);
	
    _head = new Ellipse(Color.ORANGE);
	_head.setSize(120,100);  
		
	_leftEye = new Ellipse(Color.BLACK);
	_leftEye.setSize(10,10);
	
	_rightEye = new Ellipse(Color.BLACK);
	_rightEye.setSize(10,10);
	
	_rightEar = new Ellipse(Color.BLACK);
	_rightEar.setFrameColor(Color.ORANGE);
	_rightEar.setSize(10,30);


     }

    public void setLocation(int x, int y){
    _leftEar.setLocation(x + 20 , y - 10);
    _head.setLocation(x , y );
    _rightEar.setLocation(x + 90, y - 10 );
	_body.setLocation(x + 30 , y + 70);
	_leftEye.setLocation(x + 10, y + 30);
	_rightEye.setLocation(x + 50, y + 30);
	

    }
    
}
