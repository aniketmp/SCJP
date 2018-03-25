package org.exception;

public class trycatch6 {
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
		} 
		finally
		{
			return 4;
		}
		
	}
}
