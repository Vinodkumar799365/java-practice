package Conditional.Statements;

public class GradeCalc {
	public int checkConditions(int marks) {
		if(marks >= 90 && marks <=100 ) {
			return 1;
		}else if(marks >= 80 && marks <= 89) {
			return 2;
		}else if(marks >= 70 && marks <= 79) {
			return 3;
		}else if(marks >= 60 && marks <= 69) {
			return 4;
		}else if(marks >= 0 && marks <= 59){
			return 5;
		}else {
			return 6;
		}
	}
	public void printGrade(int gradecode) {
	
	switch(gradecode) {
	case 1:
	System.out.println("grade is : A ");
	break;
	case 2:
		System.out.println("grade is : B ");
		break;
	case 3:
		System.out.println("grade is : C ");
		break;
	case 4:
		System.out.println("grade is : D ");
		break;
	case 5:
		System.out.println("fail");
		break;
		default:
			System.out.println("is not a valid grade");
			break;
	}
	}


	public static void main(String[] args) {
		GradeCalc gc=new GradeCalc();
		int gradecode=gc.checkConditions(101);
		gc.printGrade(gradecode);
		
	}

}
