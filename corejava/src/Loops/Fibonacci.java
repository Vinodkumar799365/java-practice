package Loops;

public class Fibonacci {
	
	public void getFibo(int n) {
		if(n >= 1) {
			System.out.println(0 +" ");
		}
		if(n >= 2) {
			System.out.println(1 +" ");
		}
		int first=0;
		int second=1;
		for(int i=3;i<=n;i++) {
			int nextnumber=first+second;
			System.out.println(nextnumber +" ");
			first=second;
			second=nextnumber;
		}
	}

	public static void main(String[] args) {
		Fibonacci fibo=new Fibonacci();
		fibo.getFibo(10);
	}

}
