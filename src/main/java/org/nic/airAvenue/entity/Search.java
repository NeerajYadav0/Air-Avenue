package org.nic.airAvenue.entity;

import java.util.ArrayList;
import java.util.List;
import org.nic.airAvenue.dao.AirportDao;

public class Search {
String pickUp;
String destination;
String date;
List<String> airportOptions = new ArrayList<String>();

public Search(AirportDao adao)
{
	List<airport> air = new ArrayList<airport>();
	air = adao.show();
	for( airport a: air)
	 {
		 airportOptions.add(a.getaName() +", " + a.getLocation() );
	 }
}
public Search () {}
public String getPickUp() {
	return pickUp;
}
public void setPickUp(String pickUp) {
	this.pickUp = pickUp;
}
public String getDestination() {
	return destination;
}
@Override
public String toString() {
	return "Search [pickUp=" + pickUp + ", destination=" + destination + ", Date=" + date + "]";
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public List<String> getAirportOptions() {
	return airportOptions;
}
public void setAirportOptions(List<String> airportOptions) {
	this.airportOptions = airportOptions;
}
}
