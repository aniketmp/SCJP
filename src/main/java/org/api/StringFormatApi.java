package org.api;

public class StringFormatApi {

	public static void main(String[] args) {
		//Note:The format() and printf() methods behave exactly the same way. The rumor is that printf() 
		//was added just to make old C programmers happy.
		
		System.out.println("\nformat string arguments: %[art_index$][flag][width][.precision][conversion char]");
		
		System.out.println("\n========================Using conversion character only:  %conversion char ===========================\n");
		System.out.println("Formating 'abc' as a string and '45' as a number:");
		System.out.printf("%s %d","abc",45);
		System.out.println("\n\nFormating 'abc' as a string and '45' as a string");
		System.out.printf("%s %s","abc",45);
		System.out.println("\n\nFormating 'abc' as a number and '45' as a number");
		try
		{
			System.out.printf("%d %d","abc",45);
		}
		catch(Exception e)
		{
			System.out.println(e );
		}
		System.out.println("\n========================Using conversion character with arg_index:  %[arg_index$][conversion char] ===========================");
		System.out.println("\n\nFormating 'abc' and '45' in reverse order");
		System.out.printf("%2$s %1$s","abc",45);		
		System.out.println("\n\nPrinting 'abc' and '45' in different order");
		try
		{
			System.out.printf("%3$s %2$s","abc",45);
		}
		catch(Exception e)
		{
			System.out.println(e );
		}
		System.out.println("\n\n========================Using conversion character ,arg_index and width:  %[arg_index$][width][conversion char] ===========================");
		System.out.println("\nFormating 'abc' and '45' in reverse order which takes 5 space character width (with right-justify and space as a padding character by default).");
		System.out.printf("%2$5s %1$5s\n","abc",45);
		
		System.out.println("\n\n========================Using conversion character ,arg_index , width and flag:  %[arg_index$][flag][width][conversion char] ===========================");
		System.out.println("\nFormating 'abc' and '45' in reverse order which takes 5 space character width with left-justify");
		System.out.printf("%2$-5s %1$-5s","abc",45);
		
		System.out.println("\n\n========================Using conversion character ,arg_index , width with precision:  %[arg_index$][width][.precision][conversion char] ===========================");
		System.out.println("\nFormating 'abc' as a string and '45.678' as a string in reverse order which takes 5 space character width with 2 precision");
		System.out.printf("%2$5.2s %1$5.2s","abc",45.678);
		System.out.println("\n\nFormating 'abc' as a string and '45.678' as a float in reverse order which takes 5 space character width with 2 precision");
		System.out.printf("%2$5.2f %1$5.2s","abc",45.678);
		
		System.out.println("\n\n========================Using conversion character ,arg_index ,flag, width with precision:  %[arg_index$][flag][width][.precision][conversion char] ===========================");
		System.out.println("\nFormating 'abc' as a string and '45.678' as a float in reverse order which takes 5 space character width with 2 precision and left justify flag");
		System.out.printf("%2$-5.2f %1$-5.2s","abc",45.678);
		
		
	}

}
