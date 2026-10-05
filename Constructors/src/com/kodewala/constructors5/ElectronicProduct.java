package com.kodewala.constructors5;

public class ElectronicProduct extends Product {
	int productWarranty;

	ElectronicProduct(String _productName, int _productPrice, String _productId, int _productWarranty) {
		super(_productName, _productPrice, _productId); //init the default fields
		this.productWarranty = _productWarranty;
	}
}
