package org.generics;

import java.util.*;
//EXAMPLE WITHOUT AND WITH BOUNDED TYPES
abstract class Animal1 
{
    void eat() 
    {
      System.out.println ("animal eating");
    }
}  
class Dog extends Animal1
{
    void bark() {}
}
class Cat extends Animal1
{
  void meow(){}
}
public class EXAMPLE5A
{

	public static void main(String args[])
	{
		EXAMPLE5A e5a=new EXAMPLE5A();
		e5a.go();
	}
	public void go()
	{	  
    ArrayList<Animal1> animals = new ArrayList<Animal1>(); 
    animals.add(new Dog());
    animals. add (new Dog()); 
    takeAnimals(animals);
    //This will work fine but..
    
    ArrayList<Dog> dogs = new ArrayList<Dog>();
    dogs.add(new Dog());
    dogs.add (new Dog()); 
//     takeAnimals (dogs) ; //error 

//There's nothing in that method that looks harmful, right? After all,the whole point of polymorphism is that anything an Animal can do (in this case, the eat() method), a Dog can do as well. So what's the problem with having the method call eat() on each ofthe Dog references? Nothing. Nothing at all 
    
//There's nothing wrong with that code. But imagine this code instead:  ---(1)	
	
	}
  public void takeAnimals(ArrayList<Animal1> animals) 
  {
      for (Animal1 a: animals) 
      a.eat();
  // animals. add (new Cat()); -----(1)   Hence we will end up of adding cat in dogs Arraylist.
  }
  
//  solution is wildcard.i.e (?).When you use wildcard in the method argument,the compier will STOP you from doing anything that could hurt the list referenced by the method parameter.

//You can still invoke the method on the element in the list,but you cannot add elements to the list.

//In other words,you can do things with the list elements,but you cant put new things in the list,so you are safe at runtime,because the compiler wont let you do anything that might be horrible at runtime.

  
//    public void takeAnimals(ArrayList<? extends Animal> animals)   
//or  public<T extends Animal void takeAnimals(ArrayList<T> animals) 
//   {
//       for (Animal a: animals) 
//       a.eat();
//   }
  
     
}	
