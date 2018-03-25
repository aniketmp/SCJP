package org.enums;
class Coffee2
{
	enum CoffeeSize //This can be public or default
	{
		BIG,HUGE,OVERWHELMING    //These are enum Objects. 'size' reference previously created is capable of referring any of these object.
	} 
	CoffeeSize size; 
}

public class InsideClass {
   public static void main(String[] args) 
   {
	   Coffee2 drink=new Coffee2();
	   drink.size=Coffee2.CoffeeSize.BIG;  //This is the way we use enums inside the another class
   }
   
}
