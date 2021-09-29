package org.zulacabs.zulacabs;

import java.util.ArrayList;

public class Administrator {
	String source;
	String destination;
	int customerid;
	int driverid;
	double fare;
	double zulacommission;
	double totalearnings;
	String  drivername;
	ArrayList driverlist;
	String time;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	public double getTotalearnings() {
		return totalearnings;
	}
	public void setTotalearnings(double totalearnings) {
		this.totalearnings = totalearnings;
	}
	public Administrator() {
		
	}
	public Administrator(int driverid,String source, String destination, int customerid, double fare, double zulacommission, double totalearnings, String drivername,String time) {
	
		this.driverid=driverid;
		this.source = source;
		this.destination = destination;
		this.customerid = customerid;
		this.fare = fare;
		this.zulacommission = zulacommission;
		this.drivername=drivername;
		this.totalearnings=totalearnings;
		this.time=time;
	}
	public Administrator(String source, String destination, int customerid, double totalearnings, double zulacommission,String time) {
		this.source = source;
		this.destination = destination;
		this.customerid = customerid;
		this.totalearnings = totalearnings;
		this.zulacommission = zulacommission;
		this.time=time;
	}
	
	public int getDriverid() {
		return driverid;
	}
	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public double getZulacommission() {
		return zulacommission;
	}
	public void setZulacommission(double zulacommission) {
		this.zulacommission = zulacommission;
	}
}
