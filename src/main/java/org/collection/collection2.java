package org.collection;
import java.util.ArrayList;
import java.util.List;

public class collection2 {
public static void main(String[] args) 
{
	
	List<String> listA = new ArrayList<String>();

	listA.add("element 1");
	listA.add("element 2");
	listA.add("element 3");
	
	System.out.println(listA);
	//LIST having 0 based adding or removing
	listA.add(1, "element 0");  
	System.out.println(listA);
	
	listA.remove(2);
	System.out.println(listA);
	}
}
