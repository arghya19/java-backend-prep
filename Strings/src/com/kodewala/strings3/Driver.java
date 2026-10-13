package com.kodewala.strings3;

public class Driver {

	public static void main(String[] args) {
//		String s = "This "+"is from"+" Kodewala Academy Bangalore.";
		
		String s = "This is from Kodewala Academy Bangalore."; //compiler compiles and concat in runtime and hence 1 object created
		System.out.println(s);
		
		String s1 = "Kodewala";//scp
		String s2 = "Academy";//scp
		
		String s3 = s1 + s2;//heap  --> new StringBuilder
		System.out.println(s3);
		
		String s4 = "KodewalaAcademy";//scp
		System.out.println(s3 == s4); // false -> because one object is creaded in heap and another is in scp. 
		System.out.println(s3.intern() == s4);// s3 is in heap and the object is not present in scp. So .intern() method copies the object from heap and save it to the scp and strarts referring it.
		
		

	}

}
