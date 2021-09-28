package org.zulacabs.zulacabs;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerAuthentication {
	String customername;
	String customerpassword;
	int customerid;
	String message="";
	
	public int getCustomerid() {
		return customerid;
	}


	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	int error=-1;
	public CustomerAuthentication()
	{
	}
	
	
		public CustomerAuthentication(CustomerAuthentication customer)
	
	{
		this.customername=customer.customername;
		this.customerpassword=customer.customerpassword;
	}
	 public void display(int i)
     {
   	  if(i==1)
   	  {
   		  this.message="Username or Password is required!!";
   		  
   	  }   	 
   	  else if(i==2)
   	  {
   		 this.message="Enter username and password!!";
   	  }
   	  else if(i==3) 
   	  {
   		  this.message="Invalid Credentials!! Enter a valid username and password!!!";
   	  }
   	  else if(i==4)
   	  {
   		  this.message="success";
   	  }
   	  
     }
	

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCustomerpassword() {
		return customerpassword;
	}

	public void setCustomerpassword(String customerpassword) {
		this.customerpassword = customerpassword;
	}

	
	public static int findLength(ResultSet set)
	{
		
		int length=0;
			try {
				while(set.next())
				{
					length++;
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		
		return length;
	}
	
	public  int customerAuthentication(CustomerAuthentication customerdetails) throws SQLException
	{
	 
   int result=-1;
	String url="jdbc:mysql://localhost:3306/zula";
	String username="root";
	String password="Secret";
	Connection con=null;			
	ResultSet set1=null;
	int count=0;
	int setlength=0;
	CustomerSummary su=new CustomerSummary();
	int id=su.cid(customerdetails.customername);
	customerid=id;
		try {
			con=DriverManager.getConnection(url,username,password);
			 String sqlquery="select customer_name , customer_password from customer;";
		
			Statement sta=con.createStatement();
			set1=sta.executeQuery(sqlquery);		
			setlength=findLength(set1);
			Statement st=con.createStatement();

		ResultSet set=st.executeQuery("select * from customer;");
		
		
				
		while(set.next()) {
			
			 if(customerdetails.customername.equals("")&&customerdetails.customerpassword.equals(""))
			{
				
				result=2;
				error=4;
				//this.loggedin=true;
				break;
				
			}
			 else if(customerdetails.customername.equals("")||customerdetails.customerpassword.equals(""))
			{
				
				result=1;
				error=1;
				//this.loggedin=true;
				break;
				
			}
			else if(set.getString("customer_Name").equals(customerdetails.customername)&&set.getString("customer_Password").equals(customerdetails.customerpassword))
			{
				error=3;
				result=4;
				//this.loggedin=true;
				break;
				
			}
			
			else
			{
				count++;
			}
		}			
		


	con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("SQL Exception Caught");
		}
		if(setlength==count)
		{
			error=2;
			result=3;
			
			
		}
		
		
return result;
	}

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}

	
	}


