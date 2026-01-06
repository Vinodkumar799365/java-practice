package com.business.blc.elc;

public class StudentNSData {

	public static void main(String[] args) {
		
		StudentNS st=StudentNS.getStudentDetails("virat kohli","cricket","BCCI INDIA",39);
		System.out.println(st.getStudentName());
		System.out.println(st.getStudentBranch());
		System.out.println(st.getStudentCollege());
		System.out.println(st.getstudentAge());
		
		

	}

}
