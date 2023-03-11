package org.nic.airAvenue.resultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.nic.airAvenue.entity.flightDetails;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class FlightDetailsResultSetExtractor implements ResultSetExtractor<List<flightDetails>> {

	@Override
	public List<flightDetails> extractData(ResultSet rs) throws SQLException, DataAccessException {
List<flightDetails> fli = new ArrayList<flightDetails>() ;
		
		
		while(rs.next())
		{

			flightDetails f= new flightDetails();
			f.setFlightNo(rs.getInt("flightNo"));
			f.setNoOfSeats(rs.getInt("noOfSeats"));
			f.setCost(rs.getInt("cost"));
			f.setDestination(rs.getString("destination"));
			f.setPickUp(rs.getString("pickUp"));
			f.setCompany(rs.getString("company"));
			f.setAircraftName(rs.getString("aircraftName"));
			f.setSeatsLeft(rs.getInt("seatsLeft"));
			f.setBookedSeats(rs.getInt("bookedSeats"));
			f.setDepartureTime(rs.getString("departureTime"));
			f.setArrivalTime(rs.getString("arrivalTime"));
			f.setDate(rs.getString("date"));
			fli.add(f);
				
		}
		return fli;
		
	}
	}


