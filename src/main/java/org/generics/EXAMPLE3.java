package org.generics;
//EXAMPLE WITHOUT GENERICS
class NonGen
{	
	Object o;
	NonGen(Object o)
	{
		this.o=o;
	}
	public Object getOb()
	{
		return o;
	}
}
public class EXAMPLE3
{
	public static void main(String args[])
	{
		EXAMPLE3 e3=new EXAMPLE3();
		e3.go();
	}
	public void go()
	{
		Integer i=new Integer(12);
		String str=new String("hello");
		NonGen n1=new NonGen(i);
		NonGen n2=new NonGen(str);  
						
		//NonGen n1=new NonGen(12);	//you can also do it like this 
		//NonGen n2=new NonGen("hello");//because of autoboxing
		
		Integer i2=(Integer)n1.getOb(); //First Disadvantage is that you need to typecast it
		System.out.println(i2);
		
		String str2=(String)n2.getOb();//Same thing here
		System.out.println(str2);
	
		Integer i3=(Integer)n2.getOb(); //Yikeees
		System.out.println(i3);		//Second disadvantage,No compile error,but runtime error(ClassCaseException)
	}
}	
//You will see in next example how generics will save you from runtime blunder