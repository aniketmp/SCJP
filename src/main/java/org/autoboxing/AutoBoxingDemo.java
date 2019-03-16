package org.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		//Prior to java 5
		list.add(new Integer(1));
		//After java 5
		list.add(2);
		
		
		//Prior to java 5
		Integer x=new Integer(30);
		int y=x.intValue();
		y=y+1;
		x=new Integer(y);
		System.out.println("x:"+x);
		
		//After java 5
		Integer a=new Integer(30);
		a++;  
		System.out.println("x:"+a);
	}
}
