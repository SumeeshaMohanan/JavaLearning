package LearningJava;

public class ThrowTryCatchDemo {

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
		try {
			checkAge(20);
		
		}
		catch (ArithmeticException e){
			System.out.println("Exception thrown by throw keyword Handled");
		}
	}

}
/* try-catch is used to handle an exception if it occurs.
 * if an exception occurs in try block it is efficiently caught by catch block and handled.
 * if an exception doesn't occur in try block then the catch block is not used.
 * the finally block gets executed irrespective of whether an exception occurs in try block or not.
 * the throw keyword is used to explicitly throw an exception.
 * throws keyword is used to indicate that the function may cause an exception.*/
