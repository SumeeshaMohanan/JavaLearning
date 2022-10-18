package trycatch;

public class TryCatchDemo1 {
public void display() 
{
	try {
		int a=4/0;
		System.out.println(a);
			}
	catch (ArithmeticException e) //catch(Exception ClassName object)
	{
		System.out.println(e);
	}
	finally {
		System.out.println("This is finally block");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TryCatchDemo1 td=new TryCatchDemo1();
td.display();

	}

}

/*finally block gets executed whether the exception is handled or not.*/
