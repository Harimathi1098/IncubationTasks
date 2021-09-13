package com.incubtasks;

import java.util.Scanner;

public class Palindrome {

	public static boolean checkPalindrome(String s)
	{
		int begin=0;
		int end=s.length()-1;
		while(begin<end)
		{
			char a=s.charAt(begin);
			char b=s.charAt(end);
			/*if(a<97)
			{
				a=(char)(a+32);
			}
			else if(b<97)
			{
				b=(char)(b+32);
			}*/
				
			
			if(a!=b)
			{
				return false;
			}
			begin++;
			end--;
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string to be checked");
		String input=scan.nextLine();
		if(!(input.equals(" ")||input.equals(""))) {
		boolean result=checkPalindrome(input);
		if(result==false) {
			System.out.println("The Given String is Not a palindrome");
		}
		else
		{
			System.out.println("The Given String is a Palindrome");
		}}

		else
		{
			System.out.println("Enter a valid string");
		}
	}
}
