package org.inheritance;
class x1
{
	
}
class y1 extends x1
{
	
}
public class Inh12 {
	public static void main(String[] args) {
		System.out.println();
		x1 x=new x1();
		y1 y=new y1();
		System.out.println(x.getClass().getName());
		System.out.println(y.getClass().getName());
		
		x=new y1();
		System.out.println(x.getClass().getName()); //getClass() returns class name of object it holds not name of reference.
		System.out.println(((x1)(new y1())).getClass().getName()); //although we type cast it, remember that we can only typecast rference not object.		
				
		
	}
}
