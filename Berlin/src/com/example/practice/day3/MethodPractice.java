package com.example.practice.day3;

public class MethodPractice {

	static void factorial(int num) {
//		Create a method to calculate factorial
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial: " + fact);
	}

	static void isPrime(int num) {
//		Create a method to check whether a number is prime
		boolean flag = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (!flag) {
			System.out.println("It is not a prime number.");
		} else {
			System.out.println("It is a prime number.");
		}
	}

	static void isNumPalin(int num) {
//		Create a method to check whether a number is palindrome
		int n = num;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = (rev * 10) + rem;
			n /= 10;
		}

		if (!(num == rev)) {
			System.out.println("Not Palindrome.");
		} else {
			System.out.println("Palindrome.");
		}
	}

	static void reverseNumber(int num) {
//		Create a method to reverse a number
		int n = num;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = (rev * 10) + rem;
			n /= 10;
		}
		System.out.println("Reversed Number: " + rev);
	}

	static void findMax(int[] num) {
//		Create a method to find maximum in an array
		int max = num[0];
		for (int i : num) {
			if (max < i) {
				max = i;
			}
		}
		System.out.println("Max Element: " + max);
	}

	static void findMin(int[] num) {
//		Create a method to find minimum in an array
		int min = num[0];
		for (int i : num) {
			if (min < i) {
				min = i;
			}
		}
		System.out.println("Min Element: " + min);
	}

	static void searchElement(int[] num, int target) {
//		Create a method to search an element
		boolean flag = false;
		for (int n : num) {
			if (target == n) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("Element Found.");
		} else {
			System.out.println("Element not Found.");
		}
	}

	static int factReccursion(int num) {
//		Create a recursive factorial method
		if (num == 0 || num == 1) {
			return 1;
		}

		return num * factReccursion(num - 1);
	}

	static void varargsMethod(int... num) {
//		Create a varargs method to calculate sum
		int sum = 0;
		for (int i : num) {
			sum += i;
		}
		System.out.println("Sum: "+sum);
	}
	
//	Create overloaded add() methods
	static int sum(int a, int b) {
		return a+b;
	}
	
	static double sum(double a,double b) {
		return a+b;
	}

	public static void main(String[] args) {

	}

}
