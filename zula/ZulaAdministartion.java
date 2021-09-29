package org.zulacabs.zulacabs;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ZulaAdministartion {
	public static ArrayList displayAdminDetails()
	{
		String url="jdbc:mysql://localhost:3306/zula";
		String username="root";
		String password="Secret";
	Connection con=null;			
	ResultSet set=null;
	double earnings=0;
	double totalearnings=0;
	double zulacommission=0;
    int rides=0;
    
    Administrator admin;
    ArrayList administrator=new ArrayList();
		try {
			con=DriverManager.getConnection(url,username,password);
						
			Statement st=con.createStatement();
		
		
	
		ResultSet set2=st.executeQuery("select * from book_rides br , driver d where br.driver_id=d.driver_id order by pickup_time desc");
		while(set2.next()) 
		{
		
				admin=new Administrator(set2.getInt("driver_id"),set2.getString("source"), set2.getString("Destination"),set2.getInt("Customer_id"), set2.getDouble("Total_Fare"), set2.getDouble("zula_commission"),set2.getDouble("fare"),set2.getString("driver_name"),set2.getString("pickup_time"));
				administrator.add(admin);
		
		}
		
		
		
		
		}
		
		catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("SQL Exception Caught");
		}
		return administrator;
	


}
	
	

	}
