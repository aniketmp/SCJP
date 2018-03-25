package org.api;

public class api1 {
	public static void main(String[] args) {
		StringBuilder sbr=new StringBuilder("hello");
		System.out.println(sbr.toString());
		System.out.println(sbr);
		
		sbr.append(" wold");
		System.out.println(sbr);
				
		System.out.println(sbr.substring(1, 3)); //start index 0 based , end index 1 based
		
		String str="Hello world!";
		System.out.println(str.substring(1, 3));//start index 0 based , end index 1 based
		
		System.out.println(str.replace("H","M"));//Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar. 
//		If the character oldChar does not occur in the character sequence represented by this String object, then a reference to this String object is returned. Otherwise, a new String object is created that represents a character sequence identical to the character sequence represented by this String object, except that every occurrence of oldChar is replaced by an occurrence of newChar. 
		
		
		
	}
}
