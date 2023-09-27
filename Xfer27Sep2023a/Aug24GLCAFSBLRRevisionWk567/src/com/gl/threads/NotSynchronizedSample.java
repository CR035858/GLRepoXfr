package com.gl.threads;
class Thread1
{
	public /*synchronized*/ void call()
	{
		System.out.println(" Producing Goods Product1 ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Consuming Goods Product1");
	}
}
class ThreadX extends Thread
{
	Thread1 t;
	public ThreadX(Thread1 t)
	{
		this.t = t;
	}
	public void run()
	{
		synchronized(t)
		{
		t.call();
		}
		
		
	}
}
public class NotSynchronizedSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		ThreadX  tx1 = new ThreadX(t1);
		ThreadX  tx2 = new ThreadX(t1);
		tx1.start();
		tx2.start();

	}

}
