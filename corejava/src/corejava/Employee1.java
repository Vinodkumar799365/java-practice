package corejava;

public class Employee1 {
	String name;
	double salary;
	
	public void increaseSalary(Employee1 e) {
		e.salary=e.salary+(e.salary * 0.10);
		
	}
		
	public static void main(String[] args) {
		Employee1 emp=new Employee1();
		emp.name="vinodkumar";
		emp.salary=50000;
		emp.increaseSalary(emp);
		
		System.out.println("increased of "+emp.name+" salary is : "+emp.salary);
		
		

	}

}
