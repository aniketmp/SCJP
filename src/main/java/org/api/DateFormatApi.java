package org.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatApi {
	public static void main(String[] args) {
		//Formatting date to string
		Date d=new Date();
		DateFormat[] df=new DateFormat[6];
		df[0]=DateFormat.getInstance();
		df[1]=DateFormat.getDateInstance();
		df[2]=DateFormat.getDateInstance(DateFormat.SHORT);
		df[3]=DateFormat.getDateInstance(DateFormat.MEDIUM);
		df[4]=DateFormat.getDateInstance(DateFormat.LONG);
		df[5]=DateFormat.getDateInstance(DateFormat.FULL);
		
		for(DateFormat dateFormat:df)
		{
			System.out.println(dateFormat.format(d));
		}
		
		//Parsing from string to date
		Date date=null;
		try {
			//String should be in one of the above format to be parsed by DateFormat
			date=DateFormat.getDateInstance().parse("April 14, 2018");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Date parsed successfully::"+df[1].format(date));
	}
}
