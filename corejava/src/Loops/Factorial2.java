package Loops;

public class Factorial2 {
	
	public void getFactorial(int num) {
		long fact=1;
		
		for(int i=1;i<=num; i++) {
			fact*=i;
			
			System.out.println(i +"! =" +fact);
		}
		
	}

	public static void main(String[] args) {
		Factorial2 fact=new Factorial2();
		fact.getFactorial(5);
	}

}
