package com.kodewala.constructors.practice;

class SuperCars extends Object {
	SuperCars(){
		super();
	}
}

public class Cars extends SuperCars {
	int carId;
	String carName;
	String carColor;
	String carBrand;
	double carPrice;

	Cars(int _carId, String _carName, String _carColor, String _carBrand, double _carPrice) {
		super();
		this.carId = _carId;
		this.carName = _carName;
		this.carColor = _carColor;
		this.carBrand = _carBrand;
		this.carPrice = _carPrice;
	}

	void showCarInfo() {
		System.out.println(carId);
		System.out.println(carName);
		System.out.println(carColor);
		System.out.println(carBrand);
		System.out.println(carPrice);
	}
}
