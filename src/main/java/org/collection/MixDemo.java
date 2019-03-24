package org.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MixDemo
{
    public static void main(String[] args)
    {
    	List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add( new Employee("Tim", 23) );
        employeeList.add( new Employee("Rolvin", 11) );
        employeeList.add( new Employee("Gerald", 32) );
        System.out.println("Sort by default comparable");
        Collections.sort(employeeList);//sort by default comparable;
        System.out.println(employeeList);
        System.out.println("Sort by name");
        Collections.sort(employeeList, new SortByName() );//sort by name;
    	System.out.println(employeeList);
    	System.out.println("sort by age");
        Collections.sort(employeeList, new SortByAge() );//sort by age;        
    	System.out.println(employeeList);       
     
    }
}