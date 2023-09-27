package com.gl.sorts;

import java.util.Comparator;

public class ScoreSorter implements Comparator <Student> {

	@Override
	public int compare(Student stud1, Student stud2) {
		// TODO Auto-generated method stub
		if(stud1.getScore() > stud2.getScore())
		{
			return 1;
		}
		else if(stud1.getScore() < stud2.getScore())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
