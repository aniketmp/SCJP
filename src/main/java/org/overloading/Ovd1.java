package org.overloading;
public class Ovd1
{
   
  public static void main(String args[])
	{
		System.out.println("In void main");

           
	}
    public static void main(int args[])
	{
		System.out.println("In int main");    
	}
// 	public static int main(String args[])  //not a valid overloading..since only return type changed
// 	{
// 		System.out.println("In main");
//     return 1;
// 	}
	
  
}


