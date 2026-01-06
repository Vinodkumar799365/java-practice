package com.business.blc.elc;

public class BankaccountManagement {

	public static void main(String[] args) {
		Bankaccount ba=new Bankaccount();
		ba.setAccountNumber(9876543210l);
		ba.setHolderName("sriniya");
		ba.setAccountBalance(1054000);
		System.out.println(ba.displayData());

	}

}
