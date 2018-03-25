package org.innerclass;

public class Car {
	class Engine
	{
		//which code should be inserted here to produce output "hi"		
		{
			//solution 1
			drive();
			//solution 2
			Car.this.drive();		
		}

		Engine()
		{
			//solution 3
			drive();
			//solution 4
			Car.this.drive();

		}
	}
	public static void main(String[] args) {
		new Car().go();
	}
	void go()
	{
		new Engine();
	}
	void drive()
	{
		System.out.println("hi");
	}
}
