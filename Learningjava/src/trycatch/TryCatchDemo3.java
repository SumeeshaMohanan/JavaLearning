package trycatch;

public class TryCatchDemo3 {
	public void display()
	{
		try
		{
			String str=null;
			System.out.println(str.length());//trying to calculate length of an empty string
						
		}
		catch(NullPointerException e) {
			System.out.println(e);
			
		}
	}
public static void main(String args[])
{
	TryCatchDemo3 td=new TryCatchDemo3();
	td.display();
}
}
/*In try block we write program statements that are likely to cause an exception.
 * If an exception is encountered, the catch block will catch the exception and handle it properly.
 * else normal program flow will continue.*/
