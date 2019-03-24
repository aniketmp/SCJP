package org.generics;

import java.util.ArrayList;
import java.util.List;

class Person
{
	void print()
	{
		System.out.println("This is Employee");
	}
}
class Emp extends Person
{
	void print()
	{
		System.out.println("This is Person");
	}	
}
public class InheritanceCheck {
	public static void main(String[] args) {
		Person[] e=new Emp[5];
		//List<Employee> persons =new List<Person>();//you cannot assign this. Since parent-child isn't work in Generics.
		List<? extends Person> persons =new ArrayList<Emp>();//you cannot assign this. Since parent-child isn't work in Generics.
		//persons.add(new Employee()); //Cannot add Employee
		//persons.add(new Person()); //Neither add Person
		for(Person p:persons)
		{
			p.print();//but you can iterate over it and call any method
		}
	}	
	
}
