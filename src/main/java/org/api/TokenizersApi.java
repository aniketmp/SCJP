package org.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TokenizersApi {
	public static void main(String[] args) {
		String srcRegEx[][]=new String[2][3];
		//                       Source       Regex    Message
		srcRegEx[0]=new String[]{"ab 34 true pq"  , " "  , "Tokenized with space as delimiter"}; 
		srcRegEx[1]=new String[]{"ab 34 true pq"  , "\\d"  , "Tokenized with any number as a delimiter"}; 
		
		System.out.println("=======================Tokanizing with string.split()===========================");
		for(int i=0;i<srcRegEx.length;i++)
		{
			System.out.println("\n\n------"+srcRegEx[i][2]+"-------------------------\n");			
			System.out.println("Source : "+srcRegEx[i][0]);
			System.out.println("RegEx : "+srcRegEx[i][1]);
			System.out.print("Tokens :"+Arrays.asList(srcRegEx[i][0].split(srcRegEx[i][1])));
			
		}
		/*One drawback to using the String.split() method is that often you'll want to look at token as they are produced,
		 *  and possibly quit a tokenization operation early when you've created the tokens you need. 
		 *  For instance, you might be searching a large file for a phone number. 
		 *  If the phone number occurs early in the file, you'd like to quit the tokenization process as soon 
		 *  as you've got your number. This is not possible in case of String.split(). 
		 *  The scanner class provides a rich API for doing just such on-the-fly tokenization operations.
		 * 
		 *There are some following advantages of using scanner.
		 *
		 * 1) Scanners can be constructed using files, streams, or strings as a source.
		 * 2)Tokenizing is performed within a loop so that you can exit the process at any point.
		 * 3)Tokens can be converted to their appropriate primitive types automatically.
		 */
		Scanner scanner=null;
		System.out.println("\n\n=======================Tokanizing with scanner=============================");
		for(int i=0;i<srcRegEx.length;i++)
		{
			System.out.println("\n\n------"+srcRegEx[i][2]+"-------------------------\n");			
			System.out.println("Source : "+srcRegEx[i][0]);
			System.out.println("RegEx : "+srcRegEx[i][1]);
			//1-Create the scanner from String source.It can be from streams or files as well.
			scanner=new Scanner(srcRegEx[i][0]);
			scanner.useDelimiter(srcRegEx[i][1]);//If we skip this line then scanner will use default delimiter as space
			List tokens=new ArrayList();
			//2-Tokenizing is performed within loop so that you can exit the process any time
			while(scanner.hasNext())
			{
				//3-Tokens can be converted to their appropriate primitive types automatically.
				if(scanner.hasNextBoolean())
				{
					break;
				}
				tokens.add(scanner.next());
			}
			System.out.print("Tokens :"+tokens);
		}
	}
	
}
 