package Supereyword;

public class ChildA extends ParentA {
	String empName="Jerry";
	int empNo=354289;
	
	public ChildA()
	{
		//super();//refers to parent class no argument constructor.
		super(3);//refers to parent class parameterized constructor.
	}
	
	
	
	public void getData()
	{
		System.out.println(empName);
		System.out.println(empNo);
		super.getData();//refers to corresponding parent class getData() function.
		System.out.println(super.empName);//refers to corresponding parent class variable.
		System.out.println(super.empNo);//refers to corresponding parent class variable.
	
	}
	public static void main(String args[])
	{
		ChildA ob=new ChildA();
		ob.getData();
		
	}

}
/* super keyword can be used to access the immediate parent class variable/constructor/method
also super keyword cannot be used inside a static function.*/