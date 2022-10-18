package Interface;

public interface ShapesI {
	public  void drawShape();// ==public abstract void drawShape()
	public void colorShape();
	public void moveShape();
	public void describeShape();
	
}
/* An interface can have only abstract methods, so even if we don't mention the abstract keyword in 
 * method definition it is already understood that the method is abstract.
 * in interface fully abstraction/ data hiding is possible*/
