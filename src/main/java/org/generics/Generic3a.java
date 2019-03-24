package org.generics;

import static java.lang.System.*;
interface shape2
{
	void draw();
	
}
class triangle2 implements shape2
{
	public void draw()
	{
		out.println("in draw of triangle");
	}
}
class rect2 implements shape2
{
	public void draw()
	{
		out.println("in draw of rect");
	}
}
class common2<T extends shape2>    //note this line.Here we use extends instead of implements although shape is interface.Generic class common receives only those classes who implements shape.
{
	T ob;
	public common2(T ob)
	{
		this.ob=ob;
	}
	public void fun()
	{
		ob.draw();
	}
}
public class Generic3a
{
	
	public static void main(String args[])
	{
		common2<rect2> c1=new common2<rect2>(new rect2());
		c1.fun();

		common2<triangle2> c2=new common2<triangle2>(new triangle2());
		c2.fun();
	}
}