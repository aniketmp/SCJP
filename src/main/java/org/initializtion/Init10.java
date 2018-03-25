package org.initializtion;

public class Init10 {
	public static void main(String[] args) {
		int a=10;
		int b=a++; //post ++ operator first assigns the value then increment itself.
		System.out.println("a:"+a+" b:"+b);
		System.out.println(disp(2));
		System.out.println(disp2(8));
	}

	private static int disp(int i) {
		// TODO Auto-generated method stub
		return i++;
	}
	private static int disp2(int i) {
		// TODO Auto-generated method stub
		return ++i;
	}
}
