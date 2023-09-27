package com.gl.sorts;

import java.util.Comparator;

public class CitySorter implements Comparator <Student>{

	@Override
	public int compare(Student stud1, Student stud2) {
		// TODO Auto-generated method stub
		if(stud1.getStudCity().compareTo(stud2.getStudId()) > 0)
		{
			return 1;
		}
		else if (stud1.getStudCity().compareTo(stud2.getStudCity()) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	

}
