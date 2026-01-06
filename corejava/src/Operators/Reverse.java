package Operators;

public class Reverse {
	
	public void reverseNum(int n) {
		
		 int tens = n / 10;
	        int ones = n % 10;

	        int rev = ones * 10 + tens;
	        System.out.println(rev);
	}

	public static void main(String[] args) {
		Reverse rs=new Reverse();
		rs.reverseNum(23);

	}

}
