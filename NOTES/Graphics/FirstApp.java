import wheels.users.Frame;
import wheels.users.Ellipse;
import wheels.users.ConversationBubble;
import wheels.users.Line;

import java.awt.Color;

public class FirstApp extends Frame{

    private Ellipse _circle;

    
    // constructor
    public FirstApp(){
	super();
	_circle = new Ellipse(Color.magenta);
	_circle.setLocation(100,100);
	_circle.setSize(100,100);

    }


    
    public static void main(String [] args){
	FirstApp app = new FirstApp();

    }

}
