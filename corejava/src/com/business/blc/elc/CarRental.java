package com.business.blc.elc;

public class CarRental {
	
	int carid;
	String carbrand;
	String carmodel;
	double rentpriceperday;
	
	public int getCarId() {
		return carid;
	}
	public String getCarBrand() {
		return carbrand;
	}
	public String getCarModel() {
		return carmodel;
	}
	public double getRentPricePerday() {
		return rentpriceperday;
	}
	
	public void setCarId(int id) {
		carid=id;
	}
	public void setCarBrand(String brand) {
		carbrand=brand;
	}
	public void setCarModel(String model) {
		carmodel=model;
	}
	public void setRentPricePerDay(double price) {
		rentpriceperday=price;
	}
	
	public String displayData() {
		return "carid :"+carid+"\ncarbrand :"+carbrand+"\ncarmodel :"+carmodel+"\nrentpriceperday :"+rentpriceperday;	}
	

}
