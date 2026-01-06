package Conditional.Statements;

public class Divisible5_11 {
	
	public void divisibleCheck(int num) {
	 if (num % 5 == 0 && num % 11 == 0) {
         System.out.println(num + " is divisible by both 5 and 11");
     } else {
         System.out.println(num + " is not divisible by both 5 and 11");
     }
	}

	public static void main(String[] args) {
		Divisible5_11 obj=new Divisible5_11();
		obj.divisibleCheck(55);
		obj.divisibleCheck(45);
		
	}

}
