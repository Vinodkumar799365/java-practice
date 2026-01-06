package Conditional.Statements;

public class SwitchGender {
	public void getGender(String gender) {
		switch(gender) {
		case "male":
			System.out.println("gender is male");
			break;
		case "female":
			System.out.println("gender is female");
			break;
		case "trans":
			System.out.println("gender is others");
			break;
			default:
				System.out.println("gender is others");
		}
	}

	public static void main(String[] args) {
		SwitchGender obj=new SwitchGender();
		obj.getGender("male");
		
	}

}
