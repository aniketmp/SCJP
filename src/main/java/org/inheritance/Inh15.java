package org.inheritance;
class A {
	public int i = 10;
	private int j = 20;
}

class B extends A {
	private int i = 30; // 1
	public int k = 40;
}

class C extends B {
}

public class Inh15 {
	public static void main(String args[]) {
		C c = new C();
		//System.out.println(c.i);  
		//System.out.println(c.j);
		
		System.out.println(c.k);
		System.out.println(((A)c).i);
	}
}
/*
 * You cannot access c.i because i is private in B. 
 * But you can access ((A)c).i because i is public in A. 
 * Remember that member variables are shadowed and not
 * overridden. So, B's i shadows A's i and since B's i is private, you can't access A's i
  unless you cast the reference to A.You cannot access c.j because j is private in A
 */
