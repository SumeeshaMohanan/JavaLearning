package overRiding;// example of method overridding

public class Cat extends Animal{
	/*public Cat() {
		super();
	}*/
	
	public static void main (String args[])
	{
		
		Cat obj=new Cat();
		obj.makeNoise();//method with same name and parameters in the child class gets overridden 
		// with parent class method
		

	}
public void makeNoise()
{
	System.out.println("Cat Meows");
	//super.makeNoise();
	//System.out.println(s);
	}
}
/*Polymorphism is ability to take morethan one form or one single action performed in different ways.
mainly there are 2 types of polymorphism
1. Compile time polymorphism / Method overloading
Happens within a class
same function name
Arguments different

2. Run Time polymorpism / Method overriding
Happens between  two classes(parent class,child class)
same function name
Arguments Same
*/