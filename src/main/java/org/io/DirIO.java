package org.io;

import java.io.File;
import java.io.IOException;

public class DirIO 
{
	public static void main(String[] args) 
	{
		try {
			File dir=new File("my_dir"); //Creating object, not an directory
			System.out.println("Directory created:"+dir.mkdir());
			
			File file=new File(dir,"my_file1");  //Create an object of file inside directory
			System.out.println("File created:"+file.createNewFile());	//Create actual file inside directory
			
		} catch (IOException e) {	
			e.printStackTrace();
		}	 			
	}
}
