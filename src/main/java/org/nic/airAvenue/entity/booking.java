package org.nic.airAvenue.entity;

public class booking {
String name;
String email;
String address;
int noOfTickets;
int flightNo;
String password; 
long mobileNo;
long bookingId;
boolean activeFlight;
public boolean isActiveFlight() {
	return activeFlight;
}
public void setActiveFlight(boolean activeFlight) {
	this.activeFlight = activeFlight;
}
public long getBookingId() {
	return bookingId;
}
public void setBookingId(long bookingId) {
	this.bookingId = bookingId;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getNoOfTickets() {
	return noOfTickets;
}
public void setNoOfTickets(int noOfTickets) {
	this.noOfTickets = noOfTickets;
}
public int getFlightNo() {
	return flightNo;
}
public void setFlightNo(int flightNo) {
	this.flightNo = flightNo;
}
@Override
public String toString() {
	return "booking [ name=" + name + ", email=" + email + ", address=" + address
			+ ", noOfTickets=" + noOfTickets + ", flightNo=" + flightNo + "]";
}

}
