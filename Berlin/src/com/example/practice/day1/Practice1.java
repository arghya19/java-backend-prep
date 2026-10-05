package com.example.practice.day1;

import java.util.Scanner;

public class Practice1 
{
	static void ex1() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine().trim();
		System.out.print("Enter your age: ");
		int age = Integer.parseInt(sc.nextLine().trim());
		System.out.print("Enter your profession: ");
		String prof = sc.nextLine().trim();
		System.out.print("What is your goal: ");
		String goal = sc.nextLine().trim();
		sc.close();
		
		System.out.println("\nName: "+name);
		System.out.println("Age: "+age);
		System.out.println("Proffession: "+prof);
		System.out.println("Goal: "+goal);
	}
	
	static void ex2(int n1, int n2) 
	{
		System.out.println("Add: "+(n1+n2));
		System.out.println("Sub: "+(n1-n2));
		System.out.println("Mul: "+(n1*n2));
		System.out.println("Div: "+(n1/n2));
		System.out.println("Rem: "+(n1%n2));
	}
	
	static void ex3(int monthlySalary) 
	{
		int yearlySalary = monthlySalary * 12;
		System.out.println("Monthly Salary: "+monthlySalary);
		System.out.println("Yearly Package: "+yearlySalary);
	}
	
	static void ex4(int num)
	{
		if(num % 2 == 0) {
			System.out.println(num + " is Even.");
		}else {
			System.out.println(num + " is Odd.");
		}
	}
	static void ex5(int age) {
		if(age >= 18) {
			System.out.println("Eligible.");
		}else {
			System.out.println("Not eligible.");
		}
	}

	public static void main(String[] args) {
//		ex1();
		ex2(25, 5);
		ex3(30000);
		ex4(32);
		ex5(20);
	}

}
