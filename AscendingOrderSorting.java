package com.incubtasks;

import java.util.Scanner;

public class AscendingOrderSorting {
	public static int[] swap(int[] integerArray,int i,int j)
	
	{
		int temporaryVariable=integerArray[i];
		integerArray[i]=integerArray[j];
		integerArray[j]=temporaryVariable;
		return integerArray;
	}
	public static int[] sortInAscendingOrder(int[] integerArray)
	{
		for(int i=0;i<integerArray.length;i++)
		{
			for(int j=0;j<integerArray.length-1;j++)
			{
				if(integerArray[j]>integerArray[j+1])
				{
					swap(integerArray,j,j+1);
				}
			}
		}
		return integerArray;
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
		
		int sortedArray[]=sortInAscendingOrder(integerArray);
		System.out.println("---The Given Array sorted in Ascending Order:---");
		for(int i=0;i<integerArray.length;i++)
		{
		System.out.print(sortedArray[i]+" ");
		}

		}


}
