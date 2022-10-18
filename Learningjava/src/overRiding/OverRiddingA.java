package overRiding;

public class OverRiddingA {
		public OverRiddingA()
	{
		System.out.println("Constructor in Parent class");
	}
	public OverRiddingA(int a)
	{
		
		this();
		System.out.println("hello"+a);
	}
	
	String school="S N Public School";
	
	
	public void getdetails()
	{
		System.out.println("Student Name:Aswathy" );
		System.out.println("Student Class:II");
		System.out.println("Subject:Maths");
		System.out.println("School"+school);
	}

}
