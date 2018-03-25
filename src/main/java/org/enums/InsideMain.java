package org.enums;

public class InsideMain {
	enum CoffeeSize2 //This can be public or default
	{
		BIG,HUGE,OVERWHELMING    //These are enum Objects. 'size' reference previously created is capable of referring any of these object.
	} 	
	CoffeeSize2 size; 
   public static void main(String[] args) 
   {
	   InsideMain drink=new InsideMain();
	   drink.size=CoffeeSize2.BIG;  //This is the way we use enums inside the another class
   }
   public void illegal()
   {
	   /*enum CoffeeSize //This cannot be inside the method
		{
			BIG,HUGE,OVERWHELMING    
		}*/ 
   }
}
