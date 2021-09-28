package org.zulacabs.zulacabs;

import javax.xml.bind.annotation.XmlElement;

public class Customer {
	
int id;
String name;
String password;
String Source;
int customerid;
int driverid;
String Destination;
double totalfare;
int age;
boolean loggedin=false;
public Customer(int customerid, String name, String source, String destination, int driverid,double totalfare)
{

this.customerid = customerid;
this.name = name;
Source = source;
Destination = destination;
this.driverid=driverid;
this.totalfare = totalfare;

}
public Customer(String name,String password,int age)
{
	this.name=name;
	this.password=password;
	this.age=age;
}
public Customer() {
	// TODO Auto-generated constructor stub
}
@XmlElement(name="CustomerId")
public int getId() {
return customerid;
}
public void setId(int customerid) {
this.customerid = customerid;
}
@XmlElement(name="CustomerName")
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
@XmlElement(name="Driverid")
public int getDriverId() {
return driverid;
}
public void setDriverId(int driverid) {
this.driverid = driverid;
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


}





