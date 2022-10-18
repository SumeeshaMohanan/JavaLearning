package encapsulation;

public class CreateBox {

public static void main(String args[])
{
	Common c=new Common();
	
	/*c.height=10; Java doesn't appreciate other classes directly accessing and initializing values to
	  variables that belongs to some other class.
	c.length=20;
	c.width=30;*/
	
	int w= c.setWidth(30);
	int l= c.setLength(20);
	int h= c.setHeight(10);
	c.setBoxDimension(l,w,h);
	System.out.println(c.getHeight());
	System.out.println(c.getLength());
	System.out.println(c.getWidth());
	
	}
}
