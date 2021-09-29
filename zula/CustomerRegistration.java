package org.zulacabs.zulacabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerRegistration extends Customer {
	
	public Customer customerRegistration(Customer customer) throws SQLException
	{
		Customer cust=new Customer();
		String url="jdbc:mysql://localhost:3306/zula";
		String username="root";
		String password="Secret";
		int flag=0;
		
		try {
			Connection con=DriverManager.getConnection(url,username,password);			
			
	        String sql="insert into customer(Customer_name,Customer_password,Customer_Age)values(?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
				
			statement.setString(1, customer.customername);
			statement.setString(2, customer.customerpassword);
			statement.setInt(3, customer.age);		
			statement.execute();
			
			statement.close();
			con.close();
			
		} catch (SQLException e) {
			
			flag=1;
			//e.printStackTrace();
			System.out.println();
		}
		cust.error=1;
		cust.customername=customer.customername;
		cust.customerpassword=customer.customerpassword;
		cust.age=customer.age;
		if(flag==1)
		{
			cust.error=0;
			//System.out.println("Username already taken. Try with other name.");
			
		}
		return cust;
			
	}
	
	

}
