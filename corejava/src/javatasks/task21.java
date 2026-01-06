package javatasks;

public class task21 {
	static double radius=5;
	public static void area() {
		double area=3.14*radius*radius;
		System.out.println("area of circle:"+area);
	}
	public static void perimeter() {
		double perimeter=2*3.14*radius;
		System.out.println("perimetr of circle:"+perimeter);
	}

	public static void main(String[] args) {
		area();
		perimeter();

	}

}
