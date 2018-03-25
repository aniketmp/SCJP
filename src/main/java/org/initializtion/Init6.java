package org.initializtion;

public class Init6 {
	public static void main(String[] args) {
		int a;
		//System.out.println(a); // u can declare a but since it is local variable , it must be initialize before use
		final int b;	
		if(1==1)
		{
			b=12;
		}
		System.out.println(b); //compiler assure it has to be initialize
		int c=20;
		final int d;
		
		if(c==20)
		{
			d=34;
		}
		//System.out.println(d); //Compilation fails! Cannot use d without initializing it.This time compiler cannot assure that it will be initialize.Since c is variable 
	}
}
