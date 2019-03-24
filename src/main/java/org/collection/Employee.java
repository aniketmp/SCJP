package org.collection;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private String name;
	private int age;
		
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	 public int compareTo(Employee e)
     {
        if(age>e.age)
      	{
      		return 1;
      	}
      	else if(age<e.age)
      	{
      		return -1;
      	}
      	else
      	{
      		return 0;
      	}
     }
   /* public int compareTo(Employee e)
      {
    	return name.compareTo(e.name);
      }*/
	 
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}	

}
class SortByName implements Comparator<Employee>
{
    public int compare(Employee e1, Employee e2)
    {
         return e1.getName().compareTo(e2.getName());
    }
}

class SortByAge implements Comparator<Employee>
{
    public int compare(Employee e1, Employee e2)
    {
         if(e1.getAge()>e2.getAge())
	 {
		return 1;
	 }
	 else if(e1.getAge()<e2.getAge())
	 {
		return -1;
	 }
	 else
	 {
		return 0;
	 }
    }
}
