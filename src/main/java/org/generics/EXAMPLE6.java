package org.generics;
//EXAMPLE WITH WILDCARD
//
class Gen2<T extends Number>
{	
	Double avg;
	T arr[];
	Gen2(T a[])
	{
		arr=a;
	}
	Double getAvg()
	{
		Double sum=0.0;
		for(int i=0;i<arr.length;i++)
		{
			
			sum+=arr[i].doubleValue();
		}		
		avg=sum/arr.length;
		return avg;
	}
	boolean sameAvg(Gen2 ob) // This is not a generic function since it can take same type as class 
// 	boolean sameAvg(Gen<?> ob) //Wild Card.Now it can take any type   or you can try   boolean sameAvg(Gen ob) 
	{	
		
		double d1,d2=0;

		d1=ob.getAvg();
		d2=getAvg();

		//if(ob.getAvg()==getAvg())  //Not allowed ,because getAvg() returns Double class ,and  you cant invoke == operator direct on  class.
		if(d1==d2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class EXAMPLE6
{
	public static void main(String args[])
	{
		EXAMPLE6 e6=new EXAMPLE6();
		e6.go();
	}
	public void go()
	{
		Integer i[]={10,20,30,40};
		Double d[]={10.2,20.2,30.3,40.3};
		Float f[]={10.0F,20.0F,30.F,40.0F};
		String s[]={"a","b","c","d"};
	
		Gen2<Integer> g1=new Gen2<Integer>(i);		
		Gen2<Double> g2=new Gen2<Double>(d);
		Gen2<Float> g3=new Gen2<Float>(f);
// 		Gen g4 =new Gen(s); //No problem.Compile time error (java.lang.String is not within its bound).It will not even allow to create the obj of Gen 
		
				

		System.out.println("Avg of i & d are same? "+g1.sameAvg(g2));
		System.out.println("Avg of i & f are same? "+g1.sameAvg(g3));
		
  }	
}