package org.enums;
class Coffee //This cannot be private or protected
{
	CoffeeSize size; //declaring the reference 'size' of enum CoffeeSize
}
enum CoffeeSize //This cannot be private or protected
{
	BIG,HUGE,OVERWHELMING    //These are enum Objects. 'size' reference previously created is capable of referring any of these object.
}; //Note:Semicolon';' is optional
public class OutsideClass {
   public static void main(String[] args) 
   {
	   Coffee drink=new Coffee();
	   drink.size=CoffeeSize.BIG;  //This is the way we use enums outside the class
   } 
}
