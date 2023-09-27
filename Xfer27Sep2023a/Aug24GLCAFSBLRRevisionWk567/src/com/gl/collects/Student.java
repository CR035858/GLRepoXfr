package com.gl.collects;

public class Student implements Comparable <Student>{

	String studId;
	String studName;
	String studCity;
	int score;
	
	public Student() {
		super();
	}

	public Student(String studId, String studName, String studCity, int score) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studCity = studCity;
		this.score = score;
	}

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudCity() {
		return studCity;
	}

	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studCity=" + studCity + ", score=" + score
				+ "]";
	}
/*
 * list [s2,s1,s3,s4]
 */
	/*@Override
	public int compareTo(Student student) {
		
		
		if(this.getStudCity().compareTo(student.getStudCity()) > 0)
		{
			return 1;
		}
		else if(this.getStudCity().compareTo(student.getStudCity()) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}*/
	
/*	@Override
	public int compareTo(Student student) {
		
		
		if(this.getStudId().compareTo(student.getStudId()) > 0)
		{
			return 1;
		}
		else if(this.getStudId().compareTo(student.getStudId()) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	} */
	// 11.53 to 11.59
	/*
	 * list [s2,s1,s3,s4]
	 */
	@Override
	public int compareTo(Student student) {
		
		
		if(this.getScore() > student.getScore())
		{
			return 1;
		}
		else if(this.getScore() < student.getScore())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}

//TODO Auto-generated method stub
		/*String str1 = "Hello";
		String str2 = "hello";
		str1.compareTo(str2);
		Amar Babu 
		Amar 104
		Aman 110
		Ernakulam Ahmedabad   65  - 70 = -5
		str1.compareTo(str2) 
		H72 h 104
		Hello Hello 0
		72 - 104 = -32
		*/