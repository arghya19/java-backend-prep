package com.kodewala.arrays1;

public class CustomersSBI {
	String customerName;
	String accountBalance;
	String mobileNumber;

	public CustomersSBI() {

	}

	public CustomersSBI(String _customerName, String _accountBalance, String _mobileNumber) {
		this.customerName = _customerName;
		this.accountBalance = _accountBalance;
		this.mobileNumber = _mobileNumber;
	}

	void calculateLowBalance(CustomersSBI cs[]) {
		for (CustomersSBI s : cs) {
			if (Integer.parseInt(s.accountBalance) < 2000) {
				System.out.println("Customer Name: " + s.customerName);
			}
		}
	}
}
