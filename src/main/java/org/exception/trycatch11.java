package org.exception;

public class trycatch11 {
	public static void main(String[] args) {
		try
		{
			throw new RuntimeException("in try");
		}
		finally
		{
			throw new RuntimeException("in finally"); 
		}
		/*catch(Exception) //catch block cannot followed by finally block
		{
			
		}*/
	}
}
