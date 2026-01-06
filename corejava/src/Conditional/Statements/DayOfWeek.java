package Conditional.Statements;

public class DayOfWeek {
	public void printDay(int days) {
		switch(days) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
			default:
				System.out.println("not a valid day");
		}
	}
	public void getDay(int day) {
		if(day == 6 || day == 7) {
		    System.out.println("the day is weekend ");
		}else {
			System.out.println("working day");
		}
				
	}

	public static void main(String[] args) {
		DayOfWeek dow=new DayOfWeek();
		dow.printDay(4);
		dow.getDay(4);
		

	}

}
