package org.switches;

public class switch4 {
	public static void main(String[] args) {
		final int a = 1;
		final int b;		
		int x = 0;
		int c; //step1
		if(1==1) //step 2
		{
			c=12;
		}
		switch (x) 
		{
			case a: // ok
   		  //case b: // compiler error
			//case c: // step1:compiler error!
			//case c: // step2:Again compiler error!It must be constant expression
		}
	}
}
/*
 * A case constant must evaluate to the same type as the switch expression can
use, with one additional—and big—constraint: the case constant must be a
compile time constant! Since the case argument has to be resolved at compile
time, that means you can use only a constant or final variable that is assigned a
literal value. It is not enough to be final, it must be a compile time constant.
 
*/