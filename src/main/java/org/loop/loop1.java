package org.loop;

public class loop1 {
	public static void main(String[] args) {
		int i=1;
		while(i<1)
		{
			System.out.println("In while loop");
		}
		System.out.println("Out of the while loop");
		
		do
		{
			System.out.println("In do loop");
		}while(i<1); //Be sure to note the use of semicolon at the end of the while loop expression.
		System.out.println("Out of the do loop");
		
		
		//for (int i = 0; i<10; i++) { //wont compile since i is already there.(Duplicate local variable)
		for (int j = 0; j<2; j++) {
			System.out.println("j is " + j);			
		}
	}
}
