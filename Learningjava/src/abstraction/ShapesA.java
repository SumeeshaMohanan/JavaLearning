package abstraction;
//Abstract Class
public abstract  class ShapesA {
	
public abstract void drawShape();//Abstract Method
public abstract void colorShape();//Abstract Method
public abstract void moveShape();
public void describeShape()
{
	System.out.println("Describing Shapes");
	}

}
/*An abstract class can have abstract method as well as non abstract methods/instance/concrete methods.
 * since both types of methods are present data hiding is partial.*/ 
 