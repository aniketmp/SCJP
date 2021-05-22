package org.overloading;
class Ovd9 {
	static void m1(Object o) {
		System.out.println("Object");
	}

	static void m1(String str) {
		System.out.println("String");
	}

	public static void main(String[] args) {
		m1(null); //It will prefer string over Object since object having catch all capablity
	}
}