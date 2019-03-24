package org.collection;

import java.util.*;
import static java.lang.System.*;
public class AlgorithmsDemo
{
	public static void main(String args[])
	{
		LinkedList <Integer>l=new LinkedList<Integer>();
		l.add(-8);
		l.add(20);
		l.add(-20);
		l.add(8);
		//create a reverse order comparator
		Comparator <Integer>c=Collections.reverseOrder();
		//sort list by using the comparator
		Collections.sort(l,c);
		// get iterator
		Iterator <Integer>itr=l.iterator();
		System.out.println("List sorted in reverse");
		while(itr.hasNext())
		{
			System.out.print(itr.next() +" ");
		}
		System.out.println();
		System.out.println("Shuffled list");
		Collections.shuffle(l);
		// display randomize list
		itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() +" ");
		}
		System.out.println();
		System.out.println("Again shuffled list");
		Collections.shuffle(l);
		// display randomize list
		itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() +" ");
		}
		System.out.println();

		System.out.println("Mininum  "+Collections.min(l));
		System.out.println("Maximum  "+Collections.max(l));	

		

	}
}	
		
