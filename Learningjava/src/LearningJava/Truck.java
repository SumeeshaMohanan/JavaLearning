package LearningJava;

public class Truck extends Vehicle {
	public static void main(String args[])
	{
		Truck tk=new Truck();
		tk.start();
		tk.stop();
		tk.brakes();
	}
	public void brakes(){
		System.out.println("Breaks");
	}

}
