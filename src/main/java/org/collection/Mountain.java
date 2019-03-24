package org.collection;
import java.util.*;

public class Mountain
{
	private String name;
	private int height;
	
	Mountain(String name,int height)
	{
		this.name=name;
		this.height=height;		
	}
	public String getName()
	{
		return name;
	}
	public int getHeight()
	{
		return height;
	}
	public String toString()
	{
		return name+" "+height;
	}
}
