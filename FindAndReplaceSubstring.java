package com.incubtasks;
import java.util.Scanner;
public class FindAndReplaceSubstring {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String:");
		String inputString=scan.nextLine();
		System.out.println("Enter the substring to be replaced");
		String substring=scan.nextLine();
		System.out.println("Enter the replacement string");
		String replacementString=scan.nextLine();
		String result="";
		String s[]=inputString.split(" ");
		
		
		for(String string:inputString.split(" "))
		{
			if(string.equals(substring)) 
			{
				result=result+replacementString;
				result=result+" ";
			}
			else
			{
				result=result+string;
			result=result+" ";
			}
		}
		System.out.println("The String after replacement is: "+result);
	}
	

}
