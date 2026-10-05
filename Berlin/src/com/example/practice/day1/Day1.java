package com.example.practice.day1;

import java.util.Scanner;

public class Day1 {
	
	static void dataTypes() {
		byte a = 10;
		short b = 100;
		int c = 1000;
		long d = 100000;
		float e = 20.78f;
		double f = 5.67777777;
		boolean g = true;
		char h = 'A';
		String i = "Ciao";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
	}
	
	static void printString() {
		String name = "Arghya Nath";
		String city = "Bangalore";
		int age = 25;
		
		System.out.println("Hi! myself "+name+" and I live in "+city+".");
		System.out.println("I'm "+age+" years old.");
		
	}
	
	static void greetings(String name) {
		System.out.println("Hello World");
		System.out.println("Hey! "+ name);
	}
	
	static void typeCasting() {
		//Type casting
		int a = 10;
		double b = a;
		
		double price = 99.99;
		int prc = (int) price;
		System.out.println(prc);
		
		
		System.out.println(((Object) a).getClass().getSimpleName());
		System.out.println(((Object) b).getClass().getSimpleName());
	}
	
	static void operators() {
		int a = 10;
		int b = 5;
		
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		//Arithmetic Operators
		System.out.println("Add: "+(a+b));
		System.out.println("Sub: "+(a-b));
		System.out.println("Mul: "+(a*b));
		System.out.println("Div: "+(a/b));
		System.out.println("Rem: "+(a%b));
		
		int age = 19; //given age is 19
		//Relational Operators
		System.out.println(age > 18); 
		System.out.println(age < 18);
		System.out.println(age == 18);
		System.out.println(age >= 18);
		System.out.println(age <= 18);
		System.out.println(age != 18);
		
		//Logical Operators - &&, ||, !
		System.out.println(age >= 18 && age >= 40); // false
		System.out.println(age >= 18 || age >= 40); //true
		System.out.println(!(age >= 18 || age >= 40)); //false
		
		
	}
	
	//Taking User Input
	static void userInput() {
		String name = "";
		int age = 0;
		double marks = 0.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		System.out.print("Enter your marks out of 100: ");
		marks = sc.nextDouble();
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Marks: "+marks);
		
	}
	public static void main(String[] args) {
//		Hello.greetings("Arghya");
//		Hello.dataTypes();
//		Hello.printString();
//		Hello.typeCasting();
//		Hello.operators();
		Day1.userInput();
	}

}
