package com.gl.threads;

public class SampleMainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println("The Current Thread "+t);

		/* Main
		 * Max_Priority - 10
		 * Norm_Priority - 5
		 * Min_Priority - 1
		 * */ 
		t.setName("NewThread");
		System.out.println("Thread Changed Name "+t);
		System.out.println("Thread goes to sleep for 1 sec");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread Started after Sleep");
	}

}
