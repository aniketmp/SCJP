package org.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Multicatch3 {
	public static void main(String[] args) throws SQLException, IOException //note this
	{
		try
		{
			accessDatabase();
		}		
		catch(Exception e )//The exception FileNotFoundException is already caught by the alternative IOException		
		{
			//throw e //fail in java 6
			throw e; // Allowed in java 7 but not in java 6. In java 6 we would need to change the signature of main to throws Exception.
			         //But in java 7 the compile is translating it for you .The compiler says, "Well, I know it can't be just any exception because
                     //the throws clause won't let me. I'll pretend the developer meant to only catch SQLException and IOException. After all,if
			         //any other show up, I'll just fail compilation on throw e -Just like I used to in Java 6.
		} 
		
		
	}

	public static void accessDatabase() throws SQLException, IOException
	{

	}
}
