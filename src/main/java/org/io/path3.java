package org.io;

import java.nio.file.Path;
import java.nio.file.Paths;


public class path3 {
	public static void main(String[] args) {
		//resolving the path means combining the two path
		Path absolute=Paths.get("/home/java");
		Path relative=Paths.get("dir");
		Path file=Paths.get("models/Model.pdf");
		System.out.println("absolute:"+absolute);
		System.out.println("relative:"+relative);
		System.out.println("file:"+file);
		System.out.println("=======================================================");
		System.out.println("absolute ---> resolve --> relative   :   "+absolute.resolve(relative));
		System.out.println("absolute ---> resolve --> file       :	 "+absolute.resolve(file));
		System.out.println("relative ---> resolve --> file       :	 "+relative.resolve(file));
		//Absolute path doesn't depends upon other since its absolute.Hence below query will return absolute path.
		System.out.println("relative ---> resolve --> absolute   :	 "+relative.resolve(absolute));
		System.out.println("file ---> resolve --> absolute       :	 "+file.resolve(absolute));
		//It will consider Model.pdf as a directory in below example
		System.out.println("file ---> resolve--> relative        :	 "+file.resolve(relative));
	}
}
