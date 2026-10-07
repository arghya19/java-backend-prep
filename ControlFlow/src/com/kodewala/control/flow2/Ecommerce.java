package com.kodewala.control.flow2;

public class Ecommerce {
	String customerName;
	String customerType;
	double totalBill;

	Ecommerce() {

	}

	Ecommerce(String _customerName, String _customerType, double _totalBill) {
		this.customerName = _customerName;
		this.customerType = _customerType;
		this.totalBill = _totalBill;
	}

	public int hasDiscount(String _type) {
		char c = _type.toLowerCase().charAt(0);
		if (c == 'g') {
			return 20;
		} else if (c == 's') {
			return 10;
		} else if (c == 'r') {
			return 5;
		} else {
			return 0;
		}
	}

	public void calculateFinalBill(double totalBill, String _CustomerType) {
		int discount = hasDiscount(_CustomerType);
		if (discount > 0 && totalBill >= 1000) {
			double discountPrice = totalBill * discount / 100;
			if (!(discountPrice <= 2500)) {
				discount = 2500;
			}
			double finalPrice = totalBill - discountPrice;
			System.out.println("Total Bill: " + totalBill);
			System.out.println("Final Bill: " + finalPrice);
		} else {
			System.out.println("You have to pay: " + totalBill);
		}

	}
}
