package hierarcical;

public class PermanentEmployee extends Employee{
	public void employeeId() {
		System.out.println("Emp-Id: 1001");
	}
	public static void main(String args[])
	{
		PermanentEmployee pe=new PermanentEmployee();
		pe.companyName();
		pe.companyType();
		pe.employeeId();
		

		
	}
}
