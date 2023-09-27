package com.gl.mycollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapSample {
	HashMap <String,Employee> employeeMap = new HashMap <String,Employee> ();

	public void populateHashMap()
	{
		
		Employee e1 = new Employee("E001","Harsha","RTNagar","7488484884",1000.0f);
		employeeMap.put("E001", e1);
		employeeMap.put("E002",new Employee("E002","Kiran","Malleswaram","7488456884",1000.0f));
		employeeMap.put("E003",new Employee("E003","Rajesg","Koramangala","7456484884",2000.0f));
		employeeMap.put("E004",new Employee("E004","Suman","Marathhalli","7488467884",3000.0f));
		employeeMap.put("E005",new Employee("E005","Mahesh","Indiranagar","7478484884",4000.0f));
		employeeMap.put("E006",new Employee("E006","Keerthana","KRPuram","7488478984",5000.0f));
		employeeMap.put("E007",new Employee("E007","Rajendra","KRPuram","7486548984",6000.0f));
	}
	public void fetchHashMapData()
	{
		Set <String> myKeySet = employeeMap.keySet();
		
		Iterator <String> keyIter = myKeySet.iterator();
		while(keyIter.hasNext())
		{
			String myKey = keyIter.next();
			System.out.println("The Object for the Key :"+myKey+" is :" +employeeMap.get(myKey));
		}
		
	}
	public void fetchValuesOfHashMap()
	{
		Collection <Employee> collection = employeeMap.values();
		Iterator <Employee> empIter = collection.iterator();
		System.out.println("Employees in HashMap");
		while(empIter.hasNext())
		{
			Employee e = empIter.next();
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapSample hms = new HashMapSample();
		hms.populateHashMap();
		hms.fetchHashMapData();
		hms.fetchValuesOfHashMap();

	}

}
