package org.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Multicatch2 {
	public static void main(String[] args) 
	{
		try
		{
			accessDatabase();
		}
		
		//catch(FileNotFoundException | IOException e )//The exception FileNotFoundException is already caught by the alternative IOException
		catch(IOException e)
		{
			e=new FileNotFoundException(); //Leagal since this is old style
		}
		catch(ArithmeticException | NullPointerException e)
		{
			//e=new ArithmeticException(); //Not-Leagal:The parameter e of a multi-catch block cannot be assigned
		}
		
	}

	public static void accessDatabase() throws FileNotFoundException, IOException
	{

	}
}
