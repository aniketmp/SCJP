package org.inheritance;
class Hotel {
    Hotel()
    {
    	System.out.println("In hotel");
    }
}

public class Inh14 extends Hotel {
	int i=2;
	Inh14()
	{		
		System.out.println("In Inh14 no arg");
		//this(1);// cannot call this or super in 2nd line onwards
	}
	
	Inh14(int i)
	{
		this();
		System.out.println("In Inh14 one arg ..i:"+i+"  this.i:"+this.i);
		this.i=i;				
	}
    public static void main(String args[]) {
        Inh14 hotel = new Inh14();
        System.out.println("i:"+hotel.i);
        
        hotel = new Inh14(5);
        System.out.println("i:"+hotel.i);
                
    }
}