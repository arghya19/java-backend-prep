package com.kodewala.arrays1;

public class Driver {

	public static void main(String[] args) {
		//Create an array which hold 5 integer
		int[] productIds = new int[5];// Creating an array
		
		//add an element
		productIds[0] = 10;
		productIds[1] = 20;
		productIds[2] = 30;
		productIds[3] = 40;
		
		System.out.println(productIds[3]);
		System.out.println(productIds[4]);
		
		
		String[] cities = new String[7];
		cities[0] = "Bangalore";
		cities[1] = "Chennai";
		cities[2] = "Srinagar";
		cities[3] = "Mumbai";
		cities[4] = "Delhi";
		cities[5] = "Simla";
		cities[6] = "Surat";
		
		for(int i = 0; i< cities.length;i++) {
			if(cities[i].startsWith("D")) {
				
			}
		}
		
 		
	}

}
