package javatasks;

public class CurrencyConv {
	static double dr=84.5;
	public static void convINR(double usd) {
		double inr=usd*dr;
		System.out.println(inr);
	}

	public static void main(String[] args) {
		convINR(10);
		convINR(15);
		convINR(20);
	}

}
