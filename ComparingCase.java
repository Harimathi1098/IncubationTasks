package com.incubtasks;
import java.util.Scanner;
public class ComparingCase {
	public static String checkForEqualStrings(String string1,String string2)
	{
		String result="";
		if(string1.equals(string2))
    	{
    		result="The two strings are equal";
    	}
    	else
    	{
			result="The two strings aren't equal";
		}
		return result;
	}
	public static String convertToLowerCase(String input)
	{
		String string1="";
    	for(char character:input.toCharArray())
    	{
    		if(character<97)
    		{
    			character=(char)(character+32);
    			string1=string1+character;
    		}
    		else
    		{
    			string1=string1+character;
    		}
    	}
    	return string1;
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first string:");
		String input1=scan.nextLine();		
		System.out.println("Enter the second string:");
	    String input2=scan.nextLine();
	    String string1="";
	    String string2="";
	    	    
	    	string1=convertToLowerCase(input1);
	    	string2=convertToLowerCase(input2);
	    	System.out.println("With Ignoring the Case");
	    	System.out.println(checkForEqualStrings(string1, string2));
		
	    	System.out.println("Without Ignoring the Case");
	    	System.out.println(checkForEqualStrings(input1, input2));
	    	
	    }
	    
		}
		
	

