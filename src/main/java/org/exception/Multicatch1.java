package org.exception;

import java.io.IOException;
import java.sql.SQLException;

public class Multicatch1 {
	public static void main(String[] args) 
	{
		try
		{
			accessDatabase();
		}
		//step1:Old way of handling exception  in one step( not expected if we want to deal differently on each exception)
		//catch(Exception e) 
		
		//step2:Multi block style
		/*
		catch(SQLException e) //old way of handling exception  in one step( not expected if we want to deal differently on each exception)
		{
			
		}
		catch(IOException e) //old way of handling exception  in one step( not expected if we want to deal differently on each exception)
		{
			
		}*/
		
		//step3:multi-catch style
		catch(SQLException | IOException e)//same meaning as catch(IOException | SQLException  e)
		{
			
		}
	}

	public static void accessDatabase() throws SQLException, IOException 
	{

	}
}
