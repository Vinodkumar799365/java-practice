package corejava;

public class Car1 {
	
	String modelname;
	double price;
	
		
		public void displayCar(Car c) {
			System.out.println("car brand : "+c.modelname);
			System.out.println("car price : "+c.price);
			
		}

	public static void main(String[] args) {
		Car1 mycar=new Car1();
		mycar.modelname="Tesla";
		mycar.price=150000;
		
		System.out.println("car brand :"+mycar.modelname);
		System.out.println("car price :"+mycar.price);
		
		
	}

}
