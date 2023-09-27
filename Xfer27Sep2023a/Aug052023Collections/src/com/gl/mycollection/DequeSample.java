package com.gl.mycollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeSample {

	Deque <String> myDeque = new ArrayDeque<String>();
	public void populateDeque()
	{
		myDeque.add("Harsha");
		myDeque.add("Suman");
		myDeque.add("Rajesh");
		myDeque.add("Manu");
		myDeque.add("Preethi");
		myDeque.add("Keerthana");
		myDeque.add("Mahesh");
		myDeque.add("Suresh");
		myDeque.addFirst("AMarendra");
		myDeque.addLast("Zeenat");
	}
	public void fetchDeQueElementsThruIter()
	{
		Iterator <String> deqIter = myDeque.iterator();
		while(deqIter.hasNext())
		{
			String strEmp = deqIter.next();
			System.out.println(strEmp);
		}
	}
	public void fetchDeQueDescElementsThruIter()
	{
		Iterator <String> deqIter = myDeque.descendingIterator();
		while(deqIter.hasNext())
		{
			String strEmp = deqIter.next();
			System.out.println(strEmp);
		}
	}
	public void fetchThruPeek()
	{
		System.out.println("First Element ");
		System.out.println(myDeque.peekFirst());
		System.out.println("Last Element");
		System.out.println(myDeque.peekLast());
	}
	public void fetchThruRemove()
	{
		while(!myDeque.isEmpty())
		{
			String empQ = myDeque.remove();
			System.out.println("Removed Element from Deque "+empQ);
		}
		int dequeSize = myDeque.size();
		System.out.println("Size after removal of all ellements in DEque "+dequeSize);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DequeSample ds = new DequeSample();
		ds.populateDeque();
		ds.fetchDeQueElementsThruIter();
		System.out.println("--------------DEscending------------");
		ds.fetchDeQueDescElementsThruIter();
		System.out.println("---------------PEEK usage---------");
		ds.fetchThruPeek();
		System.out.println("---------------Remove usage---------");
		ds.fetchThruRemove();
	}

}
