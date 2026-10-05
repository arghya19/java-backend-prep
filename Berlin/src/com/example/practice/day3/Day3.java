package com.example.practice.day3;

class Student {
	String name;

	//Object by reference
	static void changeName(Student s) {
		s.name = "Arghya Nath";
	}
}

public class Day3 {
	// Pass by Value
	static void change(int x) {
		x = 100;
	}

	public static void main(String[] args) {
		int a = 10;

		change(a);
		System.out.println(a);
		
		Student student = new Student();
		student.name = "ABC";
		student.changeName(student);
		System.out.println(student.name);

	}

}
