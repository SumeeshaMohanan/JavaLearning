package Interface;

public class MultipleInheritenceDemo implements Interface1, Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritenceDemo obj =new MultipleInheritenceDemo();
		obj.abc();
		obj.xyz();
		
	}
	@Override
	public void abc()
	{
		System.out.println("ABC");
	}
	@Override
	public void xyz()
	{
		System.out.println("XYZ");
	}

}
/* java doesn't support multiple inheritance of classes.
i.e, you cannot write
class C extends A, B
but java support multiple inheritance of interfaces.
i.e, you can write
class C implements Interface1,Interface2
*/