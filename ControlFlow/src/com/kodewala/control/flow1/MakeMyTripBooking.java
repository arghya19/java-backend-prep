package com.kodewala.control.flow1;

/*
 * This class represents booking system of MakeMytrip Booking
 */
public class MakeMyTripBooking {

	/*
	 * this method represents the discount which will be applied on every confirmed
	 * booking
	 */
	public int discount(int fare) {
		int discount = 0;
		if (fare >= 0 && fare < 5000) {
			discount = 0;
		} else if (fare >= 5000 && fare <= 10000) {
			discount = 10;
		} else if (fare > 10000) {
			discount = 15;
		} else {
			return -1;
		}
		return discount;
	}

	public void calculateFare(int fare) {
		if (!(discount(fare) < 0)) {
			int discount = discount(fare);
			double discountPrice = fare * discount / 100;
			if (discountPrice > 1250.0) {
				discountPrice = 1250.0;
			}

			double finalPrice = fare - discountPrice;
			System.out.println("Total Fare: " + fare);
			System.out.println("Discounted Fare: " + finalPrice);
		} else {
			System.err.println("Invalid fare.");
		}

	}
}
