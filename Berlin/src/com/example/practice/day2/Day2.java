package com.example.practice.day2;

public class Day2 {

	public void ex1(int num) {
		// Odd or Even
		if (num % 2 == 0) {
			System.out.println("Even: " + num);
		} else {
			System.out.println("Odd: " + num);
		}
	}

	public void ex2(int n1, int n2, int n3) {
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

	public void ex3() {
		// Run Loop from 1 to 100
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

	public void ex4(int n) {
		// Multiplication Table
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}

	public void ex5() {
		// Sum from 1 to 100
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum of 1 to 100: " + sum);

	}

	public void ex6(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + n + " is: " + fact);
	}

	public void ex7(int n) {
		// Reverse a number
		int rev = 0;

		while (n > 0) {
			int rem = n % 10;
			rev = (rev * 10) + rem;
			n /= 10;
		}
		System.out.println("Reverse Number: "+rev);

	}

	public void ex8(String s) {
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
		

	}
}
