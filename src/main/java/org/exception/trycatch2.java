package org.exception;

public class trycatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doStuff();
	}
	static void doStuff()
	{		
		try
		{			
			System.out.println("try");
			
		}
		catch(Exception ex)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("after finally");
	}
}
