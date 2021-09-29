package org.zulacabs.zulacabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerSummary extends Customer {
	
	
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
		
		    String sqlquery="select * from book_rides b join customer c on c.customer_id=b.customer_id where customer_name='"+name+"'"+ "order by pickup_time desc;";
			ResultSet set1=st.executeQuery(sqlquery);
			
			
			
			while(set1.next()) 
			{
				customer=new Customer(set1.getInt("customer_id"),set1.getString("source"),set1.getString("destination"),set1.getInt("Driver_id"),set1.getDouble("total_Fare"),set1.getString("pickup_time"));
					
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
	

}
