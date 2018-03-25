package org.enums;

import org.enums.InsideMain.CoffeeSize2;
public class Enum1 
{
   enum CoffeeSize //This can be public or default
   {
	   BIG(10),HUGE(18),
	   OVERWHELMING(24)
	   {
		 @Override  //Overriding getOunces method only for OVERWHELMING Object.
		public int getOunces() {
			// TODO Auto-generated method stub
			return 30;
		}   
	   };
	   private int ounces; //Enum can have instance variable
	   CoffeeSize(int ounces) //Enum can have constructors
	   {
		   this.ounces=ounces;
	   }
	   public int getOunces()
	   {
		   return ounces;
	   }
		
   } 	
	CoffeeSize size; 
	public static void main(String[] args) {
		Enum1 enum1=new Enum1();
		enum1.size=Enum1.CoffeeSize.BIG;
		System.out.println("enum1.size:"+enum1.size);
		System.out.println("----To get all values of enum----");
		for(CoffeeSize c:enum1.size.values())
		{
			System.out.println("value:"+c+"  ordinal:"+c.ordinal()+"  ounces:"+c.ounces+"  overrided ounces:"+c.getOunces());
		}
		System.out.println("----To get all ordinals of enum----");		
		
	}
 }
