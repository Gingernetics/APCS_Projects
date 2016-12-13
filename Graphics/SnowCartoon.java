import wheels.users.*;
import java.awt.Color;


public class SnowCartoon extends Frame{

    // instance fields
    private Ellipse _sun;
    private ConversationBubble _bubble;
    private Hat _hat;
    private SnowMan _snowMan;


    // constructor
    public SnowCartoon(){
	super();
	_sun = new Ellipse(Color.YELLOW);
	_sun.setSize(100,100);
	_sun.setLocation(500,50);

	_bubble = new ConversationBubble("Happy snow day!");
	_bubble.setTailDirection(ConversationBubble.TAIL_DIR_LEFT);
	_bubble.setLocation(225, 110);

	_snowMan = new SnowMan();
	
	_hat = new Hat();
	_hat.setLocation(100, 100);
	
	
    }

    public static void main(String [] args){
	SnowCartoon cartoon = new SnowCartoon();
	

    }


    
}
