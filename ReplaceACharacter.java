package com.incubtasks;
import java.util.Scanner;
public class ReplaceACharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String inputString=sc.nextLine();
		System.out.println("Enter the character to be replaced:");
		char inputCharacter=sc.nextLine().charAt(0);
		System.out.println("Enter the replacement character ");
		char replacementCharacter=sc.nextLine().charAt(0);
		String result="";
		for(char character:inputString.toCharArray())
		{
			if(character==inputCharacter)
			{
				result=result+replacementCharacter;
			}
			else
			{
				result=result+character;
			}
		}
      System.out.println("The string after replacement :"+result);
	}

}
