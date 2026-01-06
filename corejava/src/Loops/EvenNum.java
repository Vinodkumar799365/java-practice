package Loops;

public class EvenNum {
	public void printEven() {
		
		for(int i = 2; i <= 20; i += 2) {
		    System.out.println(i);
		}

	}

	public static void main(String[] args) {
		EvenNum en=new EvenNum();
		en.printEven();

	}

}
