package org.assertion;

//Run this class with -ea. i.e java -ea Assertion1. '-ea' should be VM argument.
//assertions are disabled by default.
//Syntax for enabling assertions at runtime should be java -ea Assertion1 or java -enableassertions Assertion1.
//Syntax for disabling assertions at runtime should be java -da Assertion1 or java -disableassertions Assertion1.

public class Assertion1 {
	public static void main(String[] args) {
//		int x=10;
		int x=2;
//		assert( x >5);//assertion without debug message
//		assert( x >5 ):"X is less than 5";
		assert x >5 :"X is less than 5"; //you no need to write brakets 
		//assert(boolean):<string> . Legal assert statement.		
				
	}
}

/****** Enabling or disabling enum at package level.*****
 * Suppose we have a package structure like this..
 * 
 * com --| 
 *       foo---|
               bar.class
               zoo
                |-----one.class
                |-----two.class
      1)Enable assertion in general but disable assertion for single class.
        java -ea -da:com.zoo.one
      
      2)Enabling assertion in general but disable them in the package com.foo and all of its subpackages.
        java -ea -da:com.foo...
                  
      Best practices in case of assertions
      
      1)Don't use assertions to validate arguments to public method. A public method might be called from code that you don't control.
      2)Do use assertions to validate arguments to private method.
      3)Don't use assertions to validate command-line arguments.
      4)Don't use assert expressions that can cause side effect.
  */
