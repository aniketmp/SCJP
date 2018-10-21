package org.io;

import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * Relativizing path:
 * path1.relativize(path2) should be read as 
 * give me a path that shows how to get from path1 to path2. 
 */
public class path4 {
	public static void main(String[] args) {
		Path absolute1=Paths.get("/home/java");
		Path absolute2=Paths.get("/usr/local");
		Path absolute3=Paths.get("/home/java/temp/music.mp3");
		Path relative1=Paths.get("temp");
		Path relative2=Paths.get("temp/music.pdf");

		System.out.println("How to get from "+absolute1+" to "+absolute3+":"+absolute1.relativize(absolute3)); 		
		System.out.println("How to get from "+absolute3+" to "+absolute1+":"+absolute3.relativize(absolute1));
		System.out.println("How to get from "+absolute1+" to "+absolute2+":"+absolute1.relativize(absolute2));
		System.out.println("How to get from "+relative1+" to "+relative2+":"+relative1.relativize(relative2));
		//This throw exception.It can't just figure out how to make relative path out of one absolute and one relative path.
		System.out.println("How to get from "+absolute1+" to "+relative1+":"+absolute1.relativize(relative1)); //BAD..Throws IllegalArgumentException.		
	}
}
