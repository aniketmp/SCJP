package org.switches;

public class switch6 {
public static void main(String[] args) 
{
	  //int m =13 //works;
	  //byte m =13 //not works ...since byte cannot hold 128 last case;
	 // long m =13 ;//not works ...since long, float, double, and boolean can never be used as a switch variable
	  //char m=13; //works
	  short m=13; //works
	  switch(m)
	  {
	     case 32  : System.out.println("32");   break;
	     case 64  : System.out.println("64");   break;
	     case 128 : System.out.println("128");  break;
	  }
	}
}
