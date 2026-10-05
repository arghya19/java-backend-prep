package com.google.sample;

public class Main {

	public static void main(String[] args) {
		String a = "Java";
		String c = "Java";
		String b = new String("Java");
		String d = new String("Java");
		
		
		System.out.println(a == b);//false
		System.out.println(a == c);//true
		System.out.println(b == d);//false
		System.out.println(b.equals(d));//true
		System.out.println(a.equals(b));//false

	}

}
