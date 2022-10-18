package trycatch;

public class TryCatchDemo2 {
public void display()
{
	try{
		int[] a=new int[5];
		a[6]=5;//we are trying to input a seventh element to an array that can take upto fifth elements
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchDemo2 td=new TryCatchDemo2();
		td.display();
		System.out.println("End of Program");
	}

}
