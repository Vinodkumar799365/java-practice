package com.business.blc.elc;

public class CarRentalSystem {

	public static void main(String[] args) {
		CarRental cr1=new CarRental();
		cr1.setCarId(5);
		cr1.setCarBrand("maruti suzuti");
		cr1.setCarModel("R8RR");
		cr1.setRentPricePerDay(4000);
		System.out.println(cr1.displayData());
		System.out.println("---------------------");
		
		CarRental cr2=new CarRental();
		cr2.setCarId(10);
		cr2.setCarBrand("swift desire");
		cr2.setCarModel("latest s8");
		cr2.setRentPricePerDay(3500);
		System.out.println(cr2.displayData());
		

	}

}
