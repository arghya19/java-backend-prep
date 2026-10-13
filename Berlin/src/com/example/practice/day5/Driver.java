package com.example.practice.day5;

public class Driver {

	public static void main(String[] args) {
		Employee e1 = new Employee("emp01", "Arghya", 70000);
		Employee e2 = new Employee("emp02", "Rahul", 10000);
		Employee e3 = new Employee("emp03", "Shyam", 15000);
		
		Employee[] e = new Employee[3];
		e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		
		Employee emp = new Employee();
		emp.lowSalary(e);

	}

}
