import wheels.users.*;
import java.awt.Color;


public class SnowMan{

    private Ellipse _head, _body, _leftEye, _rightEye;


    public SnowMan(){
    _body = new Ellipse(Color.WHITE);
	_body.setFrameColor(Color.BLACK);
	_body.setSize(200,200);
	_body.setLocation(0,230);
	
	_head = new Ellipse(Color.WHITE);
	_head.setFrameColor(Color.BLACK);
	_head.setSize(100,100);
	_head.setLocation(45,140);
	
	_leftEye = new Ellipse(Color.BLACK);
	_leftEye.setSize(10,10);
	_leftEye.setLocation(75, 175);
	
	_rightEye = new Ellipse(Color.BLACK);
	_rightEye.setSize(10,10);
	_rightEye.setLocation(100,175);
    }

}
