package com.gl.mycollection;

import java.util.Iterator;
import java.util.Stack;

public class StackSample {

	Stack <String> myStack = new Stack<String>();
	
	public void populateStack()
	{
		
		myStack.push("Harsha");
		myStack.push("Suman");
		myStack.push("Rajesh");
		myStack.push("Manu");
		myStack.push("Preethi");
		myStack.push("Keerthana");
		myStack.push("Mahesh");
		myStack.push("Suresh");
	}
	public void fetchThruIterator()
	{
		Iterator <String> stIter = myStack.iterator();
		while(stIter.hasNext())
		{
			String str = stIter.next();
			System.out.println(str);
		}
	}
	public void fetchThruPop()
	{
		while(myStack.isEmpty() == false)
		{
			String strE = myStack.pop();
			System.out.println("Popped Element :"+strE);
		}
		int size = myStack.size();
		System.out.println("Size is "+size);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackSample ss = new StackSample();
		ss.populateStack();
		ss.fetchThruIterator();
		System.out.println("------------------");
		ss.fetchThruPop();
		

	}

}
