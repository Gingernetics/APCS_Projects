import wheels.users.*;
import java.awt.Color;


public class CalvinHobbes extends Frame{

    // instance fields
    private Ellipse _hill;
    private ConversationBubble _bubble1, _bubble2;
    private Hobbes _hobbes;
    private Calvin _calvin;
    private Rectangle _sky;
    private Wagon _wagon;


    // constructor
    public CalvinHobbes(){
	super();
	_sky = new Rectangle(Color.CYAN);
	_sky.setLocation(0,0);
	_sky.setSize(999,999);
	
	_hill = new Ellipse(Color.GREEN);
	_hill.setSize(2000,1000);
	_hill.setLocation(50,200);
	
	
	_bubble1 = new ConversationBubble("Are you sure about this?");
	_bubble1.setTailDirection(ConversationBubble.TAIL_DIR_RIGHT);
	_bubble1.setLocation(275, 30);
	
	_bubble2 = new ConversationBubble("What's the worst that can go wrong?");
	_bubble2.setTailDirection(ConversationBubble.TAIL_DIR_RIGHT);
	_bubble2.setLocation(180, 130);
	

	_hobbes = new Hobbes();
	_hobbes.setLocation(410, 100);
	
	_calvin = new Calvin();
	_calvin.setLocation(300, 200);
	
	_wagon = new Wagon();
    _wagon.setLocation(350,380, 530 ,310);
	


		
    }

    public static void main(String [] args){
	CalvinHobbes cartoon = new CalvinHobbes();
	}
    
}
