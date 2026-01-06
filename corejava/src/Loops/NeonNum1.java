package Loops;

public class NeonNum1 {
	
	public boolean getNeon(int num) {
		
		int temp=num;
		int square=num * num;
		int sum=0;
		while(square != 0) {
			int rem=square % 10;
			sum = sum + rem;
			square /=10;
	}
		return sum==temp;
	}

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
		boolean result=new NeonNum1().getNeon(i);
		if(result) {
			System.out.println(i);
		}
		}
	}

}
