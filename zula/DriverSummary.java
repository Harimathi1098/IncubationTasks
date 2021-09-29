package org.zulacabs.zulacabs;

import jakarta.ws.rs.Path;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DriverSummary {
	
	public ArrayList displayDriverDetails()
	{
		
		ArrayList al=new ArrayList();
		 String url="jdbc:mysql://localhost:3306/zula";
		   String username="root";
		   String password="Secret";
		 Connection con=null;			
		   ResultSet set=null;		
		Customer customer=null;
			try {
				con=DriverManager.getConnection(url,username,password);							
				Statement st=con.createStatement();
		
		    String sqlquery="select * from driver ;";
		    ResultSet set2=st.executeQuery(sqlquery);
			while(set2.next())
			{
				al.add(new Driver(set2.getInt("driver_id"),set2.getString("driver_name"),set2.getDouble("fare"),0.3*set2.getDouble("fare")));
			}
			}
catch (SQLException e) {
				
				e.printStackTrace();
				System.out.println("SQL Exception Caught");
			}
		return al;
	}
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
		
		    String sqlquery="select driver_id from driver where driver_name=\""+name+"\";";
			ResultSet set1=st.executeQuery(sqlquery);
			while(set1.next())
			{
				result=set1.getInt("driver_id");
			}
			}
catch (SQLException e) {
				
				e.printStackTrace();
				System.out.println("SQL Exception Caught");
			}
			return result;
	}
	
	public ArrayList displayDriverDetails(String name)
	{
		ArrayList driverlist=new ArrayList();
		
		   String url="jdbc:mysql://localhost:3306/zula";
			String username="root";
			String password="Secret";
		Connection con=null;			
		ResultSet set=null;
		int setlength=0;
		int did=0;
		int rides=0;
		Driver driver=null;
			try {
				con=DriverManager.getConnection(url,username,password);
							
				Statement st=con.createStatement();
		
			ResultSet set1=st.executeQuery("select * from driver;");
			
			
			while(set1.next())
			{
				if(set1.getString("driver_name").equals(name))
				{
					did=set1.getInt("driver_id");
					rides=set1.getInt("no_of_rides");
				}
			}
			
			ResultSet set2=st.executeQuery("select * from driver d,book_rides br where d.driver_id=br.driver_id order by pickup_time desc;");
			
				System.out.println("Driver id is :"+did);
				System.out.println("Driver name is :"+name);
				if(rides>0)
				{
				System.out.println("----------------------Trip Details--------------------");
				System.out.println("Source    Destination    CustomerDetails     Fare          ZulaCommission");
			while(set2.next()) 
			{
				if(set2.getInt("driver_id")==did)
				{
	 driver=new Driver(did,name,set2.getString("source"),set2.getString("Destination"),set2.getInt("Customer_id"),set2.getDouble("total_Fare"),set2.getDouble("zula_commission"),set2.getString("pickup_time"));
					
					
	 driverlist.add(driver);
					
				}
			}
			
				}
				else
					
				{
					System.out.println("No rides were given");
				}
			
			
		
		con.close();
			} 
			
			catch (SQLException e) {
				
				e.printStackTrace();
				System.out.println("SQL Exception Caught");
			}
			return driverlist;
	}
	
}
