package revision;

public class StudConstruct2 {
	
	static String college="EC College";
	String studName;
	int roll;
	String dept;
	public StudConstruct2(String stud,int roll,String dept)
	{
		this.studName=stud;
		this.dept=dept;
		this.roll=roll;
		
	}
	void print() {
		System.out.println("Student Name: "+studName);
		System.out.println("Roll No: "+roll);
		System.out.println("Department: "+dept);
		System.out.println("College: "+college);
	}
	public static void main(String args[]) {
		StudConstruct2 obj1=new StudConstruct2("Anu",123,"Commerce");
		StudConstruct2 obj2=new StudConstruct2("Divya",456,"Computer Science");
		StudConstruct2 obj3=new StudConstruct2("Dhanya",789,"Maths");
		StudConstruct2 obj4=new StudConstruct2("Arya",258,"English");
		StudConstruct2 obj5=new StudConstruct2("Ammu",963,"Malayalam");
		obj1.print();
		obj1.print();
		obj2.print();
		obj3.print();
		obj4.print();
		obj5.print();
		
	}

}
