package com.incubtasks;
import java.util.Scanner;
public class RemovingASubstring {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString=scan.nextLine();
		System.out.println("Enter the substring to be removed");
		String subString=scan.nextLine();
		String result="";
		for(String string:inputString.split(" "))
		{
			if(!string.equals(subString))
			{
			  result=result+string;	
			  result=result+" ";
			}
			
		}
		System.out.println("The String after removal of substring is: "+result);
	}

}
