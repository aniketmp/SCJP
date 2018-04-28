package org.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {		
		String srcRegEx[][]=new String[11][3];
		//                       Source       Regex    Message
		srcRegEx[0]=new String[]{"abaaaba"  , "ab"  , "To find exact match 'ab' in source"}; 
		srcRegEx[1]=new String[]{"ababab"   , "aba" , "To find 'aba' in source"};
		srcRegEx[2]=new String[]{"de3f67df" , "\\d" , "To find numeric digit"};
		srcRegEx[3]=new String[]{"de3f67df" , "\\D" , "To find non-digit i.e anything but 0-9"};
		srcRegEx[4]=new String[]{"df 4"     , "\\s" , "To find whitespace character"};
		srcRegEx[5]=new String[]{"df 4"     , "\\S" , "To find non-whitespace character"};
		srcRegEx[6]=new String[]{"a_3@d k"  , "\\w" , "To find word character (letters, digits and _ )"};
		srcRegEx[7]=new String[]{"a_3@d k"  , "\\W" , "To find non-word character"};
		//Assume that there is hidden non-word character at each end of the string.
		srcRegEx[8]=new String[]{"af $f"  , "\\b" , "To find word boundry (ends of the string and between \\w and not \\w)"};
		srcRegEx[9]=new String[]{"#ab de#"  , "\\b" , "Word boundry another example"};
		srcRegEx[9]=new String[]{"xabcyb"  , "[abc]" , "To search fix set of characters"};
		srcRegEx[10]=new String[]{"xabcyb"  , "[a-c]" , "To search range of characters"};
		srcRegEx[10]=new String[]{"xAbCyb"  , "[a-cA-C]" , "To search accross several ranges of characters at once"};
		srcRegEx[10]=new String[]{"Employee with id M303 is manager"  , "M[0-9][0-9][0-9]" , "To search using qualifiers (to extract some pattern from string for e.g 3 digit manager id prefix with 'M')"};
		
		
		System.out.print("Note : Indexes are 0 based. ");
		for(int i=0;i<srcRegEx.length;i++)
		{
			System.out.println("\n\n------"+srcRegEx[i][2]+"-------------------------\n");
			Pattern pattern = Pattern.compile(srcRegEx[i][1]);
			Matcher matcher = pattern.matcher(srcRegEx[i][0]);
			System.out.println("Source : "+srcRegEx[i][0]);
			System.out.println("RegEx : "+matcher.pattern());
			System.out.print("Start Index :");
			while(matcher.find())
			{
				//To find the index where matching character of given pattern starts.
				//Note:Regex search runs from left to right, and once a source's character has been used
				//in a match it cannot be reused.
				System.out.print(" "+matcher.start());
			}
		}
	}
}
