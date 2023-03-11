package org.nic.airAvenue.resultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.nic.airAvenue.entity.booking;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class BookingResultSetExtractor implements ResultSetExtractor<List<booking>>{

	@Override
	public List<booking> extractData(ResultSet rs) throws SQLException, DataAccessException {
List<booking> book = new ArrayList<booking>() ;
		
		
		while(rs.next())
		{

			booking b= new booking();
			
			b.setName(rs.getString("name"));
			b.setMobileNo(rs.getInt("mobileNo"));
			b.setEmail(rs.getString("email"));
			b.setAddress(rs.getString("address"));
			b.setNoOfTickets(rs.getInt("noOfTickets"));
			b.setFlightNo(rs.getInt("flightNo"));
			b.setBookingId(rs.getLong("bookingId"));
			b.setActiveFlight(rs.getBoolean("activeFlight"));
			
			
			
			
			book.add(b);
				
		}
		return book;
	}

}
