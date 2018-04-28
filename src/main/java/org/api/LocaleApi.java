package org.api;

import java.util.Locale;

public class LocaleApi {
	public static void main(String[] args) {
		Locale l=Locale.getDefault();
		display(l);
		l=new Locale("no","NO","WIN");
		display(l);
		l=Locale.FRANCE;
		display(l);
		
	}

	private static void display(Locale l) {
		System.out.println("-----------------------------------");
		System.out.println("Locale:"+l);
		System.out.println("-----------------------------------");
		System.out.println("Language:"+l.getLanguage());
		System.out.println("Country:"+l.getCountry());
		System.out.println("Varient:"+l.getVariant());
		System.out.println("-----------------------------------");		
		System.out.println("Display Language:"+l.getDisplayLanguage());
		System.out.println("Display Country:"+l.getDisplayCountry());
		System.out.println("Display Varient:"+l.getDisplayVariant());
	}
}
