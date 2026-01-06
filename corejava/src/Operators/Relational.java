package Operators;

public class Relational {
	
	public void largestNum(int a,int b,int c) {
		

        int largest = (a > b && a > c) ? a :
                      (b > c) ? b : c;

        System.out.println("Largest = " + largest);
		
	}

	public static void main(String[] args) {
		
		Relational rel=new Relational();
		rel.largestNum(20, 15, 30);

	}

}
