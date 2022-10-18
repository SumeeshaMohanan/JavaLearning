package multilevelInheritence;

public class Maruti800 extends Maruti {
	public void capacity()
	{
		System.out.println("The Fuel Capacity : 28L");
	}
	public static void main(String args[])
	{
		Maruti800 ob=new Maruti800();
		ob.speed();
		ob.make();
		ob.color();
		ob.capacity();
	}	

}
