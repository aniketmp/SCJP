package org.io;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class PDFLocator extends SimpleFileVisitor<Path>{	

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if(file.getFileName().toString().endsWith("pdf"))
		{
			System.out.println(file.getFileName());			
		}	
		return FileVisitResult.CONTINUE;
	}

	public static void main(String[] args) throws IOException {
		PDFLocator pdfLocator=new PDFLocator();
		Files.walkFileTree(Paths.get("D:\\SYSTEM ROOT DATA\\Downloads"), pdfLocator);
	}

}
