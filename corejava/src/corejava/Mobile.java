package corejava;

public class Mobile {
	static String storename;
	String brand;
	double price;
	Mobile(String brand, double price){
		this.brand=brand;
		this.price=price;
	}
	public void showDetails() {
		System.out.println("store name :"+storename);
		System.out.println("mobile brand :"+brand);
		System.out.println("mobile price :"+price);
		System.out.println("-----------------------");
	}

	public static void main(String[] args) {
		storename="Tech World";
		Mobile mobile1=new Mobile("Apple",1200);
		Mobile mobile2=new Mobile("Samsung",900);
		mobile1.showDetails();
		mobile2.showDetails();
	}

}
