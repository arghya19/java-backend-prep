package com.example.constructor;

public class User {
	int studentRoll;
	String studentName;
	int clss;
	
	
	// this() / super()
	User(int _studentRoll, String _studentName, int _class){
		this.studentRoll = _studentRoll;
		this.studentName = _studentName;
		this.clss = _class;
	}
	
	User() {
		this(000, "abc", 0);
	}
	
}
