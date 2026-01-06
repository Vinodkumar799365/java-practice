package Loops;

public class Amstrong {
	
	public int getPower(int base, int exp) {
		int power=1;
		for(int i=1; i<=exp; i++) {
			power=power * base;
		}
		return power;
	}
	
	public int getPowerOfNum(int num) {
		int count =0;
		while(num != 0) {
			count++;
			num /=10;
		}
		return count;
	}
	
	public boolean isAmstrong(int num) {
		int count=getPowerOfNum(num);
		int temp=num;
		int sum=0;
		while(num != 0) {
			int rem=num%10;
			sum=sum+getPower(rem,count);
			num /=10;
		}
		return sum == temp;
	}

	public static void main(String[] args) {
		for(int i=1; i<=10000; i++) {
			boolean result=new Amstrong().isAmstrong(i);
			if(result) {
				System.out.println(i);
			}
			
		}
	
	}

}
