package org.inheritance;

class base0
{
}
class sub0 extends base0
{
}
class sub01 extends base0
{
}
public class ArrayStoreExcepDemo 
{
	//Will this program work or not?
	public static void main(String args[])
	{
		base0 arr[]=new sub0[3]; 
		arr[0]=new sub0();
		arr[1]=new sub0();
		arr[2]=new sub01();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
