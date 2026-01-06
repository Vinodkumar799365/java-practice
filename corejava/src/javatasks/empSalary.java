package javatasks;

public class empSalary {
	static long basicsal=20000;
	static int bonus=5000;
	public static void calSalary() {
		long total=basicsal+bonus;
		System.out.println(total);
	}

	public static void main(String[] args) {
		calSalary();

	}

}
