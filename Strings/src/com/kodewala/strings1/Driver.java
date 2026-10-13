package com.kodewala.strings1;

public class Driver {

	public static void main(String[] args) {
		//Create a String Object
		String s1 = "kodewala"; //Object created in SCP(String Constant Pool)
		String s2 = "kodewala"; //s2 is the reference name which is referring to the same object
		
		String s3 = new String("kodewala");//The object is created in the heap and a copy of this same object 
		
		System.out.println(s1 == s2); //Checks if both references point to the exact same memory address on the SCP
		System.out.println(s1.equals(s3)); //Creates one object in heap and another in SCP. By default checks memory address, but usually overridden to compare values

	}

}
