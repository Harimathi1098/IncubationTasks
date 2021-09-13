package com.incubtasks;
import java.util.Scanner;
public class Factorial {
	public static int generateFactorial(int number)
	{
		int factorialArray[]=new int[number+1];
		factorialArray[0]=1;
		for(int i=1;i<=number;i++)
		{
			factorialArray[i]=i*factorialArray[i-1];
		}
		return factorialArray[number];
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number for which factorial is to be found :");
	int number=sc.nextInt();
	if(number>=0)
	{
	
	int factorial=generateFactorial(number);
	System.out.println("Factorial of the given number is: "+factorial);
	}
	else
	{
		System.out.println("Enter a valid number.");
	}
	
}
}
