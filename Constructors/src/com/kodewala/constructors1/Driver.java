package com.kodewala.constructors1;

public class Driver {

	public static void main(String[] args) {
		Account acc = new Account();
		System.out.println(acc.amount+", "+acc.name);
		Account acc1 = new Account(200, "Arghya");
		System.out.println(acc1.amount + ", " + acc1.name);
		Account acc2 = new Account("Raj", 300);
		System.out.println(acc2.amount + ", " + acc2.name);
	}
}
