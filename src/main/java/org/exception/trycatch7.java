package org.exception;

public class trycatch7 {
	public static void main(String[] args) {
		System.out.println(doStuff());
	}

	static int doStuff() {
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
			return 4;
		}
		
	}
}

//NOTE:Whenever we enter try block then finally has to be executed whether u throw exception or not.
