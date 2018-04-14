package org.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Multicatch4 {
	public static void main(String[] args) throws SQLException, IOException //note this
	{
		try
		{
			accessDatabase();
		}		
		catch(Exception e )//Catching all exception subclasses		
		{
			e=new SQLException();//Reason to be explained...
			e=new FileNotFoundException();//Reason to be explained...
//			throw e; //Compilation Fails.
		} 
		
		
	}

	public static void accessDatabase() throws SQLException, IOException
	{

	}
}
