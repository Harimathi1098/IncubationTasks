package org.zulacabs.zulacabs;

import java.util.HashMap;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookTaxi {
	String pickuppoint;
	String droppoint;
	int driveid;
	double totalfare;
	int message=-1;
	public int getMessage() {
		return message;
	}
	public void setMessage(int message) {
		this.message = message;
	}
	BookTaxi()
	{
		
	}
	public String getPickuppoint() {
		return pickuppoint;
	}
	public void setPickuppoint(String pickuppoint) {
		this.pickuppoint = pickuppoint;
	}
	public String getDroppoint() {
		return droppoint;
	}
	public void setDroppoint(String droppoint) {
		this.droppoint = droppoint;
	}
	public BookTaxi(String pickuppoint, String droppoint) {
		super();
		this.pickuppoint = pickuppoint;
		this.droppoint = droppoint;
	}
	static int driverid=0;
	public HashMap displayLocation()
	{
		System.out.println();
		System.out.println("---------------------TAXI BOOKING----------------------");
		System.out.println("The cab location are as follows");
		String url="jdbc:mysql://localhost:3306/zula";
		String username="root";
		String password="Secret";
		Connection con=null;		
		HashMap locationdetails=new HashMap();
		try {
			con=DriverManager.getConnection(url,username,password);
			 String sqlquery="select driver_id,location from driver;";
		
			Statement sta=con.createStatement();
			
			ResultSet set=sta.executeQuery(sqlquery);		
			System.out.println("Driver_id        Location");
			while(set.next())
			{
				locationdetails.put(set.getInt("driver_id"),set.getString("location"));
				
			}
		}
                   catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("SQL Exception Caught");
		}
		return locationdetails;
	}
	public static boolean checkLocation(char location)
	{
		if(location>='A'&&location<='H')
		{
			return true;
		}
		else
			return false;
	}
	public BookTaxi getFare(BookTaxi book)
	{
		BookTaxi boo=new BookTaxi();
		String url="jdbc:mysql://localhost:3306/zula";
		String username="root";
		String password="Secret";
		Connection con=null;			
		ResultSet set=null;
		ResultSet set1=null;
		int value1=0;
		int value2=0;
		int cid=0;
		int did=0;		
		int noofrides=0;
		double fare=0;
		double zulacommission=0;
		
		String pp=book.pickuppoint;
		String dp=book.droppoint;
		try {
			con=DriverManager.getConnection(url,username,password);
			 String sqlquery="select customer_name,customer_id from customer;";
		
			Statement sta=con.createStatement();
			
			set=sta.executeQuery(sqlquery);		
			
			/*while(set.next())
			{
				if(set.getString("Customer_Name").contentEquals(name))
				{
					cid=set.getInt("Customer_id");
				}
			}*/
		}
                   catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("SQL Exception Caught");
		}
		
		try {
			con=DriverManager.getConnection(url,username,password);
			 String sqlquery="select * from locations;";
		
			Statement sta=con.createStatement();
			
			set=sta.executeQuery(sqlquery);		
			
			while(set.next())
			{
				if(set.getString("location").equals(pp))
				{
					value1=set.getInt("val");
				}
				if(set.getString("location").equals(dp))
				{
					value2=set.getInt("val");
				}
				
			}
			
			fare=Math.abs(value1-value2)*10;
			boo.pickuppoint=pp;
			boo.droppoint=dp;
			boo.totalfare=fare;
			boo.message=2;
			}
		catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("SQL Exception Caught");
		}
		return boo;
	}
	public int getDriveid() {
		return driveid;
	}
	public void setDriveid(int driveid) {
		this.driveid = driveid;
	}
	public double getTotalfare() {
		return totalfare;
	}
	public void setTotalfare(double totalfare) {
		this.totalfare = totalfare;
	}
	public static int getDriverid() {
		return driverid;
	}
	public static void setDriverid(int driverid) {
		BookTaxi.driverid = driverid;
	}
	public BookTaxi bookTaxi(String name,BookTaxi book)
	{
		BookTaxi boook=new BookTaxi();
		String result1="Not Booked";
		displayLocation();
		Scanner scan=new Scanner(System.in);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("------------------ZULA TAXI REGISTRATION DETAILS------------------ ");
		System.out.println("Ride Fare = 10 RS per km.");
		System.out.println("The Taxi available locations are from location A to location H.");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Enter the pickup point:");
		
		{
		String url="jdbc:mysql://localhost:3306/zula";
		String username="root";
		String password="Secret";
		Connection con=null;			
		ResultSet set=null;
		ResultSet set1=null;
		int value1=0;
		int value2=0;
		int cid=0;
		int did=0;		
		int noofrides=0;
		double fare=0;
		double zulacommission=0;
		
		String pp=book.pickuppoint;
		String dp=book.droppoint;
		try {
			con=DriverManager.getConnection(url,username,password);
			 String sqlquery="select customer_name,customer_id from customer;";
		
			Statement sta=con.createStatement();
			
			set=sta.executeQuery(sqlquery);		
			
			while(set.next())
			{
				if(set.getString("Customer_Name").contentEquals(name))
				{
					cid=set.getInt("Customer_id");
				}
			}
		}
                   catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("SQL Exception Caught");
		}
		
		try {
			con=DriverManager.getConnection(url,username,password);
			 String sqlquery="select * from locations;";
		
			Statement sta=con.createStatement();
			
			set=sta.executeQuery(sqlquery);		
			
			while(set.next())
			{
				if(set.getString("location").equals(pp))
				{
					value1=set.getInt("val");
				}
				if(set.getString("location").equals(dp))
				{
					value2=set.getInt("val");
				}
				
			}
			String sqlquery1="select d.no_of_rides,d.driver_id,d.location,l.val from driver d join locations l on d.location=l.location;";
			
			Statement stat=con.createStatement();
			
			set1=sta.executeQuery(sqlquery1);	
			
			int min=100;
			
			while(set1.next())
			{
				if(set1.getInt("driver_id")!=driverid)
				{
				if(Math.abs(set1.getInt("val")-value1)<min)
                    {
                         min=Math.abs(set1.getInt("val")-value1);
                         did=set1.getInt("driver_id");
                         noofrides=set1.getInt("No_of_rides");
                    }
				if(Math.abs(Math.abs(set1.getInt("val")-value1))==min)
				{
					if(set1.getInt("No_of_rides")<noofrides)
					{
						did=set1.getInt("driver_id");
					}
				}
				}	}
			driverid=did;
			fare=Math.abs(value1-value2)*10;
			zulacommission=fare*0.3;
			result1="Booked";
			boook.totalfare=fare;
			boook.driveid=did;
					boook.pickuppoint=book.pickuppoint;
					boook.droppoint=book.droppoint;
					
		}
		catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("SQL Exception Caught");
		}
	
		
			System.out.println("Total Ride Fare is"+ fare);
			System.out.println("driver with id "+did +" is allocated");
			System.out.println("Thanks for choosing zula application!! Have a safe ride!!");
			
		try {
				Connection con6=DriverManager.getConnection(url,username,password);			
				
		        String customersql="insert into book_rides(customer_id,driver_id,source,destination,Total_fare,zula_commission)values(?,?,?,?,?,?)";
				PreparedStatement customerstatement=con.prepareStatement(customersql);
					
				customerstatement.setInt(1, cid);
				customerstatement.setInt(2, did);
				customerstatement.setString(3,pp);	
				customerstatement.setString(4, dp);	
				customerstatement.setDouble(5, fare);	
				customerstatement.setDouble(6, zulacommission);	
				
				customerstatement.execute();
				//con6.close();
				
				//Connection driverconnection=DriverManager.getConnection(url,username,password);
				//Connection c=DriverManager.getConnection(url,username,password);
				Statement statement=con6.createStatement();
				ResultSet result=statement.executeQuery("Select driver_id,no_of_rides,total_earnings,fare from driver");
				String driversql="update driver set location=?,no_of_rides=?,total_earnings=?,fare=? where driver_id=?;";
				PreparedStatement driverstatement=con6.prepareStatement(driversql);
				while(result.next())
				{
					if(result.getInt("driver_id")==(did))
					{								
				driverstatement.setString(1,dp);
			    driverstatement.setInt(2,result.getInt("No_of_rides")+1);
				driverstatement.setDouble(3,(result.getDouble("total_earnings")+fare-zulacommission));
				driverstatement.setDouble(4,result.getDouble("fare")+fare);
				driverstatement.setInt(5, did);
					}
				}
				driverstatement.execute();
				//c.close();
				//driverconnection.close();
				
				boook.message=1;
				con6.close();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				System.out.println("SQL Exception Caught");
			}
											
	
	        try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
		}
		
		
		return boook;
		}
	}


