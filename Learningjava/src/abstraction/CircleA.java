package abstraction;

public class CircleA extends ShapesA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleA obj= new CircleA();
		obj.drawShape();
		obj.colorShape();
		obj.moveShape();
		obj.describeShape();
	}
	
	@Override
	public void drawShape()
	{
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

}
