package com.kodewala.constructors;

public class Driver {

	public static void main(String[] args) {
		AccountHolder user1 = new AccountHolder(2000, "101", "Arghya", "9876543210");
		AccountHolder user2 = new AccountHolder(4000, "102", "d", "9876543215");

		user1.showAccountDetails();
		user2.showAccountDetails();
	}

}
