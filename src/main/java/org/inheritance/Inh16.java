package org.inheritance;

class p {
	static String ID = "QBANK";
	static
	{
		System.out.println("In static block of parent");
	}
}

class c1 extends p{
	static int i=3;
	static {
		System.out.println("In Sub");
	}
}

public class Inh16 {
	public static void main(String[] args) {
		System.out.println(c1.ID);
		System.out.println(c1.i);
	}
}
/*
 * NOTE: VERY VERY INTERESTING.......WHENEVER WE REFER STATIC VARIABLE OF CLASS, THAT CLASS'S STATIC 
 * BLOCK WILL BE EXECUTED IF AND IF THE VARIABLE IS BELONGS TO THAT CLASS NOT INHERITED ONE.
 * IF WE REFER INHERITED VARIABLE THEN THAT VARIABLES CLASS (PARENT CLASS) WILL BE LOADED. 
 */