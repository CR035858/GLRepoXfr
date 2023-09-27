package com.gl.collects;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapSample {
	TreeMap <String,Employee> tMap = new TreeMap<String,Employee>();
	public void populateTreeMap()
	{
		tMap.put("E005", new Employee("E005","Mahima","Vijayanagar","8939329399",4000));
		Employee e1 = new Employee("E001","Harish","RTNagar","8939939399",1000);
		tMap.put("E001", e1);
		tMap.put("E004",  new Employee("E004","Suresh","Malleswaram","8937639399",3000));
		tMap.put("E002", new Employee("E002","Kiran","RTNagar","8939967399",1000));
		tMap.put("E006", new Employee("E007","Subhash","Indiranagar","4359938299",4500));
		tMap.put("E003", new Employee("E003","Mahesh","Koramangala","8989939399",2000));
		
		
		//tMap.put("E006", new Employee("E006","Sumana","Jayanagar","8939938299",5000));
		
	}
	public void fetchTreeMapData()
	{

		
		Set <Entry <String,Employee>>  myEntrySet = tMap.entrySet(); 
		Iterator <Entry<String,Employee>> entryIter = myEntrySet.iterator();
		while(entryIter.hasNext())
		{
			Entry <String,Employee> myEntry = entryIter.next();
			System.out.println("The Key "+myEntry.getKey()+" Corresponding Value Object is "+myEntry.getValue());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMapSample tms = new TreeMapSample();
		tms.populateTreeMap();
		tms.fetchTreeMapData();

	}

}
