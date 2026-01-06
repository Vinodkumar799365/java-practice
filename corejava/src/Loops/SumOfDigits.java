package Loops;

public class SumOfDigits {
	
	public void digitsSum(int num) {
		int sum=0;
		int temp=num;
		while(temp != 0) {
			int digit = temp%10;
			sum += digit;
			temp /= 10;
		}
		System.out.println("sum of digits :"+sum);
	}

	public static void main(String[] args) {
		SumOfDigits sum=new SumOfDigits();
		sum.digitsSum(567);

	}

}
