package com.kodewala.constructors1;

public class Account {
	int amount;
	String name;
	
	Account(){
		System.out.println("This is default constructor.");
	}
	
	Account(int _amount,String _name) {
		System.out.println("Running: Account(int _amount,String _name)");
		this.amount = _amount;
		this.name = _name;
	}
	
	Account(String _name,int _amount){
		System.out.println("Running: Account(String _name,int _amount)");
		this.name = _name;
		this.amount = _amount;
	}
	
	
}
