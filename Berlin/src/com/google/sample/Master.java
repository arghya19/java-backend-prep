package com.google.sample;

class A {
	String name;
}

class B extends A {
	void display(A a) {
		System.out.println(a.name);
	}
}

public class Master {
	public static void main(String[] args) {
		B b = new B();
		b.name = "abc";
		b.display(b);

	}

}
