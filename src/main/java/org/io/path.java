package org.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class path {
	public static void main(String[] args) {
		try {
			// Path interface replaces File in NIO.2.This create Path not a file.
			Path path = Paths.get("my_file.txt");

			// Files class contains static method that work with Path object.
			System.out.println("File exist:" + Files.exists(path));
			if(Files.exists(path))
			{
				Files.delete(path);
				System.out.println("File deleted..");
				System.out.println("File exist:" + Files.exists(path));
			}
			Files.createFile(path);		
			System.out.println("File created..");
			System.out.println("File exist:" + Files.exists(path));
			
			//If you are working with old libraries where there is File object then 
			//you have to convert old File into new Path object
			File file=path.toFile();
			
			//If you are working with old File and want to upgrade it to Path then 
			Path path2=file.toPath();
			
			//Create hierarchy or hierarchy of directory 
			Path path3=Paths.get("my_folder");
			if(Files.notExists(path3))
				Files.createDirectory(path3);
			
			//Create hierarchy of directoroes
			Path path4=Paths.get("my_folder/my_sub_folder/my_sub_sub_folder");
			if(Files.notExists(path4))
				Files.createDirectories(path4);
			
			System.out.println("path4:"+path4.toString());
			Path path5=Paths.get(path4.toString(),"my_file_source");
			Path path6=Paths.get(path4.toString(),"my_file_destn");
			System.out.println("Path5 exist:"+Files.exists(path5));
			
			if(Files.exists(path5))
				System.out.println("dest:"+Files.move(path5, path6));
			
			System.out.println("Path exist:"+Files.exists(Paths.get("my_folder")));
			
		
			
			try
			{
				System.out.println("Deleted:"+Files.deleteIfExists(Paths.get("my_folder")));
				
			}
			catch(DirectoryNotEmptyException ex)
			{
				System.out.println("Directory must be empty in order to delete.");
			}			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
