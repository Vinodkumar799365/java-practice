package Operators;

public class Ternary {
	public void maxTwo(int a,int b) {
		
		int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);
		
	}

	public static void main(String[] args) {
		Ternary tr=new Ternary();
		tr.maxTwo(20, 10);

	}

}
