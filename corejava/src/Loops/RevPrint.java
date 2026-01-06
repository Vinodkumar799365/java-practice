package Loops;

public class RevPrint {
	public void printReverse() {
		for(int i=10; i >= 1; i--) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		RevPrint rp=new RevPrint();
		rp.printReverse();

	}

}
