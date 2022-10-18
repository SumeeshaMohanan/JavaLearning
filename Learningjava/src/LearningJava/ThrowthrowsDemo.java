package LearningJava;

public class ThrowthrowsDemo {
	static void checkAge(int age) throws ArithmeticException
	
	{
		if(age<18) {
			throw new ArithmeticException("Access denied! You mustbe atleast 18 Years old");
		}
		else {
			System.out.println("Access Granted");
		}
		
		}

	public static void main (String args[])
	{
		checkAge(15);
	}

}
