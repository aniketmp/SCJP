package org.inheritance;
class Parent3
{
	private int i;
	private final void disp()
	{
		System.out.println("In parent");
	}
}
public class Inh7 extends Parent3{
	public int disp()    //valid...since this is not overriding cause method in Parent3 is not visible to class Inh7. This is whole new method. Hence overriding rule is not applicatble to this method.
	{
		System.out.println("In child");
		return 1;
	}
	public static void main(String[] args) {
		
	}
}
