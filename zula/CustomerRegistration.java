package org.zulacabs.zulacabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerRegistration {
	String name;
	String password;
	int age;
	public CustomerRegistration()
	{
		
	}
	public CustomerRegistration(String name, String password, int age) {
		
		this.name = name;
		this.password = password;
		this.age = age;
	}
	public static String customerRegistration(CustomerRegistration customer) throws SQLException
	{
		int count=0;
		int flag=0;
		String s1="success";
		String url="jdbc:mysql://localhost:3306/zula";
		String username="root";
		String password="Secret";
					
		
		try {
			Connection con=DriverManager.getConnection(url,username,password);			
			
	        String sql="insert into customer(Customer_name,Customer_password,Customer_Age)values(?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
				
			statement.setString(1, customer.name);
			statement.setString(2, customer.password);
			statement.setInt(3, customer.age);		
			statement.execute();
			s="Registration Successfull";
			con.close();
		} catch (SQLException e) {
			
			flag=1;
			//e.printStackTrace();
			System.out.println();
		}
		if(flag==1)
		{
			System.out.println("Username already taken. Try with other name.");
			ZulaTaxiServices service=new ZulaTaxiServices();
			service.getChoice(1);
		}
		return s1;
			
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
