package corejava;

public class Patask4 {
		static String hospitalname;
		String patientname;
		int age;
	void Patient(String patientname, int age){
			this.patientname=patientname;
			this.age=age;
		}
		public void printDetails() {
			System.out.println("hospital name :"+hospitalname);
			System.out.println("patient name :"+patientname);
			System.out.println("patient age :"+age);
			System.out.println("--------------------");
		}

		public static void main(String[] args) {
			hospitalname="City care Hospital";
			Patask4 patask=new Patask4();
			patask.printDetails();
			 
			
		}


}
