package org.initializtion;

public class Init4 {
	static char c;
	static String s;
	static int i=10;
	static m m1;
	public static void main(String[] args) {
		System.out.println("c:"+c);
		System.out.println(s); //U can print strings null
		System.out.println(s+" null ");
		System.out.println(i+" str");
		//System.out.println(null);// Compilation Error!		
		System.out.println(m1); //U can print any other class's null also
		//System.out.println(null); //but u cannot directly print null
		System.out.println(s+" null "+null); // U can append null
		System.out.println(i+" str:"+s);
		
	
	}
}
class m
{
	
}
