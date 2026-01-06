package corejava;

public class calculators {
	public static int Addition(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public static int Subtraction(int a,int b) {
		int diff=a-b;
		return diff;
	}
	public static int Multiplication(int a,int b) {
		int product=a*b;
		return product;
	}
	public static int Division(int a, int b) {
		int quotient=a/b;
		return quotient;
	}
	public static void main(String [] args) {
		int result1=Addition(10,2);
		int result2=Subtraction(10,2);
		int result3=Multiplication(10,2);
		int result4=Division(10,2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
