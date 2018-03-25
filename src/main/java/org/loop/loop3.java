package org.loop;

public class loop3 {
	public static void main(String[] args) {
		int b = 3;
		for (int a = 1; b != 1; System.out.println("iterate")) 
		{
			b = b - a;
		}
		
	}
}
/*many mistakenly call the "increment expression," doesn't need to increment or set
anything; you can put in virtually any arbitrary code statements that you want to
happen with each iteration of the loop. Look at the following*/
