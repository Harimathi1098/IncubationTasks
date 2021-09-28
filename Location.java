package org.zulacabs.zulacabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class Location {
	int driverid;
	String Location;
	public Location()
	{
		
	}
	public Location(int driverid,String Location)
	{
		this.driverid=driverid;
		this.Location=Location;
	}
	public ArrayList displayLocation()
	{
		System.out.println();
		System.out.println("---------------------TAXI BOOKING----------------------");
		System.out.println("The cab location are as follows");
		String url="jdbc:mysql://localhost:3306/zula";
		String username="root";
		String password="Secret";
		Connection con=null;		
		ArrayList locationdetails=new ArrayList();
		try {
			con=DriverManager.getConnection(url,username,password);
			 String sqlquery="select driver_id,location from driver;";
		
			Statement sta=con.createStatement();
			
			ResultSet set=sta.executeQuery(sqlquery);		
			System.out.println("Driver_id        Location");
			while(set.next())
			{
				locationdetails.add(new Location(set.getInt("driver_id"),set.getString("location")));
				
			}
		}
                   catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("SQL Exception Caught");
		}
		return locationdetails;
	}
	public int getDriverid() {
		return driverid;
	}
	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}

}
