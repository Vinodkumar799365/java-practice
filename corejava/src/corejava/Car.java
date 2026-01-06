package corejava;

public class Car {
	static String showroomname;
	String modelname;
	double price;
	
	Car(String modelname, double price){
		this.modelname=modelname;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("showroom name :"+showroomname);
		System.out.println("model name :"+modelname);
		System.out.println("car price :"+price);
		System.out.println("------------------------");

		
	}
	public static void main(String[] args) {
		showroomname="Elite Motors";
		Car car1 = new Car("Tesla Model 8",80000);
		Car car2 = new Car("BMW X5",75000);
		car1.displayDetails();
	    car2.displayDetails();
		

	}

}
