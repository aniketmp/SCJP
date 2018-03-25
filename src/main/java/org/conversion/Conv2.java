package org.conversion;

public class Conv2 {
	static byte b=4;
	static float f=4;
	public static void main(String[] args) {		
		//b=888; //not allowed. Since byte cannot hold 888 since its capacity of holding is from -128 to 127 only
		b=(byte)888;		
		System.out.println(b);
		//f=1.4; //not possible..since 1.4 is default double
		f=(float) 1.4; //Ok
		f=1.4f; //ok because postfix f indicates float
		
		
	}

}
