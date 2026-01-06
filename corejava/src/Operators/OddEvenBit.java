package Operators;

public class OddEvenBit {
	public void oddEven(int n) {
		
		if((n & 1)== 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		OddEvenBit oe=new OddEvenBit();
		oe.oddEven(17);
		oe.oddEven(12);

	}

}
