package org.inheritance;

class Animal
{
	
}
class Horse extends Animal
{
	
}
public class Inh10 {
	public void doStuff(Animal a)
	{
		System.out.println("In the animal version");
	}
	public void doStuff(Horse a)
	{
		System.out.println("In the horse version");
	}
	public static void main(String[] args) {
		Inh10 i=new Inh10();
		Animal animal=new Animal();
		Horse horse= new Horse();
		
		i.doStuff(animal);
		i.doStuff(horse);
		
		animal=new Horse();
		i.doStuff(animal); //Although we might think that horse version of method will invoke but actual output would be animal.
		//Because decision of which overloaded method is to be call is based on reference not an object which is taken by offcourse compiler! 
				
	}
}
