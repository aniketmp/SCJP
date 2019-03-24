package org.generics;

public class TryMe <T >
{
public void display(T o)
{
	 System.out.print("generic "+o);
}

public void display(Number o)
{
	 System.out.print("specific Number "+o);
}




/*public void display(Integer o)        //Either you can have T,Number or Number,Integer combination but not T,Integer since call will be ambiguous
{
	 System.out.print("specific Integer "+o);
}*/

    public static void main(String args[]) 
   {
        try
        {
            Integer i=new Integer(20);
	new TryMe<Integer>().display(i);
	new TryMe().display(i);
	//new TryMe().display(i);
        }
         catch (Exception ex) {
            System.out.print("error");
        }
    }
}