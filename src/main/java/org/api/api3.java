package org.api;

public class api3 {
	public static void main(String[] args) {
		String str="abc";
		System.out.println(str.charAt(0)); //zero-based index
		System.out.println(str.charAt('b')); //b will implicitly promoted to int whose ASCII value is 98.Hence it will throw StringIndexOutOfBoundException. 
		System.out.println(str.charAt(str.length())); //it will throw StringIndexOutOfBoundException. 
	}
}
/*
 IMPORTANT NOTE:As per the API documentation for charAt, it throws 
 IndexOutOfBoundsException if you pass an invalid value.
 
Both - ArrayIndexOutOfBoundsException and
StringIndexOutOfBoundsException, extend IndexOutOfBoundsException and
although in practice, the charAt method throws
StringIndexOutOfBoundsException, it is not a valid option because the
implementation is free to throw some other exception as long as it is an
IndexOutOfBoundsException.

*/