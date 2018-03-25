package org.loop;

public class loop5 {
	public static void main(String[] args) {
		/*	while(false)
		{
			System.out.println(1);
		}*/
		//NOTE: WHOLE while loop won't be executed since it is unreachable code.
		boolean b=false;
		while(b) //This is OK. because b is variable
		{
			System.out.println(1);
		}
		if(false)
		{
			System.out.println("HELLO!");
		}
	}
}

/*Although the body of the condition is unreachable, this is not
an error because the JLS explicitly defines this as an exception to the rule. It allows
this construct to support optimizations through the conditional compilation. For
example,*/