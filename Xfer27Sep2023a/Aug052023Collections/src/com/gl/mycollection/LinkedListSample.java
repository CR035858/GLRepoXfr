package com.gl.mycollection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSample {

	LinkedList <Employee> employeeLList = new LinkedList<Employee>();
	public void populateLinkedList()
	{
		Employee e1 = new Employee("E001","Harsha","RTNagar","7488484884",1000.0f);
		employeeLList.add(e1);
		employeeLList.add(new Employee("E002","Kiran","Malleswaram","7488456884",1000.0f));
		employeeLList.add(new Employee("E003","Rajesg","Koramangala","7456484884",2000.0f));
		employeeLList.add(new Employee("E004","Suman","Marathhalli","7488467884",3000.0f));
		employeeLList.add(new Employee("E005","Mahesh","Indiranagar","7478484884",4000.0f));
		employeeLList.add(new Employee("E006","Keerthana","KRPuram","7488478984",5000.0f));
		employeeLList.addFirst(new Employee("E007","Rajendra","KRPuram","7486548984",6000.0f));
		employeeLList.addLast(new Employee("E008","Nagendra","SRPuram","7656548984",7000.0f));
		
		
	}
	public void fetchLinkedListElements()
	{
		Iterator <Employee> empLLIter = employeeLList.iterator();
		while(empLLIter.hasNext())
		{
			Employee employee = empLLIter.next();
			System.out.println(employee);
		}
	}
	public void getReverseOrderedData()
	{
		Iterator <Employee> empDesIter = employeeLList.descendingIterator();
		System.out.println("-----------Employees in descending Order of Insertion");
		while(empDesIter.hasNext())
		{
			Employee employee = empDesIter.next();
			System.out.println(employee);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListSample lls = new LinkedListSample();
		lls.populateLinkedList();
		lls.fetchLinkedListElements();
		lls.getReverseOrderedData();

	}

}
