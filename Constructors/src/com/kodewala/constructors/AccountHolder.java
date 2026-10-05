package com.kodewala.constructors;

public class AccountHolder {

	int amount;
	String account;
	String name;
	String phoneNumber;

	AccountHolder(int _amount, String _account, String _name, String _phoneNumber) {
		this.amount = _amount;
		this.account = _account;
		this.name = _name;
		this.phoneNumber = _phoneNumber;
	}

	public void showAccountDetails() {
		System.out.println("Amount: " + amount);
		System.out.println("Account: " + account);
		System.out.println("Account Name: " + name);
		System.out.println("Phone Number: " + phoneNumber);
	}

}
