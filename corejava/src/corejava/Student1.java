package corejava;

public class Student1 {
	String name;
	int marks;
	public static void printDetails(Student1 s) {
		System.out.println("student name :"+s.name);
		System.out.println("student marks :"+s.marks);
	}
	

	public static void main(String[] args) {
		Student1 stu=new Student1();
		stu.name="vinodkumar";
		stu.marks=92;
		stu.printDetails(stu);
		

	}

}
