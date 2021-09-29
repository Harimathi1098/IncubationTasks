package org.zulacabs.zulacabs;

public class Customer {	
String customername;
String customerpassword;
int customerid;
double totalfare;
int age;
int error=-1;
String source;
String destination;
int driverid;
String pickuptime;
public Customer(int customerid,String source, String destination,int driverid,double totalfare,String pickuptime) {
	
	this.customerid = customerid;
	this.totalfare = totalfare;
	this.source = source;
	this.destination = destination;
	this.driverid=driverid;
	this.pickuptime=pickuptime;
}
public String getPickuptime() {
	return pickuptime;
}
public void setPickuptime(String pickuptime) {
	this.pickuptime = pickuptime;
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
public int getDriverid() {
	return driverid;
}
public void setDriverid(int driverid) {
	this.driverid = driverid;
}
String message;
public Customer()
{
	
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public String getCustomerpassword() {
	return customerpassword;
}
public void setCustomerpassword(String customerpassword) {
	this.customerpassword = customerpassword;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public double getTotalfare() {
	return totalfare;
}
public void setTotalfare(double totalfare) {
	this.totalfare = totalfare;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getError() {
	return error;
}
public void setError(int error) {
	this.error = error;
}



}





