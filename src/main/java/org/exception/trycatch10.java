package org.exception;

public class trycatch10 {
	public static void main(String[] args) throws Exception {
		doStuff();
	}
	public static void doStuff() throws Exception
	{
		try
		{
			throw new Exception("blast!");
		}
		catch(RuntimeException e)
		{
			System.out.println("in catch");
		}
		finally
		{
			System.out.println("in finally");
		}
		System.out.println("in after finally");	
	}
	
}
