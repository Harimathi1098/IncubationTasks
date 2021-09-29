package org.zulacabs.zulacabs;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="driver")
public class Driver {
	
	public Driver()
	{
		
	}
int id;
String name;
String Source;
String time;
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
int customerid;
String Destination;

public Driver(int id, String name, String source, String destination, int customerid,double totalfare, double zulacommission,String time) {
super();
this.id = id;
this.name = name;
Source = source;
Destination = destination;
this.customerid=customerid;
this.totalfare = totalfare;
this.zulacommission = zulacommission;
this.time=time;
}

public Driver(int id, String name, double totalfare, double zulacommission) {
	super();
	this.id = id;
	this.name = name;
	this.totalfare = totalfare;
	this.zulacommission = zulacommission;
	
	
}
@XmlElement(name="ID")
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
@XmlElement(name="name")
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
@XmlElement(name="source")
public String getSource() {
return Source;
}
public void setSource(String source) {
Source = source;
}
@XmlElement(name="destination")
public String getDestination() {
return Destination;
}
public void setDestination(String destination) {
Destination = destination;
}
@XmlElement(name="totalfare")
public double getTotalfare() {
return totalfare;
}
public void setTotalfare(double totalfare) {
this.totalfare = totalfare;
}
@XmlElement(name="zulacommission")
public double getZulacommission() {
return zulacommission;
}
public void setZulacommission(double zulacommission) {
this.zulacommission = zulacommission;
}
double totalfare;
double zulacommission;

}
	
	