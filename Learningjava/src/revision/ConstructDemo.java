package revision;

public class ConstructDemo {
	  
	  	
	  public ConstructDemo()
	  	{
	  	System.out.println("no Argument Constructor");	
	  	}
	  public ConstructDemo(int a,int b)
	  	{
		 int c=a+b;
	  	System.out.println("result "+c);	
	  	}	
	 
	  	
	  public static void main(String args[])
	  {
	  ConstructDemo ob=new ConstructDemo();
	  ConstructDemo ob1=new ConstructDemo(2,3);
	  
	  }
	  }