package org.overloading;
class Ovd7 {
	static void go(Object o) {		
		System.out.println(o);
	}

	public static void main(String[] args) {
		byte b = 5;
		go(b); // can this byte turn into an Object ?
	}
}
