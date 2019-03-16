package org.collection;
import java.util.*;
public class LinkedHashMapDemo
{
	public static void main(String args[])
	{
		LinkedHashMap <String,Double>h=new 		LinkedHashMap<String,Double>();
		h.put("john",3434.34);
		h.put(null,null);//both null allowed
		h.put("tom",123.12);
		h.put("jane",1378.00);
		h.put(null,1.75); //only null key is also allowed
		h.put("todd",99.22);	
		h.put("max",null);//only null value is also allowed
		h.put("tom",34.45); //It will replace original content
		// get a set of entries
		Set set=h.entrySet();//returns set<Map.Entery<k,v>>
		// get an iterator
		Iterator i=set.iterator();
		// display elements
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
Note:
1)LinkedHashMap is a subclass of HashMap. That means it inherits the features of HashMap
2)In addition, the linked hash map preserves the insertion-order.Its ordered Map.To maintain the uniqueness among the keys, LinkedHashMap replace 
previously existing key by new key.
3)Map.Entry is inner Interface of Map which is used to retrive both i.e key and value which is not possible in Map
*/
