package com.incubtasks;
import java.util.Scanner;
public class FibonacciSeries {
	public static int[] generateFibonacciSeries(int number,int firstTerm)
	{
		int fibonaccciSeriesArray[]=new int[number];
		fibonaccciSeriesArray[0]=firstTerm;
		fibonaccciSeriesArray[1]=1;
		for(int i=2;i<fibonaccciSeriesArray.length;i++)
		{
			fibonaccciSeriesArray[i]=fibonaccciSeriesArray[i-1]+fibonaccciSeriesArray[i-2];
		}
		return fibonaccciSeriesArray;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number for which fibonacci series need to be printed:");
		int number=scan.nextInt();
		if(number>0) {	
			System.out.println("Enter the first term for fibonacci number");
			int firstTerm=scan.nextInt();
		int fibonacciSeriesArray[]=generateFibonacciSeries(number,firstTerm);
		System.out.println("----The Fibonacci Series for the given number----");
		for(int i=0;i<fibonacciSeriesArray.length;i++)
		{
		System.out.print(fibonacciSeriesArray[i]+" ");
		}
		}
		else
		{
			System.out.println("Enter a valid number");
		}
	}

}
