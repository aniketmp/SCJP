package org.exception;

public class TryWithResourceCustomeAutoclosable 
{
	public static void main(String[] args) throws Exception  
	{
		//Anything which is Autoclosable can be placed in try-with-resource
		try(Myclass myclass=new Myclass())
		{
			throw new RuntimeException("Blast!!!");
		}		
	}
	

}
class Myclass implements AutoCloseable
{

	@Override
	public void close() throws Exception //note:it throws Exception
	 {
		System.out.println("closing resource!");
	}
	
}