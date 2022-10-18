package multilevelInheritence;

// with aggregation multilevel inheritence
class MainClassDemo
{
		public static void main(String args[])
	{
		Maruti800 ob=new Maruti800();
		ob.speed();
		ob.make();
		ob.color();
		ob.capacity();
	}
}
/*class Car{
	public void speed()
	{
		System.out.println("The Speed of Car : 144km/hr");
		
	}
	public void make()
	{
		System.out.println("Manufacture : Maruti Suzuki");
	}
}

class Maruti extends Car{
	public void color()
	{
	System.out.println("The Color: Red");	
	}
}

class Maruti800 extends Maruti{

public static void main(String args[])
	{
		Maruti800 ob=new Maruti800();
		ob.speed();
		ob.make();
		ob.color();
		ob.capacity();
	}
	public void capacity()
	{
		System.out.println("The Fuel Capacity : 28L");
	}
	
}
*/