package org.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResource {
	public static void main(String[] args) 
	{
		//Just to close the reader we had to perform so many steps
		Reader reader=null;
		try
		{
			reader=new FileReader(new File("")); //initializing
			reader.read();
		}
		catch(IOException e)
		{
			
		}
		finally
		{
			if(reader!=null)
			{
				try 
				{
					reader.close();
				} catch (IOException e) {
					//ignore exception on closing file
				}
			}
			
		}

	}

}
