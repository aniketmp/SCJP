package org.overloading;

public class Ovd2 {


	public void disp(int i)
	{
		System.out.println("in int");
	}
	public void disp(long i)
	{
		System.out.println("in long");
	}
	public void disp(double i)
	{
		System.out.println("in double");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=5;
		short s=5;
		long l=5;
		float f=5.0f;
		
		Ovd2 o=new Ovd2();
		o.disp(b);
		o.disp(s);
		o.disp(l);
		o.disp(f);		
		
				
	}

}
