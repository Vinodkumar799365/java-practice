package javatasks;

public class task2 {
	static int a=20;
	static int b=30;
	public static int sum() {
		int total=a+b;
		System.out.println("sum:"+total);
		return total;
	}
	public static void average() {
		int total=sum();
		double average=total/2.0;
		System.out.println("average:"+average);
	}

	public static void main(String[] args) {
		average();
	}

}
