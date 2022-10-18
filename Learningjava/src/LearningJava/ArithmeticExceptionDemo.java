package LearningJava;
// Abnormal termination of the Java Program due to ArithmeticException.
//This exception is handled in TryCatchDemo1.java
public class ArithmeticExceptionDemo {
	
	public int division(int a,int b)
	{
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=0;
		
		ArithmeticExceptionDemo ad=new ArithmeticExceptionDemo();
		int c= ad.division(a,b);
		System.out.println(c);
	}

}
