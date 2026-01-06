package Loops;

public class PerfectNum {
	
	public void getPerfectNum(int n) {
		int sum=0;
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				sum=sum+i;
			}
			if(sum==n) {
			System.out.println("Perfect number");
			}
			else {
				System.out.println("not perfect number");
			}
		}
	}

	public static void main(String[] args) {
		PerfectNum num=new PerfectNum();
		num.getPerfectNum(6);

	}

}
