package org.nic.airAvenue.dao;

import java.util.List;

import org.nic.airAvenue.entity.bookingLogin;
import org.nic.airAvenue.entity.flightDetails;
import org.nic.airAvenue.resultSetExtractor.BookingLoginResultSetExtractor;
import org.nic.airAvenue.resultSetExtractor.FlightDetailsResultSetExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
@Repository
public class BookingLoginDaoImpl implements BookingLoginDao{
	@Autowired
	JdbcTemplate jdbcTemplate ;
	@Override
	public int insert(bookingLogin bookl) {
		String query = "insert into bookingLogin values(?,?,?)";
		Object records[]= { bookl.getUserName(), bookl.getPassword(), bookl.getPhoneNo()};
			int b =jdbcTemplate.update(query,records);
			System.out.println("Records added successfully! "+ records);
			return b;
	}

	@Override
	public int update(bookingLogin bookl, String str) {
		String query = "update bookingLogin set userName= ? , password= ?, phoneNo=?  where username= ?";
		Object records[]= {bookl.getUserName(), bookl.getPassword(), bookl.getPhoneNo(), str };
				int b =jdbcTemplate.update(query, records);
				System.out.println("Records updated successfully! "+ bookl);
				return b;
	}

	@Override
	public int delete(String str) {
		String query ="delete from bookingLogin where username= ?";
		int b =jdbcTemplate.update(query, str);
		return b;
	}

	@Override
	public bookingLogin search(String username) {
		String query ="select * from bookingLogin where username=?";
		Object records[]= {username};
		ResultSetExtractor<List<bookingLogin>> rst = new BookingLoginResultSetExtractor();
		List<bookingLogin> book = jdbcTemplate.query(query,rst,records);
		bookingLogin b= new bookingLogin();
		if(book.isEmpty())
		{
			return b ;
		}
		b= book.get(0);
		return b;
	}

	@Override
	public boolean login(bookingLogin log) {
		String query ="select * from bookingLogin where username=? and password=?";
		Object records[]= {log.getUserName(), log.getPassword()};
		ResultSetExtractor<List<bookingLogin>> rst = new BookingLoginResultSetExtractor();
		List<bookingLogin> book = jdbcTemplate.query(query,rst,records);
		if(book.isEmpty())
		{
			return false ;
		}
		
		return true;
	}

	

}
