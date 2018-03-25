package org.switches;

public class switch1 {
	public static void main(String[] args) {
		int x=2;
		switch(x)
		{
			case 2:System.out.println("2");
			default:System.out.println("default");
			case 3:System.out.println("3");
			case 4:System.out.println("4");
		}
	}

}
/*
 * Note:The default case doesn't have to come at the end of switch.
 */
