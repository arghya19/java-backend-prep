package com.kodewala.constructors4;

public class MyTvUser {

	String name;
	String type;
	String country;
	String mobile;
	
	MyTvUser(String _name,String _type, String _country) {
		this.name = _name;
		this.type = _type;
		this.country = _country;
	}
	
	MyTvUser() {
		this("guestUserxxxxxx", "guest_user", "IN");
	}
	
	
}
