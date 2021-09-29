package org.zulacabs.zulacabs;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerAuthentication extends Customer{
	
	public int cid(String name)
	{
		int result=0;
		   String url="jdbc:mysql://localhost:3306/zula";
		   String username="root";
		   String password="Secret";
		 Connection con=null;			
		   ResultSet set=null;		
		Customer customer=null;
			try {
				con=DriverManager.getConnection(url,username,password);							
				Statement st=con.createStatement();
		
		    String sqlquery="select customer_id from customer where customer_name=\""+name+"\";";
			ResultSet set1=st.executeQuery(sqlquery);
			while(set1.next())
			{
				result=set1.getInt("customer_id");
			}
			}
catch (SQLException e) {
				
				e.printStackTrace();
				System.out.println("SQL Exception Caught");
			}
			return result;
	}
	
	

	
	public Customer customerAuthentication(Customer customer) throws SQLException
	{
	 Customer cust=new Customer();
   int result=-1;
	String url="jdbc:mysql://localhost:3306/zula";
	String username="root";
	String password="Secret";
	Connection con=null;			
	ResultSet set1=null;
	int count=0;
	int setlength=0;
	
	int id=cid(customer.customername);
	cust.customerid=id;
	cust.customername=customer.customername;
	cust.customerpassword=customer.customerpassword;
		try {
			con=DriverManager.getConnection(url,username,password);
			
			
			Statement st=con.createStatement();

ResultSet set=st.executeQuery("select count(*) as count from customer where customer_name=\""+customer.customername +"\"and customer_password=\""+customer.customerpassword+"\";");
System.out.println("wow");		


		while(set.next())
		{
			count=set.getInt("count");
		}
		System.out.println("success");
		System.out.println("count is"+count);
				if(count>0)
				{
					cust.error=1;
				}
				else
				{
					cust.error=0;
				}


	con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("SQL Exception Caught");
		}
		
		
return cust;
	}

		
	}


