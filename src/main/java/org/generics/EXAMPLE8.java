package org.generics;

import java.util.*;
public class EXAMPLE8
{
	public static void main(String args[])
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("a");
		a1.add("b");
		a1.add("c");
		System.out.println("a1="+a1);
		receive(a1);
	}
	public static void receive(List l1) //It is allowed
	{
		System.out.println("l1="+l1);
		sending(l1);
		l1.add(3);//constraint violation is allowed here 
		System.out.println("After adding l1="+l1);
		sending(l1); 
	}
	
	public static void sending(List<String> mylist) //Before receiving contraint violation is allowed but not after
	{
		System.out.println("sending "+mylist);

		//mylist.add(3); //not allowed //if fun is public static void sending(List<Integer> mylist)  //Then it is allowed to add int
		//System.out.println("in mylist"+mylist);
		
// 		againSending(mylist);

	}
	
}
