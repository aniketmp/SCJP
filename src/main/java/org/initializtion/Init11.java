package org.initializtion;

public class Init11 
{
	Integer A;
	int a;

	public Init11(int a) {		
		System.out.println("A:"+A+" a:"+a);
		this.a = A + a; //note this..A is null by default ...
		this.a = a + A; //Either way wont work
		System.out.print(this.a);
	}

	public static void main(String args[]) {
		Integer A = new Integer(1);
		Init11 t = new Init11(A);
	}
}