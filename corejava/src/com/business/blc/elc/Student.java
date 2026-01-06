package com.business.blc.elc;

public class Student {
	String studentname;
	String studentbranch;
	String studentcollege;
	int studentage;
	public String getStudentName() {
		return studentname;
	}
	public String getStudentBranch() {
		return studentbranch;
	}
	public String getStudentCollege() {
		return studentcollege;
	}
	public int getstudentAge() {
		return studentage;
	}
	public void setStudentName(String name) {
		studentname=name;
	}
	public void setStudentBranch(String branch) {
		studentbranch=branch;
	}
	public void setStudentCollege(String college) {
		studentcollege=college;
	}
	public void setStudentAge(int age) {
		studentage=age;
	}
	
	public String displayData() {
		return "studentname :"+studentname+"\nstudentbranch :"+studentbranch+"\nstudentcollege :"+studentcollege+"\nstudentage :"+studentage;
	}

}
