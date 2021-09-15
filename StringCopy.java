package com.incubtasks;
import java.util.Scanner;
public class StringCopy {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the string to be copied :");
		String input=scan.nextLine();
		if(!input.equals(" "))
		{
		String resultString=input;
		input="string";
		System.out.println("The Copied String is :");
		System.out.println(resultString);
		}
		else
		{
			System.out.println("Enter a valid string");
		}
		
		/*String result="";
		
		for(char character:input.toCharArray())
		{
			result=result+character;
		}
       System.out.println(result);*/
	}

}
