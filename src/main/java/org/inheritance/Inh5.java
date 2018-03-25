package org.inheritance;
class base3
{
	int num1=10;
	void disp1()
	{
		System.out.println(num1);
	}
	
}
class sub extends base3
{
	final void disp1() //Overriding method may or may not be final
	{
		System.out.println("in sub");
	}
}
public class Inh5
{
	public static void main(String args[])
	{
		sub s1=new sub();
		s1.disp1();	
	}
}