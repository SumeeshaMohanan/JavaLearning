package hierarcical;

//Aggregation hierarchical Inheritance
public class Run {
public static void main(String args[])
{
	TemporaryEmployee te=new TemporaryEmployee();
	PermanentEmployee pe=new PermanentEmployee();
	te.salaryHike();
	te.companyName();
	te.companyType();
	
	pe.companyName();
	pe.companyType();
	pe.employeeId();

}
}

/*
 public class Employee {
	public void companyName()
	{
		System.out.println("Company");
	}
public void companyType()
{
	System.out.println("Logistics");
	}
}
 
 public class TemporaryEmployee extends Employee{
	public void salaryHike()
	{
		System.out.println("Amount:5000");
	}
	
	public class PermanentEmployee extends Employee{
	public void employeeId() {
		System.out.println("Emp-Id: 1001");
	}
	*/
