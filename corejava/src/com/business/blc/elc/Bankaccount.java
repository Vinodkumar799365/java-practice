package com.business.blc.elc;

public class Bankaccount {
	long accountnumber;
	String holdername;
	double accountbalance;
	
	public long getAccountNumber() {
		return accountnumber;
	}
	public String getHolderName() {
		return holdername;
	}
	public double getAccountBalance() {
		return accountbalance;
	}
	
	public void setAccountNumber(long number) {
		accountnumber=number;
	}
	public void setHolderName(String name) {
		holdername=name;
	}
	public void setAccountBalance(double balance) {
		accountbalance=balance;
	}
	
	public String displayData() {
		return "accountnumber :"+accountnumber+"\nholdername :"+holdername+"\naccountbalance :"+accountbalance;
	}
}
