package com.incubtasks;

import java.util.Scanner;

class InvalidAgeException  extends RuntimeException  
{  
    public InvalidAgeException (String str)  
    {  
       super(str);
    }  
}  
    
public class Votevalidation
{  
  
   
    static void validate(int age)
    {    
       if(age<18)
       {         
        throw new InvalidAgeException("age is not valid to vote");        
       }  
       else 
       {   
        System.out.println("welcome to vote");   
        }   
     }    
  
    
    public static void main(String args[])  
    {  
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the age");
    	int age=scan.nextInt();
    	
        try  
        {      
        	validate(age);  
        }  
        catch (InvalidAgeException ex)  
        {  
                         
            ex.printStackTrace();  
        }  
  
          
    }  
}  
