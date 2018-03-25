package org.inheritance;
class Parent4
{
	int i=10;
	static int j=20;
	public void disp()
	{
		System.out.println(i+" "+j);
	}
	
}
public class Inh8 extends Parent4{
	int i=70; //you can re-write (not override) instance variables
	static int j=80;//you can re-write (not override) static variables
	public void disp()
	{
		System.out.println(i+" "+j);
	}
	public void disp2()
	{
		System.out.println("In disp2");
	}
	public static void main(String[] args) {
		Parent4 p=new Parent4();
		p.disp();
		
		p=new Inh8();
		p.disp();
		
		((Parent4)(new Inh8())).disp(); //This is just the typecasting of reference not object.
		
//		((Parent4)(new Inh8())).disp2();  //compilation error. since there is not disp2() in Parent4  
	}
}
