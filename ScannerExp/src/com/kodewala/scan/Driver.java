package com.kodewala.scan;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product name: ");
		String productName = sc.nextLine();
		
		System.out.println("Enter product price: ");
		int productPrice = Integer.parseInt(sc.next());
		
		System.out.println("Address: ");
		String address = sc.next();
		sc.close();
		
		System.out.println("Product Name: "+productName);
		System.out.println("Product Price: "+productPrice);
		System.out.println("Address: "+address);
		
	}

}
