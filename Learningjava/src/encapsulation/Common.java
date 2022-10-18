package encapsulation;

public class Common {
	private int length;
	private int width;
	private int height;
	
	public int setLength(int l)
	{
		length=l;
		return length;
	}
	public int setWidth(int w)
	{
		width=w;
		return width;
	}
	public int setHeight(int h)
	{
		height=h;
		return height;
	}

	public int getLength()
	{
		
		return length;
	}
	public int getWidth()
	{
		
		return width;
	}
	public int getHeight()
	{
		
		return height;
	}
	public void setBoxDimension(int l,int w,int h)
	{
		System.out.println("Box created with dimensions  "+l+" "+h+" "+w);
	}
}

/* Making the variables of a class private and getter /setter functions of a class public.
we call the setter methods in CreateBox class to initialize value for the private variables of class Common.
we pass the value as parameters.
setter methods are used to initialize values to private variables.
getter methods are used to get /fetch values of private variables.*/

