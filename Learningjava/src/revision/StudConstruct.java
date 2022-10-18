package revision;

public class StudConstruct {
	
	static String dept="EC College";
	public StudConstruct(String studName,int roll,String dept)
	{
		System.out.println("Student Name: "+studName);
		System.out.println("Roll No: "+roll);
		System.out.println("Department:"+dept);
		
	}
	public static void main(String args[]) {
		new StudConstruct("Anu",123,"Commerce");
		System.out.println(dept+"\n");
		new StudConstruct("Divya",456,"Computer Science");
		new StudConstruct("Dhanya",789,"Maths");
		
	}

}
