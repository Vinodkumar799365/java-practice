package Operators;

public class Arithmetics {
	
	public void printData(int a,int b) {
		

	    System.out.println("Addition = " + (a + b));
	    System.out.println("Subtraction = " + (a - b));
	    System.out.println("Multiplication = " + (a * b));
	    System.out.println("Division = " + (a / b));
	    System.out.println("Modulus = " + (a % b));

		
	}
	



	public static void main(String[] args) {
		Arithmetics art=new Arithmetics();
		art.printData(100, 20);
		
	}

}
