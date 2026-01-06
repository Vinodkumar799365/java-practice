package corejava;

public class Faculty {
	static String universityname;
	String facultyname;
	String department;
	Faculty(String facultyname,String department){
		this.facultyname=facultyname;
		this.department=department;
	}
	public void showFacultyDetails() {
		System.out.println("university name :"+universityname);
		System.out.println("faculty name :"+facultyname);
		System.out.println("department :"+department);
		System.out.println("----------------------");
	}

	public static void main(String[] args) {
		universityname="Stanford University";
		Faculty f1=new Faculty("Dr.Robert","computer science");
		Faculty f2=new Faculty("DR.Lisa","Physics");
		f1.showFacultyDetails();
		f2.showFacultyDetails();

	}

}
