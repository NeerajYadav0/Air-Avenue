package org.nic.airAvenue.entity;

import java.util.ArrayList;
import java.util.List;

import org.nic.airAvenue.dao.AirportDao;
import org.nic.airAvenue.dao.CompanyDao;

public class flightDetails {
	
int flightNo;
int noOfSeats;
int cost;
String destination;
String pickUp;
String company;
String aircraftName;
int seatsLeft;
int bookedSeats;
String departureTime;
String arrivalTime;
List<String> airportOptions = new ArrayList<String>();
List<String> companyOptions = new ArrayList<String>();
public List<String> getAirportOptions() {
	return airportOptions;
}
public void setAirportOptions(List<String> airportOptions) {
	this.airportOptions = airportOptions;
}
public List<String> getCompanyOptions() {
	return companyOptions;
}
public void setCompanyOptions(List<String> companyOptions) {
	this.companyOptions = companyOptions;
}
String date;
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public flightDetails(AirportDao adao,CompanyDao cdao) {
	List<airport> air = new ArrayList<airport>();
	air = adao.show();
	List<company> com = new ArrayList<company>();
	  com = cdao.show();
	 
	 for( airport a: air)
	 {
		 airportOptions.add(a.getaName() +", " + a.getLocation() );
	 }
	 for(company c: com)
	 {
		 companyOptions.add(c.getCompanyName());
	 }
}
public flightDetails()
{
	
}



@Override
public String toString() {
	return "flightDetails [flightNo=" + flightNo + ", noOfSeats=" + noOfSeats + ", cost=" + cost + ", destination="
			+ destination + ", pickUp=" + pickUp + ", company=" + company + ", aircraftName=" + aircraftName
			+ ", seatsLeft=" + seatsLeft + ", bookedSeats=" + bookedSeats + ", departureTime=" + departureTime
			+ ", arrivalTime=" + arrivalTime + ", airportOptions=" + airportOptions + ", companyOptions="
			+ companyOptions + ", date=" + date + "]";
}
public int getFlightNo() {
	return flightNo;
}
public void setFlightNo(int flightNo) {
	this.flightNo = flightNo;
}
public int getNoOfSeats() {
	return noOfSeats;
}
public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getPickUp() {
	return pickUp;
}
public void setPickUp(String pickUp) {
	this.pickUp = pickUp;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getAircraftName() {
	return aircraftName;
}
public void setAircraftName(String aircraftName) {
	this.aircraftName = aircraftName;
}
public int getSeatsLeft() {
	return seatsLeft;
}
public void setSeatsLeft(int seatsLeft) {
	this.seatsLeft = seatsLeft;
}
public int getBookedSeats() {
	return bookedSeats;
}
public void setBookedSeats(int bookedSeats) {
	this.bookedSeats = bookedSeats;
}
public String getDepartureTime() {
	return departureTime;
}
public void setDepartureTime(String departureTime) {
	this.departureTime = departureTime;
}
public String getArrivalTime() {
	return arrivalTime;
}
public void setArrivalTime(String arrivalTime) {
	this.arrivalTime = arrivalTime;
}
}
