package com.business.blc.elc;

public class OnlineShoppingSystem {

	public static void main(String[] args) {
		OnlineShopping os=new OnlineShopping();
		os.setProductId(15);
		os.setProductName("thanos");
		os.setProductPrice(99000);
		os.setProductQuantity(10);
		System.out.println(os.displayData());
		

	}

}
