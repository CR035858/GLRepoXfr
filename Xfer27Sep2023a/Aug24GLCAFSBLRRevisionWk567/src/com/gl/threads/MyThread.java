package com.gl.threads;

public class MyThread implements Runnable{

	Thread t1;
	public MyThread()
	{
		t1 = new Thread(this,"Child Thread");
		System.out.println("Child Thread "+t1);
		t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Entering Child Thread");
		System.out.println("Executing  the Child Thread");
		System.out.println("Exiting Child Thread");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" In The Main Thread.....");
		System.out.println("Invoking Child Thread.....");
		MyThread mt = new MyThread();
		System.out.println("Back in Main Thread");
		System.out.println("Exiting Main Thread......");

	}

}
