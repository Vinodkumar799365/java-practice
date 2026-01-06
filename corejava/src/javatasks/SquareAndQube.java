package javatasks;

public class SquareAndQube {
	static int num=5;
	public static int square() {
		return num*num;
		//System.out.println("square :"+);
	}
	public static void cube() {
		int sq=square();
		int cube=sq*num;
		System.out.println("cube is :"+cube);
	}

	public static void main(String[] args) {
		cube();

	}

}
