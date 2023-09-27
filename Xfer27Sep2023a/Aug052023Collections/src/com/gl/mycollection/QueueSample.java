package com.gl.mycollection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {

	PriorityQueue <String> employeeQ = new PriorityQueue<String>();
	
	public void populateQueue()
	{
		employeeQ.add("Harsha");
		employeeQ.add("Suman");
		employeeQ.add("Rajesh");
		employeeQ.add("Manu");
		employeeQ.add("Preethi");
		employeeQ.add("Keerthana");
		employeeQ.add("Mahesh");
		employeeQ.add("Suresh");
	}
	public void fetchQueueElements()
	{
		Iterator <String> qIter = employeeQ.iterator();
		while(qIter.hasNext())
		{
			String employeeStr = qIter.next();
			System.out.println(employeeStr);
		}
	}
	public void fetchThroughPeek()
	{
		
			String strEmp = employeeQ.peek();
			System.out.println("Peeked Employee "+strEmp);
			employeeQ.remove();
			String strEmp1 = employeeQ.peek();
			System.out.println("Next peeked Employee "+strEmp1);
		
	}
	public void fetchQueueThroughRemove()
	{
		
		while(employeeQ.isEmpty() == false)
		{
			String strEmp = employeeQ.remove();
			System.out.println("Removed Employee "+strEmp);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueSample qs = new QueueSample();
		qs.populateQueue();
		qs.fetchQueueElements();
		System.out.println("---------Fetch Using Peek-------");
		qs.fetchThroughPeek();
		System.out.println("------------Remove Method-------------");
		qs.fetchQueueThroughRemove();
		System.out.println("-----------Fetch Post Remove----");
		qs.fetchQueueElements();

	}

}
