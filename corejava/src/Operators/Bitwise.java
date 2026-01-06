package Operators;

public class Bitwise {
	public void bitValue(int a,int b) {
		
		System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
	}

	public static void main(String[] args) {
		Bitwise bt=new Bitwise();
		bt.bitValue(20, 20);

	}

}
