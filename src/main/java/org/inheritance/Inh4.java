package org.inheritance;
class Parent
{
	int i;
	int j;
	static int k;
	{
		System.out.println("Parent non-static block");
		i=10;
		
	}
	Parent()
	{
		System.out.println("Parent constructor");
	}
}
class Child extends Parent
{
	int i;	
	{
		System.out.println("Child non-static block");
		i=20;
		j=30;
	}
	Child()
	{		
		System.out.println("Child constructor");
	}
	void disp()
	{
		System.out.println("i:"+i+" j:"+j+" super.i:"+super.i+"  super.j:"+super.j+ " k:"+k);
	}
	
}
public class Inh4 
{
	public static void main(String[] args) 
	{
		new Child().disp();
	}
}
