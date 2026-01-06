package Loops;

public class CheckPrime {
	
	public void isPrime(int num) {
		
		int count=0;
		for(int i=1; i<=num; i++) {
			
			if(num % i == 0 ) {
				count++;
			}
			}
			if(count==2) {
				System.out.println("prime");
			}
			else {
				System.out.println(" not a prime");
			}
		}
	
		
	public static void main(String[] args) {
		CheckPrime obj=new CheckPrime();
		obj.isPrime(4);

	}

}
