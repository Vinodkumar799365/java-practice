package javatasks;

public class LocalAndStatic {
	static int rate=10;
	public static void calcAmount() {
		int amount=500;
		int total=amount+rate;
		System.out.println(total);
		
	}

	public static void main(String[] args) {
		calcAmount();

	}

}
