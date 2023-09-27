package com.gl.sorts;

import java.util.Comparator;

public class IdSorter implements Comparator <Student> {

	/*
	 * list [s1,s2,s3,s4]
	 */
	@Override
	public int compare(Student stud1, Student stud2) {
		// TODO Auto-generated method stub
		if(stud1.getStudId().compareTo(stud2.getStudId()) > 0)
		{
			return 1;
		}
		else if (stud1.getStudId().compareTo(stud2.getStudId()) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
