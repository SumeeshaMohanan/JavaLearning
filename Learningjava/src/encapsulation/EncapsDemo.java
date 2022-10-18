package encapsulation;

public class EncapsDemo {
	public static void main(String args[])
	{
		EmpDetails ed=new EmpDetails();
		//int ag=ed.setAge(28);
		//int sn=ed.setSSN(123);
		//String name=ed.setName("Aswathy");
		
		ed.setAge(28);
		ed.setSSN(123);
		ed.setName("Aswathy");
		System.out.println(ed.getName());
		System.out.println(ed.getAge());
		System.out.println(ed.getSSN());
		
	}

}
