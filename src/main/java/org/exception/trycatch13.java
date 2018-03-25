package org.exception;

public class trycatch13 {
	public static void main(String[] args) {
		try {
			//System.out.println(doStuff()); //Wont compile! Since you are expected to catch Exception not RuntimeException
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static int doStuff() throws Exception{
		int i = 1;
		try 
		{
			throw new Exception("blast!");

		}
		catch (ArithmeticException ex) 
		{
			System.out.println("In catch");
			// return 3;// if we uncomment this field then return 4 statement would be unreachable code
		} 
		return 4;
	}
}
