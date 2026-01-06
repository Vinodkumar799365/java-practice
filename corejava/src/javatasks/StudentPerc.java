package javatasks;

public class StudentPerc {
	static int m1=78;
	static int m2=85;
	static int m3=90;
	public static void total() {
		int total=m1+m2+m3;
		System.out.println("totao :"+total);
	}
	public static void percent() {
		int total=m1+m2+m3;
		double percent=(total*100)/300;
		System.out.println("perc:"+percent);
	}

	public static void main(String[] args) {
		total();
		percent();
		

	}

}
