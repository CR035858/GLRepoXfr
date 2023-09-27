package com.gl.sorts;

import java.util.ArrayList;
import java.util.Collections;

import com.gl.sorts.Student;

public class StudentSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Student> students = new ArrayList<Student>();
		students.add(new Student("S004","Babu","Ernakulam",76)); // this AH
		students.add(new Student("S003","Amar","Ahmedabad",86)); // s1   er
		students.add(new Student("S001","Francis","Bangalore",66));
		students.add(new Student("S005","Zeenat","Gandhinagar",96));
		students.add(new Student("S002","Yasmeen","Faridabad",56));
		System.out.println("Students UnSorted");
		for(Student s:students)
		{
			System.out.println(s);
		}
		System.out.println("-------------------");
		System.out.println("Students Sorted By Score");
		Collections.sort(students,new ScoreSorter());
		for(Student s:students)
		{
			System.out.println(s);
		}
		System.out.println("-------------------");
		System.out.println("Students Sorted By City");
		Collections.sort(students,new CitySorter());
		for(Student s:students)
		{
			System.out.println(s);
		}
		System.out.println("-------------------");
		System.out.println("Students Sorted By ID");
		Collections.sort(students,new IdSorter());
		for(Student s:students)
		{
			System.out.println(s);
		}
	}

}
