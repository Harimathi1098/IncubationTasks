package org.zulacabs.zulacabs;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class DriverAuthentication {	
	String drivername;
	String driverpassword;
	String message=" ";
	int driverid=0;
	int error=-1;
	
	public DriverAuthentication(DriverAuthentication details) {
		
		this.drivername = details.drivername;
		this.driverpassword =details.driverpassword;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getDriverid() {
		return driverid;
	}
	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public DriverAuthentication()
	{
		
	}
	public String getDrivername() {
		return drivername;
	}


	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}


	public String getDriverpassword() {
		return driverpassword;
	}


	public void setDriverpassword(String driverpassword) {
		this.driverpassword = driverpassword;
	}
	
	
	public void display(int i)
    {
  	  if(i==1)
  	  {
  		  this.message="Username or Password is required!!";
  		  
  	  }   	 
  	  else if(i==2)
  	  {
  		 this.message="Enter username and password!!";
  	  }
  	  else if(i==3) 
  	  {
  		  this.message="Invalid Credentials!! Enter a valid username and password!!!";
  	  }
  	  else if(i==4)
  	  {
  		  this.message="success";
  	  }
  	  
    }


	public static int findLength(ResultSet set)
	{
		
		int length=0;
			try {
				while(set.next())
				{
					length++;
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		
		return length;
	}
	
	
	public int driverAuthentication(DriverAuthentication details) throws SQLException
	{
	 
    int result=-1;
	String url="jdbc:mysql://localhost:3306/zula";
	String username="root";
	String password="Secret";
	Connection con=null;			
	ResultSet set1=null;
	int count=0;
	int setlength=0;
	DriverSummary su=new DriverSummary();
	int id=su.cid(details.drivername);
	driverid=id;
		try {
			con=DriverManager.getConnection(url,username,password);
			 String sqlquery="select driver_name , driver_password from driver;";
		
			Statement sta=con.createStatement();
			set1=sta.executeQuery(sqlquery);		
			setlength=findLength(set1);
			Statement st=con.createStatement();

		ResultSet set=st.executeQuery("select * from driver;");
		
		
				
		while(set.next()) {

			if(details.drivername.equals("")&&details.driverpassword.equals(""))
			{
				result=2;			
				error=4;
				break;
				
			}
			else if(details.drivername.equals("")||details.driverpassword.equals(""))
			{
				result=1;			
				error=1;
				break;
				
			}
			
			
			else if(set.getString("driver_Name").equals(details.drivername)&&set.getString("driver_Password").equals(details.driverpassword))
			{
				result=4;			
				error=3;
				break;
				
			}
			
			else
			{
				count++;
			}
		}			
		

      st.close();
	con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("SQL Exception Caught");
		}
		if(setlength==count)
		{
			result=3;
			
			error=2;
		}		
		
return result;
	}

}
