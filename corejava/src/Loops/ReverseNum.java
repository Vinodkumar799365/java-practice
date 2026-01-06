package Loops;

public class ReverseNum {
	
	public void getReverse(int num) {
		int temp=num;
		int sum=0;
		while(num !=0 ) {
			int rev=num % 10;
			sum = sum* 10 + rev;
			num /=10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		ReverseNum num=new ReverseNum();
		num.getReverse(123);

	}

}
