package abstraction;

public class RectangleA extends ShapesA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleA ob=new RectangleA();
		ob.drawShape();
		ob.colorShape();
		ob.moveShape();
		ob.describeShape();
	}

	@Override
	public void drawShape()
	{
		System.out.println("Drawing Rectangle");
	}
	
	@Override
	public void colorShape()
	{
		System.out.println("Coloring Rectangle");
	}
	
	@Override
	public void moveShape()
	{
		System.out.println("Moving Rectangle");
	}
}
