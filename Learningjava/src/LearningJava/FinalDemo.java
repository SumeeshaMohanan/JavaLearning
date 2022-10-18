package LearningJava;

public class FinalDemo {
	public static void main(String args[])
	{
		final int a=10;
		//a=5; the integer a cannot be reinitialized since it is final.
		System.out.println(a);
		
		
	}

}
/*the final keyword can be used along with variables,methods,class
 * if final is used with variables it cannot be reinitialized.
 * if final is used with a class it cannot be inherited.
 * if final is used with a method, it cannot be overridden. */
