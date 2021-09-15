package com.incubtasks;
import java.util.Scanner;
public class BiggestNumber {

	public static int findBiggestNumber(int[] integerArray)
	{
		int biggestNumber=integerArray[0];
		for(int i=1;i<integerArray.length;i++)		
		{
			if(integerArray[i]>biggestNumber)
			{
				biggestNumber=integerArray[i];			
			}		
		}
		return biggestNumber;
	}
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the array: ");
	int sizeOfArray=scan.nextInt();
	int integerArray[]=new int[sizeOfArray];
	System.out.println("---Enter the array elements one by one---");
	for(int i=0;i<integerArray.length;i++)		
	{
		integerArray[i]=scan.nextInt();
	}
	
	int result=findBiggestNumber(integerArray);
	System.out.println("The biggest number in the given array is: "+ result);

	}

}
