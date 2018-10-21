package org.io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class dir_stream {
	//The directory stream lets you to iterate you through the directory.
	public static void main(String[] args) {
		Path dir=Paths.get("D:\\");
		try(DirectoryStream<Path> stream=Files.newDirectoryStream(dir))
		{
			for(Path path:stream)
			{
				System.out.println(path);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nPaths contains 's'\n");
		try(DirectoryStream<Path> stream=Files.newDirectoryStream(dir,"*s*"))
		{
			for(Path path:stream)
			{
				System.out.println(path);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
