package Interface;

import abstraction.ShapesA;

public class Triangle extends ShapesA{
	public static void main (String args[])
	{
	Triangle ob=new Triangle();
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


