package org.inheritance;
class MyClass4
{
	int num=20;
	
	void disp1(MyClass4 ref)
	{
		ref=null;
	}
	void disp2(int k)
	{
		k=10;  //every method has its own copy of variable
	}
}
public class Inh1
{
	public static void main(String args[])
	{
		MyClass4 m1=new MyClass4();
		System.out.println(m1.num);
		m1.disp1(m1);
		System.out.println(m1.num);		
		m1.disp2(m1.num); //java is always pass by value...
		System.out.println(m1.num);
		
		
	}
}