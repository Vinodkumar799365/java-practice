package Operators;

public class Unary {
	public void evenOdd(int n) {
		
        if(n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        
	}

	public static void main(String[] args) {
		Unary un=new Unary();
			un.evenOdd(7);
			un.evenOdd(10);

	}

}
