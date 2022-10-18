package accessmodifier;

public class AccessModifierDemo {
	private int a=10;
	public int b=20;
	protected int c=30;
	int d=40;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierDemo ad=new AccessModifierDemo();
		ad.privateMethod();
		ad.defaultMethod();
		ad.protectedMethod();
		System.out.println(ad.c);
		System.out.println(ad.d);
	}
	private void privateMethod() 
	{
		System.out.println("Private method");
	}
	public void publicMethod() 
	{
		System.out.println("Public method");
	}
	protected void protectedMethod()
	{
		System.out.println("Protected method");
		
	}
	void defaultMethod()
	{
		System.out.println("Default method");
	}
	
}
