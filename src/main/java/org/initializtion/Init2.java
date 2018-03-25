package org.initializtion;

public class Init2 {
	public static void main(String[] args) {
		int i=1;
		boolean j=false;
		if(j=true) 
		{
			System.out.println("In true");
		}
		else
		{
			System.out.println("In false");
		}
		
		/*if(i=2) we cannot do this since i is not boolean
		{
			
		}*/
		
		for(int k=0;k<1;k++); //this is also valid syntax
		
	}
}
/*
 * Note: j=true means j is setting to true, not comparing to true.
 */
