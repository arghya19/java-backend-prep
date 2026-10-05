package com.example.constructor;

public class Operation {

	String stuMobile;
	public Operation(String _stuMobile) {
		this.stuMobile = _stuMobile;
	}
	void studentSignUp() {
		System.out.println("Calling Sign Up..");
		User u = new User();
	}
	
	void validate() {
		if(stuMobile.equals("")) {
			System.out.println("Mobile number not given!");
		}else {
			studentSignUp();
		}
	}
}
