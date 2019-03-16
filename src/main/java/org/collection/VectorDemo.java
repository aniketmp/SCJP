package org.collection;

import static java.lang.System.*;
import java.util.*;
public class VectorDemo
{
	public static void main(String args[])
	{
		Vector<Integer> v1=new Vector<Integer>();
		v1.addElement(new Integer(20));
		v1.addElement(40);
		v1.addElement(60);
		v1.addElement(null);//allowed
		v1.addElement(80);
		out.println(v1);
		Enumeration e=v1.elements();
		while(e.hasMoreElements())
		{
			out.println(e.nextElement());
		}

		Iterator itr=v1.iterator();
		while(itr.hasNext())
		{
			out.printf("%d\n",itr.next());
		}
		
	}
}
//gives guarantee of its order.
//Vector is synchronized.