package encapsulation;

public class EmpDetails {
	private int empSSN;
	private String empName;
	private int empAge;
	
	public void setName(String name)
	{
		empName=name;// if we use same name for parameter and private variable then we use this(this.name=name)
	
	}
	public void setSSN(int ssn)
	{
		empSSN=ssn;
		
	}
	public void setAge(int age)
	{
		empAge=age;
		
	}
	public String getName()
	{
	
		return empName;
	}
	public int getSSN()
	{
		
		return empSSN;
	}
	public int getAge()
	{
		
		return empAge;
	}
	
}
