package hierarcical;

public class TemporaryEmployee extends Employee{
	public void salaryHike()
	{
		System.out.println("Amount:5000");
	}
public static void main(String args[])
{
	TemporaryEmployee te=new TemporaryEmployee();
	te.salaryHike();
	te.companyName();
	te.companyType();

	
}
}
