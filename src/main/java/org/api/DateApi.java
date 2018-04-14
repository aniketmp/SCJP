package org.api;

import java.util.Calendar;
import java.util.Date;

public class DateApi {
	public static void main(String[] args) {
		//To find out how long it took for a given milliseconds to pass starting at 'January 1, 1970
		Date d=new Date(1000000000000L);
		System.out.println("date is "+d);
		
		//To find number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
		Date now=new Date();
		System.out.println("Current milliseconds:"+now.getTime());
		
		//To get current month
		Calendar c=Calendar.getInstance();
		System.out.println("Current month:"+c.get(Calendar.MONTH));
		
		//To get current year
		System.out.println("Current year:"+c.get(Calendar.YEAR));

		//To get current day of month
		System.out.println("Current Day of month:"+c.get(Calendar.DAY_OF_MONTH));
			
		//To get current time
		System.out.println("Current time:"+c.get(Calendar.HOUR)+" hr "+c.get(Calendar.MINUTE)+" mins "+c.get(Calendar.SECOND)+" sec "+c.get(Calendar.MILLISECOND)+" msec");
		
		//To add a month
		c.add(Calendar.MONTH, 1);
		System.out.println("next month:"+c.get(Calendar.MONTH));
		
		//To add a month with add
		c.add(Calendar.MONTH, 8);
		System.out.println("year is :"+c.get(Calendar.YEAR)+" month:"+c.get(Calendar.MONTH));
		
		//To add a month with roll
		c.add(Calendar.MONTH, -8);//reverting previous effect
		c.roll(Calendar.MONTH, 8);
		System.out.println("year is :"+c.get(Calendar.YEAR)+" month:"+c.get(Calendar.MONTH));
		//Note: The difference between roll() method and add() method is roll() method acts like the add() method,
		//except  that when a part of a Date gets incremented or decremented, larger parts of the Date will not get incremented or decremented.
					
		//To subtract a year
		c.add(Calendar.YEAR, -1);
		System.out.println("previous year:"+c.get(Calendar.YEAR));
		
		
		
	}

}
