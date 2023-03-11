package org.nic.airAvenue.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.nic.airAvenue.entity.booking;
import org.springframework.jdbc.core.RowMapper;

public class BookingRowMapper  implements RowMapper<booking>{

	@Override
	public booking mapRow(ResultSet rs, int rowNum) throws SQLException {
		booking book = new booking();
		book.setBookingId(rs.getLong("bookingId"));
		return book;
	}

}
