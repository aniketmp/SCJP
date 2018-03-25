package org.innerclass;

//you can have same class name in outer , inner and method local inner class 
class A
{
	void m()
	{
		System.out.println("outer");
	}
}
public class exp1 
{
	public static void main(String[] args) 
	{
		new exp1().go();
	}
	void go()
	{
		new A().m();
		class A
		{
			void m()
			{
				System.out.println("inner");
			}
		}
	}
	class A
	{
		void m()
		{
			System.out.println("middle");
		}
	}
	
}
