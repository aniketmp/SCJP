package org.exception;

public class trycatch4 {
	public static void main(String[] args) {
		System.out.println(doStuff());
	}

	static int doStuff() {
		int i = 1;
		try 
		{
			return 2;

		}
		catch (Exception ex) 
		{
			return 3;
		} 
		//return 4; //still Unreachable code
	}
}
