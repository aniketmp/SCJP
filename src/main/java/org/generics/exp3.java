package org.generics;

import java.util.Comparator;

public class exp3 {
	public static void main(String[] args) {		
		//Statictest s=new Statictest();//Note:You cant call like this from static method.
		Statictest s=new exp3().new Statictest();//This is the way of calling Statictest by using instance of exp3
		//The reason for this is obevious.Suppose there is non-static method name doIt(). So can we able to call this method directly
		//from main? No. We have to use instance of exp3 to call this method. Similarly, we can't call this class directly.
	}
	class Statictest
	{
		
	}
}
