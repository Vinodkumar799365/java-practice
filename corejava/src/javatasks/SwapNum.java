package javatasks;

public class SwapNum {
	static int x=10,y=20;
	public static void swap() {
		int temp;
		System.out.println("before swapping :"+x);
		temp=x;
		x=y;
		y=temp;
		System.out.println("after swapping :"+x);
	}

	public static void main(String[] args) {
		swap();
		

	}

}
