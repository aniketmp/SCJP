package org.exception;

public class trycatch12 {
	public static void main(String[] args) {
		System.out.println(doStuff());
	}

	static int doStuff() {
		int i = 1;
		if(i==1)
			return 2;
		try 
		{
			i=6;
			return i;

		}
		catch (ArithmeticException ex) 
		{
			System.out.println("In catch");
		} 
		finally
		{
			System.out.println("In finally");
			return 3;
		}
		
	}
}

//NOTE:Whenever we enter try block then finally has to be executed whether u throw exception or not.
//addition to this is whenever we return something or thows exception outside the try-catch block, then finally wont be executed. 
