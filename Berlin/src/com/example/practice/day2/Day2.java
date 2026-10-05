package com.example.practice.day2;

public class Day2 {

	static void ex1(int num) {
		// Odd or Even
		if (num % 2 == 0) {
			System.out.println("Even: " + num);
		} else {
			System.out.println("Odd: " + num);
		}
	}

	static void ex2(int n1, int n2, int n3) {
		// Largest of three
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " is largest.");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " is largest.");
		} else if (n3 > n1 && n3 > n2) {
			System.out.println(n3 + " is largest.");
		} else {
			System.out.println("Invalid Input.");
		}
	}

	static void ex3() {
		// Run Loop from 1 to 100
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

	static void ex4(int n) {
		// Multiplication Table
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}

	static void ex5() {
		// Sum from 1 to 100
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum of 1 to 100: " + sum);

	}

	static void ex6(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + n + " is: " + fact);
	}

	static void ex7(int n) {
		// Reverse a number
		int rev = 0;

		while (n > 0) {
			int rem = n % 10;
			rev = (rev * 10) + rem;
			n /= 10;
		}
		System.out.println("Reverse Number: "+rev);

	}

	static void ex8(String s) {
		// Palindrome check
		String rev= "";
		for(int i = s.length()-1;i>=0;i--) {
			rev += s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("Palindrome.");
		}else {
			System.out.println("Not Palindrome.");
		}
	}

	public static void main(String[] args) {
//		ex1(17);
//		ex2(10, 25, 15);
//		ex3();
//		ex4(7);
//		ex5();
//		ex6(5);
//		ex7(1234);
		ex8("hello");

	}
}
