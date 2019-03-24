package org.generics;
//EXAMPLE WITH GENERICS
class Gen<T>
{	
	T o;
	Gen(T o)
	{
		this.o=o;
	}
	
	public T getOb()
	{
		return o;
	} 
}
public class EXAMPLE4
{
	public static void main(String args[])
	{
		EXAMPLE4 e4=new EXAMPLE4();
		e4.go();
	}
	public void go()
	{
		Integer i=new Integer(12);
		String str=new String("hello");
		Gen<Integer> n1=new Gen<Integer>(i);
		Gen<String> n2=new Gen<String>(str);  
		
		
		Integer i2=n1.getOb(); //First Advantage is that you no need to typecast it
		System.out.println(i2);
		
		String str2=n2.getOb();//Same thing here
		System.out.println(str2);
	
		//Integer i3=n2.getOb();  //No problem This won't compile.
		//System.out.println(i3);		//Second BIG Advantage,Compiler will stop you by saying inconvertible types
	}
}	

