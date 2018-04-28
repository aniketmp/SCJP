package org.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGroup {
	/*Sometimes getting the starting position is not sufficient.We also need to find out the group in case 
	 * when expression search 'one or more' occurrence. 
	 */
	public static void main(String[] args) {		
		String srcRegEx[][]=new String[12][3];
		//                               Source       Regex    Message
		srcRegEx[0]=new String[]{"ad1 dfdf34 bc3c"  , "\\d"  , "To find the numeric digit."}; 
		srcRegEx[1]=new String[]{"ad1 dfdf34 bc3c"  , "\\d+"  , "To find the one or more occurance of numeric digit character."};
		srcRegEx[2]=new String[]{"Employee with id M303 is manager"  , "M[0-90-90-9]" , "Example 1:To search using qualifiers (to extract some pattern from string for e.g 3 digit manager id prefix with 'M').\n Unexpected result since 0-9 is not seperated by [] which means it will be treated as OR operator."};
		srcRegEx[3]=new String[]{"Employee with id M303 is manager"  , "M[0-9][0-9][0-9]" , "Example 2:Pattern corrected"};
		srcRegEx[4]=new String[]{"Employee with id M303 is manager"  , "M([0-9])+" , "Example 3:Pattern further modified using '+' operator (one or more occurance)."};
		srcRegEx[5]=new String[]{"M %@ MF%@ and  M303 is manager"  , "M..." , "Example 4:Pattern to search anything start with M and followed by anyting upto 3 character indicated by 3 '.' operator"};
		//TODO:Get correct expression.
		srcRegEx[6]=new String[]{"The file name is myfile.pdf or myfile or myfile.txt", "(myfile\\.)+" , "To search myfle with any extension"};		
		
		/*Note:Greedy quantifier (Default)
		By default, quantifiers are Greedy. Greedy quantifiers try to match the longest text that matches given pattern. 
		Greedy quantifiers work by first reading the entire string before trying any match. 
		If the entire text doesn’t match, remove last character and try again, repeating the process until a 
		match is found.*/
		
		srcRegEx[7]=new String[]{"gggg", "g*" , "Zero or more occurance of 'g'"};
		srcRegEx[8]=new String[]{"gggg", "g?" , "Zero or one occurance of 'g'"};
		srcRegEx[9]=new String[]{"gggg", "g+" , "One or more occurance of 'g'"};
		srcRegEx[10]=new String[]{"gggg", "g{2}" , "Exactly 2 occurance of 'g'"};
		
		/*Reluctant quantifier (Appending a ? after quantifier)
		This quantifier uses the approach that is opposite of greedy quantifiers. 
		It starts from first character and processes one character at a time.*/
		
		srcRegEx[11]=new String[]{"gggg", "g+?" , "One or more occurance of 'g' with Reluctant qualifier"};
		
		System.out.print("Note : Indexes are 0 based. ");
		for(int i=0;i<srcRegEx.length;i++)
		{
			System.out.println("\n\n------"+srcRegEx[i][2]+"-------------------------\n");
			Pattern pattern = Pattern.compile(srcRegEx[i][1]);
			Matcher matcher = pattern.matcher(srcRegEx[i][0]);
			System.out.println("Source : "+srcRegEx[i][0]);
			System.out.println("RegEx : "+matcher.pattern());
			
			while(matcher.find())
			{
				//To find the index where matching character of given pattern starts.
				//Note:Regex search runs from left to right, and once a source's character has been used
				//in a match it cannot be reused.
				System.out.println("Start Index : "+matcher.start()+" Group : "+matcher.group());
			}
		}
	}
}
