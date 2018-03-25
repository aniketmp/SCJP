package org.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResource2 {
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		//Just to close the reader we had to perform so many steps
		try(Reader reader=new FileReader(new File(""))) //initializing
		{
			reader.read(); //no need to close reader. It automatically gets closed by java resource management.
		}

	}

}
