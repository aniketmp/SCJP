package org.loop;
import java.util.Collection;
import java.util.Iterator;

public class loop4 {
	public static void main(String[] args) {
		if(true)
		{
//			break;
//			continue;  //we cannot use break or continue inside the if except if itself in the loop.
		}
		Collection c=null;
		for(Object o:c)
		{
			
		}
		Object o2;
		//for(o2:c) ERROR! ..NOTE: Cannot use an existing/predefined variable in the variable declaration part.
		{
			
		}		
		
		int arr[]={1,2,3};
		for (int i:arr)
		{
			
		}
		int j;
		//for (j:arr) Same here..We cannot use existing variable.
		{
			
		}
		for (final int k:arr) //final is the only modifier (excluding annotations) that is allowed here.
		{
			
		}
	}

}
