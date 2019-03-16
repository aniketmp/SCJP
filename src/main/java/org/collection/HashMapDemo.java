package org.collection;

import java.util.*;
public class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap <String,Double>h=new HashMap<String,Double>();
		h.put("john",3434.34);
		h.put(null,null); //null is allowed
		h.put(null,112.11);//only null key allowed  but it will not be added since the previous null key exists
		h.put("tom",null);
		h.put("tom",893.75);
		h.put("jane",1378.00);
		h.put("todd",99.22);
		h.put("tom",53.12);//Here it will replace this previous tom value
		//h.put("tom",null); you can have only value null
		// get a set of entries
		Set set=h.entrySet();//returns set<Map.Entery<k,v>>
		// get an iterator
		Iterator i=set.iterator();
		//display elements
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.print(me.getKey()+ ":");
			System.out.println(me.getValue());
		}
		System.out.println();
		//deposit 1000 in john's account
		double balance=((Double)h.get("john"));
		h.put("john",balance+1000);
		System.out.println("john's new balance  "+h.get("john"));
	}
}
/*
Note:HashMap gives you unsorted, unordered Map.To maintain the uniqueness among the keys HashMap replaces the new value for the key if same key is existing before.

Map.Entry is inner Interface of Map which is used to retrive both i.e key and value which is not possible in Map
*/

