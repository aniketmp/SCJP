package org.collection;
import java.util.*;
import static java.lang.System.*;
public class TreeSetDemo
{
	public static void main(String  args[])
	{
		TreeSet <String>t=new TreeSet<String>();
		t.add("a");
		t.add("b");
		t.add("d");
		t.add("e");
		//t.add(null);//TreeSet doesn’t allow even a single null element. If you try to insert null element into TreeSet, it throws NullPointerException.
		t.add("c");
		out.println("contents are  "+t);
	}
}		
/*
 * 1) Its sorted collection.
 * 2) TreeSet orders the elements according to supplied Comparator. If no comparator is supplied, elements will be placed
 *  in their natural ascending order.
 * 3) TreeSet gives less performance than the HashSet and LinkedHashSet as it has to sort the elements after each
 *  insertion and removal operations.
 * 4)TreeSet gives performance of order O(log(n)) for insertion, removal and retrieval operations 
 *   
*/ 