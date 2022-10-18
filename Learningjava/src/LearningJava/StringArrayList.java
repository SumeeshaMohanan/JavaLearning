package LearningJava;

import java.util.ArrayList;

public class StringArrayList {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	
	
	ArrayList<String> al=new ArrayList();

	al.add("Phython");
	al.add("java");
	al.add("Javascript");
	al.add("HTML");
	al.add("PHP");

	System.out.println(al.size());
	System.out.println(al);

	
	al.remove(0);
	System.out.println(al);

		System.out.println(al.get(2));
	}

	}