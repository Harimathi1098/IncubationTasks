package com.incubtasks;
import java.util.Scanner;

public class SplitAStringWithDelimeter {
    Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString=scan.nextLine();
		System.out.println("Enter the delimeter");
		String delimeter=scan.nextLine();
		
		System.out.println("The String splitted with delimeter");
		for(String string:inputString.split(delimeter))
		{
			System.out.println(string);
		}

	}

}
