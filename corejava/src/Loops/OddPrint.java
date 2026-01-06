package Loops;

public class OddPrint {
	
	public void printOdd() {
		
		for(int i = 1; i <= 15; i += 2) {
		    System.out.println(i);
		}

	}

	public static void main(String[] args) {
		OddPrint on=new OddPrint();
		on.printOdd();

	}

}
