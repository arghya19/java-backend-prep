package com.example.practice.day5;

class Employee {
	String empId;
	String empName;
	double salary;

	Employee() {
		System.out.println("Employee class object created...");
	}

	Employee(String _empId, String _empName, double _salary) {
		super();
		this.empId = _empId;
		this.empName = _empName;
		this.salary = _salary;
	}

	public void display() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Salary: " + salary + "\n");
	}

	public static void displayAll(Employee emp[]) {
		if (emp == null)
			return;

		for (Employee e : emp) {
			if (e != null) {
				e.display();
			}
		}
	}

	public static void lowSalary(Employee emp[]) {
		if (emp == null)
			return;

		for (Employee e : emp) {
			if (e.salary < 20000) {
				System.out.println("Employee Id: " + e.empId + ".");
				System.out.println("Employee Name: " + e.empName + ".\n");
			}
		}
	}

}

public class OopsFundamentals {

}
