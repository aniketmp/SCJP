package org.exception;

public class trycatch8 {
	public static void main(String[] args) {
		doStuff();
	}

	static void doStuff() {
		int i = 1;
		if(i==1)
			throw new RuntimeException("blast!");
		try 
		{
			i=2;

		}
		catch (ArithmeticException ex) 
		{
			System.out.println("In catch");
		} 
		finally
		{
			System.out.println("In finally");
		}
		
	}
}

//NOTE:Whenever we enter try block then finally has to be executed whether u throw exception or not.
