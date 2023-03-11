package org.nic.airAvenue.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.nic.airAvenue.entity.flightDetails;
import org.springframework.jdbc.core.RowMapper;

public class FlightDetailsRowMapper implements RowMapper<flightDetails>{

	@Override
	public flightDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		flightDetails fli = new flightDetails();
		
		fli.setFlightNo(rs.getInt("flightNo"));
		fli.setNoOfSeats(rs.getInt("noOfSeats"));
		fli.setCost(rs.getInt("cost"));
		fli.setDestination(rs.getString("destination"));
		fli.setPickUp(rs.getString("pickUp"));
		fli.setCompany(rs.getString("company"));
		fli.setAircraftName(rs.getString("aircraftName"));
		fli.setSeatsLeft(rs.getInt("seatsLeft"));
		fli.setBookedSeats(rs.getInt("bookedSeats"));
		fli.setDepartureTime(rs.getString("departureTime"));
		fli.setArrivalTime(rs.getString("arrivalTime"));
		fli.setDate(rs.getString("date"));
		
		return fli;
	}

}
