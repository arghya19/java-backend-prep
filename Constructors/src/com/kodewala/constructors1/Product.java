package com.kodewala.constructors1;

public class Product {
	String productName;
	double productPrice;
	String productDescription;
	int productQuantity;
	
	Product(){
		
	}
	
	Product(String _productName,String _productDescription){
		this.productName = _productName;
		this.productDescription = _productDescription;
	}
	
	Product(String _productName, double _productPrice,String _productDescription,int _productQuantity){
		this.productName = _productName;
		this.productPrice = _productPrice;
		this.productDescription = _productDescription;
		this.productQuantity = _productQuantity;
		
	}
	
	void showProductDetails() {
		System.out.println("Product Name: "+productName);
		System.out.println("Product Price: "+productPrice);
		System.out.println("Product Description: "+productDescription);
		System.out.println("Product Quantity: "+productQuantity);
		System.out.println();
	}
	
}
