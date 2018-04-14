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
		
//		catch(FileNotFoundException | IOException e )//Illegal! The exception FileNotFoundException is already caught by the alternative IOException
//		catch(IOException | FileNotFoundException e )// Neither this would work.
		catch(IOException e)
		{
			e=new FileNotFoundException(); //Leagal since this is old style
		}
		catch(ArithmeticException | NullPointerException e)
		{
			//e=new ArithmeticException(); //Not-Leagal:The parameter of a multi-catch block cannot be assigned.Since multi-catch uses multiple types, there isn't clearly defined type for the variable that you can set.
		}
		
	}

	public static void accessDatabase() throws FileNotFoundException, IOException
	{

	}
}
