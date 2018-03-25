package org.exception;

public class trycatch5 {
	public static void main(String[] args) {
		System.out.println(doStuff());
	}

	static int doStuff() {
		int i = 1;
		try 
		{
			throw new RuntimeException("blast!");

		}
		catch (ArithmeticException ex) 
		{
			System.out.println("In catch");
			// return 3;// if we uncomment this field then return 4 statement would be unreachable code
		} 
		return 4;
	}
}
