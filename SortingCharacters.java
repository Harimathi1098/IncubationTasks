package com.incubtasks;
import java.util.Scanner;
import java.util.regex.*;
public class SortingCharacters {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the string to be sorted :");
		String input=scan.nextLine();
	if(!(input.equals(" ")))
	{
		int hashTable[]=new int[27];
		
		for(char characters:input.toCharArray())
		{
			hashTable[characters-'a']++;
		}
		System.out.println("The String after Sorting is:");
		for(int i=0;i<27;i++)
		{
			for(int j=0;j<hashTable[i];j++)
			{
			      System.out.print((char)(i+'a'));
			}
		}
			}
	else
	{
		System.out.println("Enter a valid input");
	}
	
	}
	
	
