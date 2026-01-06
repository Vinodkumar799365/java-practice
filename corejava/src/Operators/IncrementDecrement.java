package Operators;

public class IncrementDecrement {
	
	public void changeValue() {
		
		  int a = 5;
	        int b = a++ + ++a + a--;

	        System.out.println(a);  
	        System.out.println(b);
	}

	public static void main(String[] args) {
		IncrementDecrement inc=new IncrementDecrement();
		inc.changeValue();

	}

}
