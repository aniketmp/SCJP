package org.collection;
import java.util.*;
public class ComparableDemo
{
    public static void main(String[] args)
    {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Tim", 23));
        employeeList.add(new Employee("Rolvin",11));
        employeeList.add(new Employee("Gerald",12));
        System.out.println("Before sort");
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println("After sort");
        System.out.println(employeeList);
     
    }
}
