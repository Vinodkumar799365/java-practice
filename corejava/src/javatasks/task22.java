package javatasks;

public class task22 {
	static int sub1=85;
	static int sub2=90;
	static int sub3=80;
	public static void totalMarks() {
		int total=sub1+sub2+sub3;
		System.out.println("totalmarks:"+total);
	}
	public static void avgMarks() {
		double avg=sub1+sub2+sub3/3;
		System.out.println("avgmarks:"+avg);
	}

	public static void main(String[] args) {
		totalMarks();
		avgMarks();

	}

}
