package overRiding;

public class OverRiddingB extends OverRiddingA {
	public OverRiddingB(){
		
		super(5);// invoke parent class constructor
		//super.getdetails();// invoke parent class method
	}
	
	public static void main(String args[])
	{
		OverRiddingB obj=new OverRiddingB();
		obj.getdetails();
		
	}
	public void getdetails()
	{
		System.out.println("Student Name:Anju");
		System.out.println("Student Class:V");
		System.out.println("Subject:English");
		System.out.println("School"+super.school);// refer parent class instance variable
		
	}

}
