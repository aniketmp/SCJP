package org.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class file {
	public static void main(String[] args) {
		try
		{
			File file;
			try {
				file = new File("my_file.txt");
				System.out.println("File exist:"+file.exists());
				System.out.println("File created:"+file.createNewFile()); //This creates a file , if already exist return false
				
				//Using file writer			
				FileWriter fw=new FileWriter(file);
				fw.write("Hello from file writer");
				fw.flush();
				fw.close();
				readFile(file);
				
				//Using buffered writer
				fw=new FileWriter(file);
				BufferedWriter bw=new BufferedWriter(fw);
				bw.write("Hello from buffered writer.");
				bw.write("adding a new line..");
				bw.newLine();   //Convinent way to add a new line
				bw.write("New line added.");
				bw.flush();
				bw.close();
				readFile(file);
				
				//Using Print writer				
				PrintWriter pw=new PrintWriter(file);
				pw.println("Hello from print writer"); //cool way of printing in new line
				pw.flush();
				pw.close();
				readFile(file);
			} catch (Exception e) {				
				e.printStackTrace();
			}
			
			
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

	private static void readFile(File file) throws FileNotFoundException, IOException {
		FileReader fr=new FileReader(file);
		char[] in=new char[200];
		fr.read(in);
		System.out.println();
		System.out.print("File content:");
		for(char c:in)
			System.out.print(c);
		fr.close();
	}
}
