package org.arithmatics;

public class arith2 {
	public static void main(String[] args) {
		int k = 1;
		int[] a = { 1 };
		k += (k = 4) * (k + 2);
		a[0] += (a[0] = 4) * (a[0] + 2);
		System.out.println(k + " , " + a[0]);
	}
	//Note: First left side is evaluated and then right side. In right side , it is evaluated based on operator precedence .
}
