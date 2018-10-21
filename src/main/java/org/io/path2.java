package org.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class path2 {
	public static void main(String[] args) {
		Path fullPath=Paths.get("my_folder/x/y/z/../..");
		System.out.println("Full path:"+fullPath);
		System.out.println("Normalized path:"+fullPath.normalize());
		
		fullPath=Paths.get("/a/./b/./c");
		System.out.println("Full path:"+fullPath);
		//removes all single . since they just point to current directory
		System.out.println("Normalized path:"+fullPath.normalize());
		
		fullPath=Paths.get(".classpath");
		System.out.println("Full path:"+fullPath);
		//Its js the filename starting with .
		System.out.println("Normalized path:"+fullPath.normalize());
		
		fullPath=Paths.get("/a/b/c/..");
		System.out.println("Full path:"+fullPath);
		System.out.println("Normalized path:"+fullPath.normalize());
		
		fullPath=Paths.get("");
		System.out.println("Full path:"+fullPath);
		System.out.println("Normalized path:"+fullPath.normalize());
	}
}
