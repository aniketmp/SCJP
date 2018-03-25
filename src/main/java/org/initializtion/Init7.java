package org.initializtion;
//assuming program run with java Init7 Aniket
public class Init7 {
	public static void main(String[] args) {
		System.out.println(args.length);
		System.out.println(args); 
		System.out.println(args+"  isnull:"+args==null); //printing weired things
		//System.out.println(args[1]); //NOTE:args is alwas 0 based
		System.out.println(args[0]); //NOTE:args is alwas 0 based
		//System.out.println(args[1]); //IT WILL THROUGH ArrayOutofBoundsException
		int arr[]=new int[3];
		System.out.println("arr:"+arr); 
		System.out.println("arr[0]:"+arr[0]);
		
		//System.out.println(args[0]);
		//System.out.println(null); //U also cannot directly print null

			
	}
}
