package LearningJava;

public class DebugDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=5;
		int c=7;
		DebugDemo db=new DebugDemo();
int d=db.calculateSum(a,b,c);
System.out.println(d);
	}
public int calculateSum(int a,int b,int c) {
	int e=a+b+c;
	return e;
}
}
