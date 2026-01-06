package Conditional.Statements;

public class EvenAndOdd {
	
	public void evenOdd(int num) {

    if (num % 2 == 0) {

        System.out.println(num + " is Even");
    }
    else {
        System.out.println(num + " is Odd");
    }
	}

	public static void main(String[] args) {
		EvenAndOdd obj=new EvenAndOdd();
		obj.evenOdd(20);

	}

}
