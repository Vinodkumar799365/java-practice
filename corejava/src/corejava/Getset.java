package corejava;

public class Getset {
	String empname;
	String empdesg;
	double empsalary;
	public String getEmpName() {
		return empname;
	}
	public String getEmpDesg() {
		return empdesg;
	}
	public double getEmpSalary() {
		return empsalary;
	}
	public void setEmpName(String name) {
		empname=name;
	}
	public void setEmpDesg(String desg) {
		empdesg=desg;
	}
	public void setEmpSalary(double salary) {
		empsalary=salary;
	}
	
	//public String displayData() {
	//	return "empname :"+empname+"\nempdesg :"+empdesg+"\nempsalary :"+empsalary;
	//}

	public static void main(String[] args) {
		Getset obj=new Getset();
		obj.setEmpName("aegon");
		obj.setEmpDesg("computer science");
		obj.setEmpSalary(50000);
		System.out.println(obj.getEmpName());
		System.out.println(obj.getEmpDesg());
		System.out.println(obj.getEmpSalary());
		//System.out.println(obj.displayData());
		
		
	}

}
