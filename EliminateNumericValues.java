package com.incubtasks;
import java.util.Scanner;
public class EliminateNumericValues {
	public  static boolean isDigit(char a)
	{
			
			if(a>='0'&&a<='9')
			{
				return true;			
				}
		
		return false;
	}
	public static String eliminateNumericValues(String input)
	{
		
			String result="";
			for(char character:input.toCharArray())
			{
				if(!isDigit(character))
				{
					result=result+character;
				}
			}
		
		/*for(char ch:s.toCharArray())
		{
			if(ch>=48&&ch<=57)
			{
				result=result+"";
			}
			else
			{
				result=result+ch;
			}
			
		}*/
		return result;
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the string:");
		String inputString=scan.nextLine();
		System.out.println("The string after eliminating numbers: "+eliminateNumericValues(inputString));
	}

}
