package org.api;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class NumberFormatApi {
	public static void main(String[] args) {
		Locale l=new Locale("en","IN");
		//Formatting date to string
		Float f=342818.3984f;
		Object nf[][]=new Object[6][6];
		
		nf[0][0]="Get instance:";
		nf[0][1]=NumberFormat.getInstance();
		nf[1][0]="Get instance with locale:";
		nf[1][1]=NumberFormat.getInstance(l);
		nf[2][0]="Number format instance:";
		nf[2][1]=NumberFormat.getNumberInstance();
		nf[3][0]="Number format instance with locale:";
		nf[3][1]=NumberFormat.getNumberInstance(l);
		nf[4][0]="Currency instance:";
		nf[4][1]=NumberFormat.getCurrencyInstance();
		nf[5][0]="Currency instance with locale:";
		nf[5][1]=NumberFormat.getCurrencyInstance(l);
		
		
		for(int i=0;i<nf.length;i++)
		{
			System.out.println(nf[i][0]+" "+((NumberFormat)nf[i][1]).format(f));
		}
		
		System.out.println("--------------------------");
		String fStr="84783.4455f";
	
		NumberFormat nformat=NumberFormat.getInstance();
		try {
			System.out.println(nformat.parse(fStr));
			nformat.setParseIntegerOnly(true);
			System.out.println(nformat.parse(fStr));
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
