package LearningJava;

import java.util.ArrayList;

public class IntegerArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList();

		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);

		System.out.println(al.size());
		System.out.println(al);

		
		al.remove(0);
		System.out.println(al);

			System.out.println(al.get(2));
		}

		}