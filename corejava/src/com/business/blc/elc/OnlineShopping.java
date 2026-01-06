package com.business.blc.elc;

public class OnlineShopping {
	int productid;
	String productname;
	double productprice;
	int productquantity;
	
	public int getProductId() {
		return productid;
	}
	public String getProductName() {
		return productname;
	}
	public double getProductPrice() {
		return productprice;
	}
	public int getProductQuantity() {
		return productquantity;
	}
	
	public void setProductId(int id) {
		productid=id;
	}
	public void setProductName(String name) {
		productname=name;
	}
	public void setProductPrice(double price) {
		productprice=price;
	}
	public void setProductQuantity(int quantity) {
		productquantity=quantity;
	}
	
	public String displayData() {
		return "productid :"+productid+"\nproductname :"+productname+"\nproductprice :"+productprice+"\nproductquantity :"+productquantity;
	}

}
