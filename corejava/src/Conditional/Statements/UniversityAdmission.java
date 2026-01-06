package Conditional.Statements;

public class UniversityAdmission {
	public String evaluateAdmission(int marks, boolean sportachievements){
		if ( marks >= 95 && marks <= 100) {
			return "admitted with scholarship";
		} else if (marks >= 85 && marks <= 94) {
			return "admitted without scholarship";
		} else if (marks >= 70 && marks <=84 && sportachievements ) {
			return "admitted under sports quota";
		} else if (marks >= 60 && marks <= 69) {
			return "interview required";
		} else {
			return "admission rejected";
		}
		
	}

	public static void main(String[] args) {
		UniversityAdmission obj=new UniversityAdmission();
		System.out.println(obj.evaluateAdmission(99, false));
		System.out.println(obj.evaluateAdmission(94, false));
		System.out.println(obj.evaluateAdmission(75, true));
		System.out.println(obj.evaluateAdmission(65, false));
		System.out.println(obj.evaluateAdmission(59, false));
		
	}

}
