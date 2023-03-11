package org.nic.airAvenue.resultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.nic.airAvenue.entity.bookingLogin;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class BookingLoginResultSetExtractor implements ResultSetExtractor<List<bookingLogin>> {

	@Override
	public List<bookingLogin> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<bookingLogin> bookl= new ArrayList<bookingLogin>();
		while(rs.next())
		{

			bookingLogin b= new bookingLogin();
			
			b.setUserName(rs.getString("userName"));
			b.setPassword(rs.getString("password"));
			b.setPhoneNo(rs.getLong("phoneNo"));
			
			bookl.add(b);
				
		}
		return bookl;
	}

}
