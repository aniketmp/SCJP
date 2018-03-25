package org.innerclass;

public class StaticInnerClass {
private static int x=1;
private static int y;
public static int z;
	static class Inner1
	{
	  private static int x=10;
	  static void inner()
	  {
		  System.out.println("Inner x:"+x); //This will refer inner class x
		  System.out.println("Outer x:"+StaticInnerClass.x); //This will refer outer class x
	  }
	  
	}
	public static void main(String[] args) {
		Inner1.inner();
		System.out.println("Inner x:"+Inner1.x);
		System.out.println("Outer x:"+x);
		//System.out.println("t.m:"+t.m); //cannot ..since private.
		
	}
}
class t
{
	private static int m=11;
}
