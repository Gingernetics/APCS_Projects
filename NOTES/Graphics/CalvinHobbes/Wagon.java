import wheels.users.*;
import java.awt.Color;

public class Wagon {

    private Line _wagon;
    private Ellipse _wheel1, _wheel2;

    public Wagon(){
	super();
	_wagon = new Line(350,380, 530 ,310);
	_wagon.setThickness(60);
	_wagon.setColor(Color.RED);
	
	_wheel1 = new Ellipse(Color.BLACK);
    _wheel1.setSize(50,50);
	_wheel1.setLocation(50,200);
	
	_wheel2 = new Ellipse(Color.BLACK);
	_wheel2.setSize(50,50);
	_wheel2.setLocation(50,200);
	
     }

    public void setLocation(int x, int y, int z, int w){
	_wagon.setPoints(x,y, z ,w);
	_wheel1.setLocation(x + 10, y );
	_wheel2.setLocation(z - 30, w + 20);

    }
    
}
