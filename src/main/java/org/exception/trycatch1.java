package org.exception;

public class trycatch1 {
	public static void main(String[] args) {
		System.out.println(doStuff());
	}
	static int doStuff()
	{
		int i=1;
		try
		{			
			throw new RuntimeException("blast!");
			
		}
		catch(Exception ex)
		{
			return 2;
		}
		finally
		{
			return 3;
		}
		//return 4; //Unreachable code
	}
}
