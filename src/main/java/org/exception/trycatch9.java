package org.exception;

public class trycatch9 {
	public static void main(String[] args) throws Exception {
		doStuff();
	}

	static void doStuff() throws Exception {
			
		try 
		{
			throw new Exception("blast!");

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
