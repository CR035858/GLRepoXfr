package com.gl.mycollection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample {

	// javac ArrayListSample.java
	// java ArrayListSample One Two Three--args[0] args[1] args[2]
	/*java ArrayListSample One Two Three  fourr five
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee Customer Product
		ArrayList myList = new ArrayList(); 
		/*
		 * ArrayList <Employee> employees = new ArrayList<Employee>()
		 * 
		 * */
		 
		myList.add("Hello");
		myList.add(2000); // Boxing UnBoxing
		myList.add(23.45);
		myList.add(true);
		Iterator iter1 = myList.iterator();
		while(iter1.hasNext())
		{
			Object o = iter1.next(); // typeof [general]
			String s = (String)iter1.next();
			System.out.println("Object in ArrayList "+o);
		}
		

	}

}
