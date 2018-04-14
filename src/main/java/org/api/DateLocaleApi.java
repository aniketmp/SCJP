package org.api;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateLocaleApi {
	static int YEAR=2018;
	static int MONTH=3;//Zero based month
	static int DATE=14;
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		c.set(YEAR, MONTH, DATE);
		//convert Calendar to Date
		Date d=c.getTime();
		DateFormat f=DateFormat.getDateInstance(DateFormat.MEDIUM);		
		System.out.println(f.format(d));
		
		//Local objects represent geographical, political or cultural region
		Locale english_in_india=new Locale("en","IN");//(language,country)
		Locale norwegian_in_norway=new Locale("no","NO");//(language,country)
		
		c=Calendar.getInstance();
		c.set(YEAR, MONTH, DATE);
		//convert Calendar to Date
		d=c.getTime();		
		
		//Create DateFormat with DateFormat and Locale instance.
		f=DateFormat.getDateInstance(DateFormat.MEDIUM,english_in_india);
		//There are some methods on Locals which helps in getting language and country of that Locale.
		System.out.println("Language:"+english_in_india.getDisplayLanguage()+"    Country:"+english_in_india.getDisplayCountry()+"    Format:"+f.format(d));
		f=DateFormat.getDateInstance(DateFormat.MEDIUM,norwegian_in_norway);
		System.out.println("Language:"+norwegian_in_norway.getDisplayLanguage()+"    Country:"+norwegian_in_norway.getDisplayCountry()+"    Format:"+f.format(d));
	}
}
