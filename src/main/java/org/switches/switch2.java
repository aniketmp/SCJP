package org.switches;

public class switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=7;
		switch(x)
		{
			case 2:System.out.println("2");
			//case 2:System.out.println("2"); wont compile
			default:System.out.println("default");
			case 3:System.out.println("3");
			case 4:System.out.println("4");
		}
	}
	
}
/*
 * Default case always works 
 */
