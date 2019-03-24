package org.generics;

//EXAMPLE WITHOUT AND WITH BOUNDED TYPES
// class Gen<T>//First error
 class Gen1<T extends Number> //solution of first error.Here we are saying to compiler that we are only going to send the object of either type Number or its subtype
{	
	Double avg,sum=0.0;
	T arr[];
	Gen1(T a[])
	{
		arr=a;
	}
	Double getAvg()
	{
		for(int i=0;i<arr.length;i++)
		{
			
			sum+=arr[i].doubleValue();//First error
		}
		System.out.println("sum="+sum);
		avg=sum/arr.length;
		return avg;
	}
}
public class EXAMPLE5
{
	public static void main(String args[])
	{
		EXAMPLE5 e5=new EXAMPLE5();
		e5.go();
	}
	public void go()
	{
		Integer i[]={10,20,30,40};
		Double d[]={10.2,20.2,30.3,40.3};
		String s[]={"a","b","c","d"};
	  Character c[]={'a','b','c','d'};
	
		Gen1<Integer> g1=new Gen1<Integer>(i);
		Gen1<Double> g2=new Gen1<Double>(d);
		//Gen1<String> g3 =new Gen1<String>(s); //No problem.Compile time error (java.lang.String is not within its bound).It will not even allow to create the obj of Gen 
// 		Gen1<Character> g4=new Gen1<Character>(c);

		System.out.println("avg="+g1.getAvg());
		System.out.println("avg="+g2.getAvg());
		//System.out.println("avg="+g3.getAvg());
// 		System.out.println("avg="+g4.getAvg());
	}   
}	
