package com.gl.mycollection;

import java.util.Stack;

public class StackEmployee {

	Stack <Employee> empStack = new Stack<Employee>();
	
	public void populateStack()
	{
		Employee e1 = new Employee("E001","Harsha","RTNagar","7488484884",1000.0f);
		empStack.push(e1);
		empStack.push(new Employee("E002","Kiran","Malleswaram","7488456884",1000.0f));
		empStack.push(new Employee("E003","Rajesg","Koramangala","7456484884",2000.0f));
		empStack.push(new Employee("E004","Suman","Marathhalli","7488467884",3000.0f));
		empStack.push(new Employee("E005","Mahesh","Indiranagar","7478484884",4000.0f));
		empStack.push(new Employee("E006","Keerthana","KRPuram","7488478984",5000.0f));
		
	}
	public void fetchStackThruPop()
	{
		while(empStack.isEmpty() == false)
		{
			Employee employee = empStack.pop();
			System.out.println(employee);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackEmployee se = new StackEmployee();
		se.populateStack();
		se.fetchStackThruPop();
	}

}
