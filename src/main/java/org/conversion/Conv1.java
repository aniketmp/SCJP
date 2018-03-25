package org.conversion;
class MyClass
{
	byte a=2;  //1 byte long
	short b;   //2 bytes long
	int c=4;   //4 bytes long (default for non fraction no conversion)
	long d;    //8 bytes long
	float e;   //4 bytes long
	double f;    //8 bytes long (default for fraction no conversion)
	char g='g';   //2 bytes long
	boolean h;    //not precisely defined 
	String i="hello";
  static final long d2 =-8375051161084998002L;   //Try it without last L
}
public class  Conv1
{
	public static void main(String args[])
	{
		MyClass m1=new MyClass();
		m1.c=m1.a;   //allowed(Data widening).
		
		//m1.a=m1.c;  //not allowed.... compile time error!
		m1.a=(byte)m1.c; //allowed(Data shortening.Which may causes loss of precision.)
		
		//m1.a=m1.a+m1.a; //not allowed because any expressions are implicitly converted to int.
		m1.c=m1.c*m1.c;   //allowed since int expression are converted to int only.
		//m1.e=m1.f+m1.c;   //not allowed cause when any fractional no. comes into expression its result is always double. 

		m1.d=m1.g;//allowed
		
		//m1.g=m1.a; //not allowed.             
		m1.g=(char)m1.a; //allowed(Type casting)		

		//m1.a=m1.g;   //not allowed.
		m1.a=(byte)m1.g;  //allowed(Type casting)		
		
		//m1.i=(String)m1.g; // Inconvertible types
		//or
		//m1.g=(char)m1.i;  // Inconvertible types
		//System.out.println(m1.i);
		//System.out.println(m1.g);

		//m1.i=(String)m1.h; //
		//m1.h=(boolean)m1.c;//Inconvertible types
		//m1.h="true";       //
		m1.h=true;	//allowed.
		m1.i="false";
		//m1.h=(Boolean)m1.i;//not allowed Inconvertible types
		
		//Long l=m1.c;  //compilation fails because although long is capable of holding the int ,int is first converted to wrapper class Integer since formal parameter is Long ..and hence Long cannot hold Integer obj.  
		Long l=(long) m1.c; //allowed
		
		m1.c=m1.g; //conversion from character to int is allowed
		// m1.b=m1.g; //although short and char are 2 bytes they are implicitly inconvertible
		
		m1.c='a'; //int can hold character
		m1.g=15;  //similarly character can hold int
		System.out.println("c:"+m1.c+" g:"+m1.g);		
	}
}	





	