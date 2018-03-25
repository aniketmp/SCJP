package org.api;

import java.util.Arrays;
import java.util.Comparator;

public class api5 {
	public static void main(String[] args) {
		 String s[]={"map","pen","marble","key"};
		 System.out.println("before sort");		 
		 for(String str:s) System.out.print(str+" ");
		 Othello o=new Othello();
		 Arrays.sort(s,o);
		 System.out.println("\nafter sort");
		 for(String str:s) System.out.print(str+" ");		 
		 System.out.println("\nThe index of element map is : " + Arrays.binarySearch(s, "map"));
		 
		 //Look at another example carefully
		 //initializing unsorted int array
		   int intArr[] = {30,20,5,12,55};
		   System.out.println("before sort");		 
			for(int i:intArr) System.out.print(i+" ");
		   // sorting array
		   Arrays.sort(intArr);
		   // let us print all the elements available in list
		   System.out.println("\nafter sort");			 
		   for (int number : intArr) {
			   System.out.print(number+" ");
		   }
		   // entering the value to be searched
		   int searchVal = 12;

		   int retVal = Arrays.binarySearch(intArr,searchVal);
			
		   System.out.println("\nThe index of element 12 is : " + retVal);
		   
		   //Explanation: why 1st example shows uncorrect result. Because javadocs says that 
		   //The array must be sorted into ascending order according to the natural ordering of its elements 
		   // prior to making this call. If it is not sorted, the results are undefined. 
		   //Hence if you want to sort array based on your condition, you should provide your comparator in call.
		   //Arrays.binarySearch(s, "map",o); where 'o' is the object of comparator which we used.
		   //In second example results are accurate since it was sorted according to its natural ordering.
	}
	static class Othello implements Comparator<String>
	{

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}
		
	}
}
