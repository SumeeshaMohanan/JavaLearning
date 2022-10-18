package LearningJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList(); //Non generic Collection
//ArrayList<Integer> al=new ArrayList();    Generic Collections/Homogeneous
//ArrayList<String> al=new ArrayList();

al.add(10);// add is used to add an element to an array list.
al.add("java");
al.add(true);
al.add(5);
al.add(6.2);

System.out.println(al.size());
System.out.println(al);

//remove is used to remove an element from a specific index.
al.remove(0);
System.out.println(al);

al.remove(2);
System.out.println(al);

al.add("java");//Arraylist can store duplicate elements.
System.out.println(al);
//get is used to fetch an element from a specific index.
System.out.println(al.get(2));

//traversal using for loop
for(int i=0; i<al.size(); i++) {
	System.out.println(al.get(i));
}

//traversal using for-each loop
//for(object-type variable : collections)
//if the ArrayList is non generic(contains objects belonging to different data types)
for(Object obj : al) //for each object obj in ArrayList al 
{
	System.out.println(obj);
}
//if the array list is generic /a String ArrayList
/*for(String s : al)    //for each String s in ArrayList al 
 * {
 * System.out.println(s);
 * }
 */

//if the array list is generic /a Integer ArrayList
/*for(Integer i : al)//for each Integer i in ArrayList al 
* {
* System.out.println(i);
* }
*/

//traversal using iterator()
Iterator itr=al.iterator();//assume tha the cursor points to the zeroth index in ArraryList.
while(itr.hasNext()) //element check,checking whether there is an element present in the location to where the cursor is pointing
{
	System.out.println(itr.next());//element print,+ repoint cursor to next position(print+point)
}
}

}
