package com.business.blc.elc;

public class StudentData {

	public static void main(String[] args) {
		Student st=new Student();
		st.setStudentName("milly bobby brown");
		st.setStudentBranch("marvel");
		st.setStudentCollege("hollywood");
		st.setStudentAge(29);
		System.out.println(st.displayData());

	}

}
