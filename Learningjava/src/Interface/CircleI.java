package Interface;

public class CircleI implements ShapesI {


public static void main(String args[])
{
	CircleI ob=new CircleI();
	ob.drawShape();
	ob.colorShape();
	ob.describeShape();
	ob.moveShape();
}	

@Override
public void drawShape() {
	System.out.println("Drawing Circle");
	
}
@Override
public void colorShape()
{
	System.out.println("Coloring Circle");
}

@Override
public void moveShape()
{
	System.out.println("Moving Circle");
}
@Override
public void describeShape()
{
	System.out.println("Describe Circle");
}
}

/*An interface can have only abstract methods
 * we use 'implements' keyword to  implement an interface.
 * An interface should be declared using an 'interface' keyword. */
