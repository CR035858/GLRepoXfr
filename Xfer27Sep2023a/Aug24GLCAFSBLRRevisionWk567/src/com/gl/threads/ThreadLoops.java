package com.gl.threads;

public class ThreadLoops implements Runnable {

	Thread t1;
	public ThreadLoops()
	{
		t1 = new Thread(this,"Child Thread");
		System.out.println("Child Thread "+t1);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("In The Child Thread....");
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread Loop "+(i+1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" In The Main Thread...");
		System.out.println("Invoking Child Thread.....");
		ThreadLoops tloop = new ThreadLoops();
		tloop.t1.start();
		try {
			tloop.t1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread Loop "+(i+1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exiting Main Thread....");

	}

}
