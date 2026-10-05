package com.kodewala.constructors1;

public class Run {

	public static void main(String[] args) {
		Product user1 = new Product();
		user1.showProductDetails();

		Product user2 = new Product("Iphone 18 pro", 170000.99,"It's just an iphone.",19);
		user2.showProductDetails();
		
		Product user3 = new Product("Iphone 18 pro", "It's just an iphone.");
		user3.showProductDetails();
	}

}
