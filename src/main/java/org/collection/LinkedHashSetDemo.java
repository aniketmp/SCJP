package org.collection;

import java.util.*;
import static java.lang.System.*;
public class LinkedHashSetDemo
{
	public static void main(String args[])
	{
		LinkedHashSet <String>hs=new LinkedHashSet<String>();
		hs.add("b");
		hs.add("c");
		hs.add("d");
		hs.add("e");
		hs.add(null); //null is allowed
		hs.add("f");
		hs.add("g");
		boolean res=hs.add("c");
		hs.add("h");
		out.println("contents of LinkedHashSet "+hs+res);
	}
}	
/*
1)It maintains the order of insertion of element.
2)To maintain uniqueness, LinkedHashset will not add new value.
3)Like HashSet, it provides constant-time performance for the basic operations (add, contains and    remove),
 assuming the hash function disperses elements properly among the buckets. Performance is     
  likely to be just slightly below that of HashSet, due to the added expense of maintaining the linked list	
*/	
