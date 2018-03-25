package org.exception;

public class trycatch3 {
	public static void main(String[] args) {
		System.out.println(doStuff());
	}

	static int doStuff() {
		int i = 1;
		try 
		{
			throw new Exception("blast!");

		}
		catch (Exception ex) 
		{
			return 2;
		} 
		//return 4; //still Unreachable code
	}
}
