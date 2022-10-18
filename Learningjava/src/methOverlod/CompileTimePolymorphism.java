package methOverlod;

public class CompileTimePolymorphism {
	public static void main(String args[])
	{
		CompileTimePolymorphism obj=new CompileTimePolymorphism();
		obj.calculation(10,5,2);
		obj.calculation(15,20);
	}
	
	public void calculation(int a,int b,int c)
	{
		System.out.println("The product ="+(a*b*c));
		}
	public void calculation(int x,int y)
	{
		System.out.println("The Sum ="+(x+y));
		}

}
