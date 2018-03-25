package org.inheritance;

public class Inh3 {
	int i=10;
	Inh3()
	{
		System.out.println("Constructor:"+i);
		i=20;
	}
	{
		System.out.println("Non-static block:"+i);
		i=30;
	}

	public static void main(String[] args) {
		new Inh3();
	}
}
/*Note:Whener instance of a class is created, its instance variable gets assigned value first.
 then non static block gets executed , then constructor runs. 
 */