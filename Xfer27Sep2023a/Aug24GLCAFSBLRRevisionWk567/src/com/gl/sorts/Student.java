package com.gl.sorts;

public class Student  {

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

}

