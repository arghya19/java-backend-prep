package com.kodewala.strings2;

public class Driver {

	public static void main(String[] args) {
		String s1 = "kodewala"; //SCP -> 123abc
		
		String s2 = new String("Academy"); //Creates one object in heap and another in SCP -> 432bfg
		
		System.out.println(s1 == s2 );// 123abc == 432bfg -> false
		
		String s3 = new String("kodewala");
		String s4 = new String("kodewala");
		
		System.out.println(s3 == s4); // false -> as the objects have different memory location 
		System.out.println(s3.equals(s4)); // true -> as it has the same content
		
		
		
		

	}

}
