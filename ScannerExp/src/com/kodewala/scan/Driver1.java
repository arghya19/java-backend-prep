package com.kodewala.scan;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = 0;
		System.out.println("Enter the price: ");
		if(sc.hasNextInt()) {
			price = sc.nextInt();
		}else{
			System.err.println("Invalid Input.");
		}
		
		System.out.println("Price: "+price);
		sc.close();

	}

}
