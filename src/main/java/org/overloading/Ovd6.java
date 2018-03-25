package org.overloading;
class Ovd6 {
	static void go(Long x) {
		System.out.println("Long");
	}
	

	public static void main(String[] args) {
		byte b = 5;
		go(5L); //fine..because its just wrapping long to Long
		//go(b); //must widen then box - illegal 
	}
}