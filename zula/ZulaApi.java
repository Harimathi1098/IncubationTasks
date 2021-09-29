package org.zulacabs.zulacabs;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;

@Path("/zulaapi")
public class ZulaApi {
	 

	@GET
	@Path("/driver/{name}/ridedetailssummary")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ArrayList displayDriverDetails(@PathParam("name")String name)
	{
		ArrayList al=new ArrayList();		
	    DriverSummary summary=new DriverSummary();		
	    al=summary.displayDriverDetails(name);    

	return al;
				
	}
	
	
	@GET
	@Path("/customer/booktaxi/location")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList displayLocation() {
		
		ArrayList location=new ArrayList();
		Location bt=new Location();
		location=bt.displayLocation();
		return location;
	}
	
	
	@GET
	@Path("/customer/{name}/ridedetailssummary")
	@Produces(MediaType.APPLICATION_JSON)
	
	public ArrayList displayCustomerDetails(@PathParam("name")String name)
	{
		ArrayList al=new ArrayList();
		CustomerSummary summary=new CustomerSummary();		
		al=summary.displayCustomerDetails(name);	    
	
		return al;
	}
	
	
	@GET
	@Path("/admin/summary")
	@Produces(MediaType.APPLICATION_JSON)
	
	public ArrayList displayAdminDetails()
	{
		System.out.println("success....");
		ZulaAdministartion summary=new ZulaAdministartion();
		
		return summary.displayAdminDetails();
	}
	
	
	@POST
	@Path("/driver/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)	
	public DriverAuthentication isvalidDriver(DriverAuthentication driverdetails)
	{
		
		String s="Authentication Failed";
		int value=0;
			
		
		DriverAuthentication authenticate=new DriverAuthentication(driverdetails);
		
		try {
		value=authenticate.driverAuthentication(driverdetails);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		authenticate.display(value);
		return authenticate;
		
	}
	

	
	@POST
	@Path("/customer/login")	
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)	
	public Customer  isvalidCustomer(Customer customerdetails)
	{
	      		
		Customer customer=new Customer();
		CustomerAuthentication authenticate=new CustomerAuthentication();
		try {
		customer=authenticate.customerAuthentication(customerdetails);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return customer;
	}
	
	
	@POST
	@Path("/customer/registration")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)	
	public Customer registerCustomer(Customer customer) throws SQLException
	{
		Customer cust=new Customer();
		CustomerRegistration register=new CustomerRegistration();
		customer=register.customerRegistration(customer);
		return customer ;
	}
	
	
	@POST
	@Path("/customer/booktaxi/getfare")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)	
	public BookTaxi getDetails(BookTaxi book) throws SQLException
	{
		BookTaxi bo=new BookTaxi();
		bo=bo.getFare(book);
		return bo;
	}
	

	@GET
	@Path("/admin/driver")
	@Produces(MediaType.APPLICATION_JSON)
	
	public ArrayList displayDriverDetails()
	{
		ArrayList al=new ArrayList();
		System.out.println("success....");
		DriverSummary driver=new DriverSummary();
		al=driver.displayDriverDetails();
		return al;
	}
	
	@POST
	@Path("/customer/booktaxi/{id}/final")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public BookTaxi bookTaxi(@PathParam("id")int id,BookTaxi book) throws SQLException
	{
		//System.out.println("hello");		
		
		BookTaxi booktaxi=new BookTaxi();	
		booktaxi=booktaxi.bookTaxi(id, book);
	    return booktaxi;
			
	}
	}

