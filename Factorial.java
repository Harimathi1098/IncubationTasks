package com.incubtasks;
import java.util.Scanner;
import java.math.BigInteger;
public class Factorial {
	
	public static BigInteger generateFactorial(int number)
	{
		
		BigInteger result=new BigInteger("1");
		for(int i=2;i<=number;i++)
		{
			result=result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number for which factorial is to be found :");
	int number=sc.nextInt();
	BigInteger bi=new BigInteger("1");
	if(number>=0)
	{
	
	BigInteger factorial=generateFactorial(number);
	System.out.println("Factorial of the given number is: "+factorial);
	}
	else
	{
		System.out.println("Enter a valid number.");
	}
	
}
}
