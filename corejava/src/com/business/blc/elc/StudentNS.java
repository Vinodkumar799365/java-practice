package com.business.blc.elc;

public class StudentNS {
	
	
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
	
	public static StudentNS getStudentDetails(String studentname,String studentbranch,String studentcollege,int studentage) {
		
		StudentNS st=new StudentNS();
		st.setStudentName(studentname);
		st.setStudentBranch(studentbranch);
		st.setStudentCollege(studentcollege);
		st.setStudentAge(studentage);
		return st;
		
		
	}

}
