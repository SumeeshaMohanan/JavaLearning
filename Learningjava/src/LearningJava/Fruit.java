package LearningJava;

public class Fruit {
	public void getName()
	{
		System.out.println("Any Name");
	}
	public void getColor()
	{
		System.out.println("Any Color");
	}

	private void getPrice()
	{
		System.out.println("Any Price");
	}
	public static void main(String args[])
	{
		Fruit f=new Fruit();
		f.getPrice();
		/* Private function can be visible only inside the class containing the function.
		 it cannot be visible outside any classes(including child class) other than its own class.
		public methods can be accessed anywhere outside the class including child class.*/
		}
}
