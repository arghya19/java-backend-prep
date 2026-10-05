package com.google.sample;
import java.util.Scanner;

class Pen{
	String color;
	String type;
	
	Pen(String _color, String _type) {
		this.color = _color;
		this.type = _type;
	}
	
	void write() {
		System.out.println("Writing Something...");
	}
	
	void printInfo() {
		System.out.println(this.color);
		System.out.println(this.type);
	}
}

public class HelloWorld {
	static void doSomething() {
		System.out.println("Do Something!");
	}
	
	static void declare() {
		System.out.println("Hellow World.");
		int amount = 200;
		System.out.println("Amount: " + amount);
		HelloWorld.doSomething();
		Scanner sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		
	}

}
