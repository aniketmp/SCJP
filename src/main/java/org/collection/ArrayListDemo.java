package org.collection;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
/*
 * 	ArrayList gives you fast iteration (since its index based) and random access. This is ordered (FIFO) all the elements need to be shifted to fill out the space created by removed element.and unsorted collection. This implements 
 * RandomAccess interface (marker interface) means it supports fast constant time access. Do not go for this when you need fast
 * insertion and deletion since all the elements need to be shifted to fill out the space created by add/removed element.
 */
	public static void main(String[] args) 
	{
		
		List<String> listA = new ArrayList<String>();
	
		//LIST having 0 based adding or removing
		listA.add("element 1");
		listA.add("element 2");
		listA.add("element 3");
		
		System.out.println(listA);
		//It also supports index based adding/removing
		listA.add(1, "element 0");  
		System.out.println(listA);
		
		listA.remove(2);
		System.out.println(listA);
		
		listA.add(null);  //Allows null values to be inserted.
		System.out.println(listA);
	}
}
