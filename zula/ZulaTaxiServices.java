package org.zulacabs.zulacabs;

import java.sql.SQLException;
import java.util.Scanner;

public class ZulaTaxiServices {
	
	static Scanner sc=new Scanner(System.in);			
	
	public static void getChoice(int option) throws SQLException
	   {
	    
	    int choice =option;
	    switch(choice)
	    	{
	    		  
	    	case 1:
	    		 System.out.println("-------------NEW CUSTOMER REGISTRATION-----------");
	    		 System.out.println("Enter your name");
	    		 String name=sc.next();
	    		 System.out.println("Enter your password");
	    		 String pass=sc.next();
	    		 System.out.println("Enter your age");
	    		 int age=sc.nextInt();
	    		 CustomerRegistration register=new CustomerRegistration();
	    		// register.customerRegistration(name,pass,age);		    		
	    		 //System.out.println("Registration Successfull");    		
	    		 
	    		 
	    	}
	    	
	    }
	  
	public static void getChoice() throws SQLException
	   {
	    System.out.println("------------------CUSTOMER PORTAL----------------");
	    System.out.println("For Existing Customer -> press 1.");
	    System.out.println("For new Customer -> press 2.");
	    int choice =sc.nextInt();
	    switch(choice)
	    	{
	    	case 1:
	    		CustomerAuthentication authenticate=new CustomerAuthentication();
	    		authenticate.customerAuthentication();
	    		break;
	  
	    	case 2:
	    		 System.out.println("------NEW CUSTOMER REGISTRATION----");
	    		 System.out.println("Enter your name");
	    		 String name=sc.next();
	    		 System.out.println("Enter your password");
	    		 String pass=sc.next();
	    		 System.out.println("Enter your age");
	    		 int age=sc.nextInt();
	    		 CustomerRegistration register=new CustomerRegistration();
	    		 //register.customerRegistration(name,pass,age);		    		
	    		 System.out.println("Registration Successfull!!!!!!!!!");    	
	    		 System.out.println("Login with the credentials for booking a taxi");
	    		 
	    		 
	    	}
	    	
	    }
	
	   
		public static void displayLocation() throws SQLException
		{			
			getServices();
		}
		public static void getServices() throws SQLException
		{
			
			System.out.println("-----------------WELCOME TO ZULA------------------");
			System.out.println("1.Cab driver login");
			System.out.println("2.Customer login");
			System.out.println("3.Administrator login");
			System.out.println("4.Quit");
			System.out.println("Please choose a service");
			int choice =sc.nextInt();
			switch(choice)
			{
			case 1:
				DriverAuthentication authenticate=new DriverAuthentication();
				authenticate.driverAuthentication();
				getServices();
				break;
	        case 2:
	           	getChoice();
				getServices();
				break;			
	        case 3:
				ZulaAdministartion show= new ZulaAdministartion();
				//show.showAdminDetails();
				break;
	        case 4:
	        	return;
			
			}
		}
		
	public static void main(String[] args) throws SQLException
	{
		
		getServices();
		ZulaTaxiServices zulaservices=new ZulaTaxiServices();
	}

}
