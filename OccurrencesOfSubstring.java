package com.incubtasks;
import java.util.Scanner;
public class OccurrencesOfSubstring {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the string:");
	String inputString=scan.nextLine();
	System.out.println("Enter the substring to be checked:");
	String subString=scan.nextLine();
	int inputStringLength=inputString.length();
	int subStringLength=subString.length();
	String result="";
		
	int flag=0;	
	for(int i=0;i<=inputStringLength-subStringLength;i++) 
	     {
		int j;   
        for(j=0;j<subStringLength;j++) 
        {
            if (inputString.charAt(i+j)!=subString.charAt(j))
            {
                break;
            }
        }
       
        if (j == subStringLength)
        {               
            flag++;               
            j = 0;               
        }           
    }       
	
	if(flag>0)
	{
		System.out.println("The number of times substring occured is "+ flag);
	}
	else
	{
		System.out.println("Substring not found");
	}
	
	
	
	
}
}
