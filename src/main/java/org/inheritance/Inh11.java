package org.inheritance;

class parent6
{
	public static void m1()
	{
	
	}
	public void m2()
	{
		
	}
}

public class Inh11 extends parent6 
{
	//public void m1()      //Instance method cannot override the static method m1() from parent3
	{
		
	}
	public static void m1()  //static method can be re-rewritten .This is not overriding , but re-writting.
	{
			
	}
	public void m2()      //You can override non-static method.
	{
			
	}
	//public static void m2()      //This static method cannot hide the instance method m2() from parent3
	{
			
	}
	
	
}
