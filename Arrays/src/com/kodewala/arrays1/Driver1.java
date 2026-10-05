package com.kodewala.arrays1;

public class Driver1 {

	public static void main(String[] args) {
		Product product1 = new Product("101", "Apple", "70");
		Product product2 = new Product("102", "Orange", "100");
		Product product3 = new Product("101", "Mango", "60");
		Product product4 = new Product("101", "Grapes", "120");
		
		Product[] products = new Product[4];
		products[0] = product1;
		products[1] = product2;
		products[2] = product3;
		products[3] = product4;
		
		System.out.println(products.length);
		
		
		
	}

}
