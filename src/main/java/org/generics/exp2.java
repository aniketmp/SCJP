package org.generics;

import java.util.ArrayList;
import java.util.List;

public class exp2 {
	public static <E extends Number> List<E> process(List<E> nums)
	{
		return null;
		
	}
	public static void main(String[] args) {
		
		//Q: Which pair could be placed in order to program compile?
		
		
		//Option 1:Not allowed since output is assigned to the return type wich is List .Hence ArrayList cant assigned to List without typecasting 
		//ArrayList<Integer> input=null;
		//ArrayList<Integer> output=null;
		
		//Option 2: allowed
//		ArrayList<Integer> input=null;
//		List<Integer> output=null;
//		output=process(input);
		
		//Option 3: Not allowed. cannot convert from List<Integer> to List<Number>. Since we have passed Integer as E hence it will be replaced by
		//the return type .So return type = List<Integer>
//		ArrayList<Integer> input=null;
//		List<Number> output=null;
//		output=process(input);

		
//		Option 4: Not allowed. ArrayList reference cant hold List object
//		List<Number> input=null;
//		ArrayList<Integer> output=null;
//		output=process(input);
		
//		Option 5: Not allowed. ArrayList reference cant hold List object
//		List<Number> input=null;
//		ArrayList<Integer> output=null;
//		output=process(input);
		
//		Option 6: Allowed.
		List<Integer> input=null;
		List<Integer> output=null;
		output=process(input);		
	
		
	}
	

}
