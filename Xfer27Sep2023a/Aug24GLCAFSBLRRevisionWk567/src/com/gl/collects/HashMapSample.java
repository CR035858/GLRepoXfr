package com.gl.collects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSample {

	HashMap <String,Employee> hMap = new HashMap<String,Employee>();
	// Set is Unique
	public void populateHashMap()
	{
		Employee e1 = new Employee("E001","Harish","RTNagar","8939939399",1000);
		hMap.put("E001", e1);
		hMap.put("E002", new Employee("E002","Kiran","RTNagar","8939967399",1000));
		hMap.put("E003", new Employee("E003","Mahesh","Koramangala","8989939399",2000));
		hMap.put("E004",  new Employee("E004","Suresh","Malleswaram","8937639399",3000));
		hMap.put("E005", new Employee("E005","Mahima","Vijayanagar","8939329399",4000));
		hMap.put("E006", new Employee("E006","Sumana","Jayanagar","8939938299",5000));
		hMap.put("E006", new Employee("E007","Subhash","Indiranagar","4359938299",4500));
	}
	//Over Write not over riding
	public void fetchHashMapDataThruEntrySet()
	{
		//System.out.println(hMap);
		
		Set <String> myKeys = hMap.keySet();
		
		Set <Entry <String,Employee>>  myEntrySet = hMap.entrySet(); 
		Iterator <Entry<String,Employee>> entryIter = myEntrySet.iterator();
		while(entryIter.hasNext())
		{
			Entry <String,Employee> myEntry = entryIter.next();
			System.out.println("The Key "+myEntry.getKey()+" Corresponding Value Object is "+myEntry.getValue());
		}
		
	}
	/*public void calculateNettSalary(Employee e,int x)
	{
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapSample hms = new HashMapSample();
		hms.populateHashMap();
		hms.fetchHashMapDataThruEntrySet();

	}

}
