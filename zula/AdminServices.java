/*package org.zulacabs.zulacabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AdminServices {
	
	public ArrayList getAdminDetails()
	{
		Administrator admin=new Administrator();
		ArrayList driverlist=new ArrayList();
		ArrayList list=new ArrayList();
		 String url="jdbc:mysql://localhost:3306/zula";
		   String username="root";
		   String password="Secret";
		 Connection con=null;			
		   ResultSet set=null;		
		for(int i=1;i<=4;i++)
		{
			
			try {
				con=DriverManager.getConnection(url,username,password);							
				Statement st=con.createStatement();
		
		    String sqlquery="select * from driver where driver_id="+i+";";
			ResultSet set1=st.executeQuery(sqlquery);
			while(set1.next())
			{
				admin.driverid=set1.getInt("Driver_id");
				admin.drivername=set1.getString("Driver_Name");
				admin.totalearnings=set1.getDouble("total_earnings");
				admin.zulacommission=admin.totalearnings*0.3;
			}
			Statement sta=con.createStatement();
			
			 String query="select * from book_rides where driver_id="+i+"order by pickup_time desc;";
			ResultSet set2=sta.executeQuery(query);
			while(set2.next())
			{
				list.add(new Administrator(set2.getString("Source"),set2.getString("Destination"),set2.getInt("customer_id"),set2.getDouble("total_fare"),set2.getDouble("zula_commission"),set2.getString("pickup_time")));
			     
			}
			
			admin.driverlist=list;
			
			}
               catch (SQLException e) {
				
				e.printStackTrace();
				System.out.println("SQL Exception Caught");
			}
			
		}
		driverlist.add(admin);
		return driverlist;

	}
		
	}

*/
