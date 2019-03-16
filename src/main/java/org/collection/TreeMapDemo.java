package org.collection;

import java.util.*;
import static java.lang.System.*;
public class TreeMapDemo
{
	public static void main(String args[])
	{
		TreeMap <String,Double>h=new TreeMap<String,Double>();
		h.put("john",3434.34);
		//h.put(null,3434.34); //doesn't support null keys.
		h.put("tom",123.12);
		h.put("jane",1378.00);
		h.put("jane",null); //Support null values.
		h.put("todd",99.22);
		// get a set of entries
		Set set=h.entrySet();
		// get an iterator
		Iterator i=set.iterator();
		// display elements
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			out.print(me.getKey()+ ":");
			out.println(me.getValue());
		}
		out.println();
		//deposit 1000 in john's account
		double balance=(Double)h.get("john");
		h.put("john",balance+1000);
		out.println("john's new balance  "+h.get("john"));
	}
}
		
/*
 * 1)A TreeMap is sorted by keys.
 * 2)Since TreeMaps are sorted by keys, the object for key has to be able to compare with each other, that's why it has to implement Comparable interface.
 */
