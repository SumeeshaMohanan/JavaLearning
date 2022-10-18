package Supereyword;

public class ParentA {
	
	public ParentA()
	{
		System.out.println("parent class no argument constructor");
		
	}
	
	public ParentA(int i)
	{
		System.out.println("parent class parameterised constructor");
		
	}
String empName="Tom";
int empNo=45345;
public void getData()
{
	System.out.println(empName);
	System.out.println(empNo);
	}
}
