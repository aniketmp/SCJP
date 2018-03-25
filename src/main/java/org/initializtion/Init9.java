package org.initializtion;

public class Init9 {
	public static void main(String[] args) {
		Integer i=new Integer(1);
		i++;// allowed although object
		System.out.println("i:"+i);
		
		Integer j=new Integer(5);
		System.out.println(i+j);
		System.out.println("i+j:"+i+j);
		
		
	}
}
