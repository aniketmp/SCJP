package org.generics;

//EXAMPLE WITH BOUNDED WILDCARD

class TwoD
{	
	int x;
	int y;

	TwoD(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
}

class ThreeD extends TwoD
{	
	int z;
	ThreeD(int x,int y,int z)
	{
		super(x,y);
		this.z=z;
	}
}
class FourD extends ThreeD
{	
	int p;
	FourD(int x,int y,int z,int p)
	{
		super(x,y,z);
		this.p=p;
	}
}
//Write a generic class which except any one of the above class and has generic method which prints two dimension of given array of object of type either TwoD or its child.

class GenCoords<T extends TwoD>
{
	T arr[];
	GenCoords(T arr[])
	{
		this.arr=arr;
	}
	
}
	
public class EXAMPLE7
{
	
	static void showXY(GenCoords<?> o)
	{
		
		for(int i=0;i<o.arr.length;i++)
		{
			System.out.println("x="+o.arr[i].x+"y="+o.arr[i].y);
		}
	}
	
	static void showXYZ(GenCoords<? extends ThreeD> o)
	{
		
		for(int i=0;i<o.arr.length;i++)
		{
			System.out.println("x="+o.arr[i].x+"y="+o.arr[i].y+"Z="+o.arr[i].z);
		}
	}
	public static void main(String args[])
	{
		EXAMPLE7 e7=new EXAMPLE7();
		e7.go();
	}
	public void go()
	{
		TwoD twoD[]={new TwoD(21,22),new ThreeD(33,34,35),new FourD(46,47,48,49)};

		ThreeD threeD[]={new ThreeD(33,34,35),new ThreeD(46,47,48)};

		FourD fourD[]={new FourD(53,64,75,86),new FourD(96,107,118,129)};


		GenCoords<TwoD> c1=new GenCoords<TwoD>(twoD);
		showXY(c1);
		//showXYZ(c1); //Error
	
		GenCoords<ThreeD> c2=new GenCoords<ThreeD>(threeD);
		showXYZ(c2);
		
		GenCoords<FourD> c3=new GenCoords<FourD>(fourD);
		showXYZ(c3);
	
		
		
	}			
}	
