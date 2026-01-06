package Loops;

public class PrintNum {
	
	public void printNumbers() {
		
		for(int i = 5; i <= 50; i += 5) {
		    System.out.println(i);
		}

		
		for(int i=1 ; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		PrintNum pn=new PrintNum();
		pn.printNumbers();

	}

}
