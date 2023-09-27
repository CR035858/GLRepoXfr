package com.gl.mycollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListEmployees {

	ArrayList <Employee> employeesList = new ArrayList<Employee>();
	Scanner scan1 = new Scanner(System.in);
	public void populateArrayList()
	{
		Employee e1 = new Employee("E001","Harsha","RTNagar","7488484884",1000.0f);
		employeesList.add(e1);
		employeesList.add(new Employee("E002","Kiran","Malleswaram","7488456884",1000.0f));
		employeesList.add(new Employee("E003","Rajesg","Koramangala","7456484884",2000.0f));
		employeesList.add(new Employee("E004","Suman","Marathhalli","7488467884",3000.0f));
		employeesList.add(new Employee("E005","Mahesh","Indiranagar","7478484884",4000.0f));
		employeesList.add(new Employee("E006","Keerthana","KRPuram","7488478984",5000.0f));
		
		
	}
	public void fetchArrayListElements()
	{
		Iterator <Employee> empIter = employeesList.iterator();
		System.out.println("The Employees are................");
		while(empIter.hasNext())
		{
			//Employee employee = (Employee) empIter.next();
			Employee employee  = empIter.next();
			
			System.out.println(employee);
		}
		
	}
	public void searchEmployee()
	{
		int searchIdx;
		System.out.println("Enter the Index of the Employee You wish to see");
		searchIdx = scan1.nextInt();
		int size = employeesList.size(); //20  0 - 19
		if(searchIdx < (size-1))
		{
			Employee searchedEmployee = employeesList.get(searchIdx);
			System.out.println("The Employee in the Index "+searchIdx+" is "+searchedEmployee);
		}
		else
		{
			System.out.println("Sorry Out Of Range");
		}
		
		
		
	}
	public void deleteRecord()
	{
		int idx;
		System.out.println("Enter the Index of the Employee to delete");
		idx = scan1.nextInt();
		int size = employeesList.size();
		if( idx < (size-1))
		{
			employeesList.remove(idx);
		}
		else
		{
			System.out.println("Sorry Index out of range...");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListEmployees als = new ArrayListEmployees();
		als.populateArrayList();
		als.fetchArrayListElements();
		als.searchEmployee();
		
		als.deleteRecord();
		als.fetchArrayListElements();

	}

}
