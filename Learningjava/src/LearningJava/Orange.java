package LearningJava;

public class Orange extends Fruit{
	public static void main(String args[])
	{
		Orange og=new Orange();
		og.getColor();
		og.getName();
		/*og.getPrice(); this is invalid ,bcz getPrice() function which belongs to class Fruit
		is a private function(Hence not visible) and it cannot be accessed by any other
		 classes including child class.*/
	}

}
