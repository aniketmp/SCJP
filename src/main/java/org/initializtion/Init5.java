package org.initializtion;

public class Init5 {
	public static void main(String[] args) {
		String str="a"+'b'+63;  //compiles fine!
		//str='b'+new Integer(63);//error
		
		int i='b'+new Integer(63);//Since the first operand of + one is of numeric type, its numeric value of 98 will
		//be used. Integer 63 will be unboxed and added to 98. Therefore, the final value
		//will be int 161.
		
		str = 'b'+63+"a";
		System.out.println(str);
		
		//str = 63 + new Integer(10);//wont compile!Since none of '+' the operands is a String, the + operator will not generate a
		//String. However, due to auto-unboxing, it will generate an int value of 73.
		i=63 + new Integer(10);
	}
}
