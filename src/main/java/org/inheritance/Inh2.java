package org.inheritance;
public class Inh2
{
	private static int num=2;
	
	Inh2()
	{
		System.out.println("In constructor...");
	}
	{
		System.out.println("In dynamic block...");
		disp2(); //you can call non static method from dynamic block
	}

	public static void disp()
	{
		System.out.println("In disp1");
	}
	public void disp2()
	{
		System.out.println("In disp2");
	}
	static
	{
		System.out.println("First static block");
	}
	public static void main(String args[])
	{
		System.out.println("in main");
		new Inh2();
	}	
	static 
	{
		/*public static void disp()
		{
			System.out.println("in disp");
		} You cannot create function inside static block*/
		System.out.println("Second static block");
		disp();   //You can call the static function as well as use static instance variable.
		System.out.println(num);
		
		
	}
}