package Operators;

public class SwapXOR {
	public void swapValue(int a,int b) {
		
		    a = a ^ b;
	        b = a ^ b;
	        a = a ^ b;

	        System.out.println("a = " + a + ", b = " + b);
	}

	public static void main(String[] args) {
		SwapXOR swp=new SwapXOR();
		swp.swapValue(10, 20);

	}

}
