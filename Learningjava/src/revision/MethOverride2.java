package revision;

public class MethOverride2 extends MethOverride{
	public MethOverride2() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethOverride2 obj= new MethOverride2();
		obj.studDetails();

	}
	public void studDetails(int a) {
		System.out.println("Name: Devu");
		System.out.println("Dept: Commerce");
		System.out.println("College " +super.college);
	}

}
