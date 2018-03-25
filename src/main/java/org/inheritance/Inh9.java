package org.inheritance;
class Parent5
{
	int i=10;
	int j=11;
	static int k=20;
	static int l=21;
	int m=5050;
	
	int x=30;
	static int y=31;
	Parent5()
	{
		System.out.println("i:"+i+" j:"+j+" k:"+k+" l:"+l);
	}
}
public class Inh9 extends Parent5{
	int i=100; //we may redefine instance variable
	static int j=101; //we may redefine instance variable as well as change its type from non static to static
	static int k=200;  //we may redefine static variable	
	
	int l=201;  //we may redefine static variable as well as change its type from non static to static
	String m="abc";    //we may change its data type also..
	Inh9()
	{
		System.out.println("i:"+i+" j:"+j+" k:"+k+" l:"+l+"  m:"+m+"   super.j:"+super.j+" super.k:"+super.k+" Parent5.k:"+Parent5.k+" super.m:"+super.m);  //we can refer parent's class static variable either by using super keyword or by using parent's class name. 
		System.out.println("x:"+x+" y:"+y); //x and y variable are purely inherited. We havent redefining it or changed its type.
		x=301;
		y=302;
		System.out.println("x:"+x+" y:"+y); //Not only we can access x & y but also we can change the value of x and y any time
	}
	public static void main(String[] args) {
		new Inh9();
	}
	
}
