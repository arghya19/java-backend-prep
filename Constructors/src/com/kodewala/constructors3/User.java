package com.kodewala.constructors3;


class SuperUser extends Object {

}

public class User extends SuperUser {
	String userName; //state / data / variables / attributes
	String userId;
	String mobile;
	int userAge;

	User(String _userName, String _userId, String _mobile) {
		this(400);
		this.userName = _userName;
		this.userId = _userId;
		this.mobile = _mobile;
	}
	
	User(){
		System.out.println("Default constructor start...");
	}
	
	User(int _age){
		this.userAge = _age;
	}

}
