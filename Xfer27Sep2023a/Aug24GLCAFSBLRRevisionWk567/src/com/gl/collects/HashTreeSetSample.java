package com.gl.collects;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashTreeSetSample {

	HashSet <String> hSet = new HashSet<>();
	TreeSet <String> tSet = new TreeSet<>();
	public void populateHashSet()
	{
		hSet.add("Faridabad");
		hSet.add("Ernakulam");
		hSet.add("Coimbatore");
		hSet.add("Mumbai");
		hSet.add("Bangalore");
		hSet.add("Delhi");
		hSet.add("Ahmedabad");
		hSet.add("Ahmedabad");
	}
	public void fetchHashSetData()
	{
		Iterator <String> hsIter = hSet.iterator();
		
		System.out.println("Hash Set Objects .......");
		while(hsIter.hasNext())
		{
			String setObject = hsIter.next();
			System.out.println(setObject);
		}
	}
	public void populateTreeSet()
	{
		tSet.add("Faridabad");
		tSet.add("Ernakulam");
		tSet.add("Coimbatore");
		tSet.add("Mumbai");
		tSet.add("Bangalore");
		tSet.add("Delhi");
		tSet.add("Ahmedabad");
		tSet.add("Ahmedabad");
	}
	public void fetchTreeSetData()
	{
		Iterator <String> tsIter = tSet.iterator();
		
		System.out.println("Tree Set Objects .......");
		while(tsIter.hasNext())
		{
			String treeObject = tsIter.next();
			System.out.println(treeObject);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTreeSetSample htss = new HashTreeSetSample();
		htss.populateHashSet();
		htss.fetchHashSetData();
		System.out.println("------------------");
		htss.populateTreeSet();
		htss.fetchTreeSetData();

	}

}
