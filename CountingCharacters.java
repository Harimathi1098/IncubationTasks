package com.incubtasks;
import java.util.Scanner;
public class CountingCharacters {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the string for counting characters");
	String input=scan.nextLine();
	if(!input.equals(" "))
	{
	int noOfDigits=0;
	int noOfUpperCaseCharacters=0;
	int noOfLowerCaseCharacters=0;
	int noOfSpecialCharacters=0;
	
	for(char character:input.toCharArray())
	{
		if(character>48&&character<57)
		{
			noOfDigits++;
		}
		else if(character>=65&&character<=90)
		{
			noOfUpperCaseCharacters++;
		}
		else if(character>=97&&character<=122)
		{
			noOfLowerCaseCharacters++;
		}
		else
		{
			noOfSpecialCharacters++;
		}
	}
	
	System.out.println("Number of Digits in the string: "+ noOfDigits);
	System.out.println("Number of UpperCase characters in the string: "+ noOfUpperCaseCharacters);
	System.out.println("Number of LowerCase characters in the string: "+ noOfLowerCaseCharacters);
	System.out.println("Number of Special characters in the string: "+ noOfSpecialCharacters);
	}
	else
	{
		System.out.println("Enter a valid string");
	}
	
}
}
