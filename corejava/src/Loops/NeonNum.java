package Loops;

public class NeonNum {

	public static void main(String[] args) {
		
		int num=9;
		int square=num * num;
		int sum=0;
		while(square != 0) {
			int rem=square % 10;
			sum = sum + rem;
			square /=10;
		}
		System.out.println((sum == num)?"Neon number" : "not a Neon number");
		

	}

}
