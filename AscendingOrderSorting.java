package com.incubtasks;

import java.util.Scanner;

public class AscendingOrderSorting {
	public static void merge(int[] integerArray,int low,int middle,int high)
	
	{
		
		
		int i=low;
		int j=middle+1;
		int k=low;
		int resultArray[]=new int[high+1];
		while(i<=middle&&j<=high)
		{
			if(integerArray[i]<integerArray[j])
			{
				resultArray[k++]=integerArray[i++];
				
			}
			else
			{
				resultArray[k++]=integerArray[j++];
			}
		}
		while(i<=middle)
		{
			resultArray[k++]=integerArray[i++];
		}
		while(j<=high)
		{
			resultArray[k++]=integerArray[j++];
		}
		for(int p=low;p<=high;p++)
		{
			integerArray[p]=resultArray[p];
		}
		
	}
	public static void  mergeSort(int[] integerArray,int low,int high)
	{
		if(low<high)
		{
			int middle=(low+high)/2;
			mergeSort(integerArray,low,middle);
			mergeSort(integerArray, middle+1, high);
			merge(integerArray,low,middle,high);
		}
		
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
		
		mergeSort(integerArray,0,sizeOfArray-1);
		System.out.println("---The Given Array sorted in Ascending Order:---");
		for(int i=0;i<integerArray.length;i++)
		{
		System.out.print(integerArray[i]+" ");
		}

		}


}
