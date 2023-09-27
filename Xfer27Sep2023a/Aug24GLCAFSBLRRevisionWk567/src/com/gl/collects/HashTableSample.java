package com.gl.collects;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableSample {
	
	Hashtable <String,Employee> hTable = new Hashtable<>();
	/*
	 * foreach fastest
	 * Iterator
	 * enumeration
	 */
	public void populateHashTable()
	{
		Employee e1 = new Employee("E001","Harish","RTNagar","8939939399",1000);
		hTable.put("E001", e1);
		hTable.put("E002", new Employee("E002","Kiran","RTNagar","8939967399",1000));
		hTable.put("E003", new Employee("E003","Mahesh","Koramangala","8989939399",2000));
		hTable.put("E004",  new Employee("E004","Suresh","Malleswaram","8937639399",3000));
		hTable.put("E005", new Employee("E005","Mahima","Vijayanagar","8939329399",4000));
		hTable.put("E006", new Employee("E006","Sumana","Jayanagar","8939938299",5000));
		hTable.put("E006", new Employee("E007","Subhash","Indiranagar","4359938299",4500));
	}
	public void fetchHashTableData()
	{
		Enumeration <String> keyEnumer = hTable.keys();
		while(keyEnumer.hasMoreElements())
		{
			String myKey = keyEnumer.nextElement();
			System.out.println("The Value Object for the Key "+myKey+" Is :"+hTable.get(myKey));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTableSample hts = new HashTableSample();
		hts.populateHashTable();
		hts.fetchHashTableData();
	}

}
