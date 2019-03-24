package org.collection;
import java.util.*;
import java.io.*;

public class SortMountains
{
	//private ArrayList<Mountain> mtn=new ArrayList<Mountain>();	

	public static void main(String args[])
	{
		ArrayList<Mountain> mtn=new ArrayList<Mountain>();
	
		mtn.add(new Mountain("Sahyadri",14255));
		mtn.add(new Mountain("Himalaya",14433));
		mtn.add(new Mountain("Alps", 4156));
		mtn.add(new Mountain("UCastle", 14265));
		System.out.println(mtn);
		
		Collections.sort(mtn,new CompareByName());
		System.out.println(mtn);

		Collections.sort(mtn,new CompareByHeight());
		System.out.println(mtn);
	}
}
class CompareByName implements Comparator<Mountain>
{
	public int compare(Mountain c1,Mountain c2)
	{
		return((c1.getName()).compareTo(c2.getName()));
	}	
}
class CompareByHeight implements Comparator<Mountain>
{
	public int compare(Mountain c1,Mountain c2)
	{
		return((c1.getHeight())>(c2.getHeight())?1:-1);
	}	
}