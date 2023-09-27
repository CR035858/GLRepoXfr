package com.gl.threads;

public class ThreadClass extends Thread{
	
	public ThreadClass()
	{
		System.out.println("ChildThread "+this); // is an instance of the current class
		start();
	}
	public void run()
	{
		System.out.println("Entering Child Thread");
		System.out.println("Executing Child Thread");
		System.out.println("Exiting Child Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" In The Main Thread.....");
		System.out.println("Invoking Child Thread.....");
		ThreadClass mt = new ThreadClass();
		System.out.println("Back in Main Thread");
		System.out.println("Exiting Main Thread......");
	}

}
