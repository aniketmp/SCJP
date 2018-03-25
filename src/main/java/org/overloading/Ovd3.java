package org.overloading;
class Ovd3 
{
	static void go(Integer x) 
	{
		System.out.println("Integer"); 
	}
	static void go(long x) 
	{
		System.out.println("long"); 
	}
	public static void main(String [] args) 
	{
		int i = 5;
		go(i); // which go() will be invoked?
	}
}
/*
//Note:As we've seen earlier, if the only version of the go() method was one that took
an Integer, then Java 5's boxing capability would allow the invocation of go() to
succeed. Likewise, if only the long version existed, the compiler would use it to
handle the go() invocation. The question is, given that both methods exist, which
one will be used? In other words, does the compiler think that widening a primitive
parameter is more desirable than performing an autoboxing operation? The answer is
that the compiler will choose widening over boxing, so the output will be
long
Java 5's designers decided that the most important rule should be that preexisting
code should function the way it used to, so since widening capability already existed,
a method that is invoked via widening shouldn't lose out to a newly created method
that relies on boxing.
*/