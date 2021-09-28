package org.zulacabs.zulacabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerSummary {
	
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
	public ArrayList displayCustomerDetails(String name)
	{
		ArrayList customerlist=new ArrayList();
		
		   String url="jdbc:mysql://localhost:3306/zula";
			String username="root";
			String password="Secret";
		   Connection con=null;			
		   ResultSet set=null;		
		Customer customer=null;
			try {
				con=DriverManager.getConnection(url,username,password);							
				Statement st=con.createStatement();
		
		    String sqlquery="select * from book_rides b join customer c on c.customer_id=b.customer_id where customer_name='"+name+"'"+ ";";
			ResultSet set1=st.executeQuery(sqlquery);
			
			
			
			while(set1.next()) 
			{
				customer=new Customer(set1.getInt("customer_id"),name,set1.getString("source"),set1.getString("Destination"),set1.getInt("Driver_id"),set1.getDouble("total_Fare"));
					
				customerlist.add(customer);
			}
				
				
			
		
		con.close();
			} 
			
			catch (SQLException e) {
				
				e.printStackTrace();
				System.out.println("SQL Exception Caught");
			}
			return customerlist;
	}
	public void showCustomerDetails(String name)
	{
		   String url="jdbc:mysql://localhost:3306/zula";
			String username="root";
			String password="Secret";
		Connection con=null;			
		ResultSet set=null;
		int setlength=0;
		int cid=0;
			try {
				con=DriverManager.getConnection(url,username,password);
							
				Statement st=con.createStatement();
		
			ResultSet set1=st.executeQuery("select * from customer;");
			
			
			while(set1.next())
			{
				if(set1.getString("customer_name").equals(name))
				{
					cid=set1.getInt("Customer_id");
				}
			}
			ResultSet set2=st.executeQuery("Select * from book_rides;");
			
				System.out.println("Customer id is :"+cid);
				System.out.println("Customer name is :"+name);
				System.out.println("----------------Trip Details----------------");
				System.out.println("Source    Destination    CabDetails    Fare");
			while(set2.next())
			{
				if(set2.getInt("Customer_id")==cid)
				{
					System.out.println(set2.getString("source")+"         "+set2.getString("Destination")+"                "+
				set2.getInt("driver_id")+"           "+set2.getDouble("Total_Fare"));
				}
			}
			
		System.out.println("-------------Have a great day!!!!!------------------");
			
		
		con.close();
			} 
			
			catch (SQLException e) {
				
				e.printStackTrace();
				System.out.println("SQL Exception Caught");
			}
	}

}
