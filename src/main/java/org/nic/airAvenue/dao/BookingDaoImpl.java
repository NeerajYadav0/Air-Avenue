package org.nic.airAvenue.dao;

import java.util.List;

import org.nic.airAvenue.entity.airport;
import org.nic.airAvenue.entity.booking;
import org.nic.airAvenue.resultSetExtractor.AirportResultSetExtractor;
import org.nic.airAvenue.resultSetExtractor.BookingResultSetExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
@Repository
public class BookingDaoImpl implements BookingDao {
	@Autowired
	 JdbcTemplate jdbcTemplate ;
	@Override
	public int insert(booking book) {
		String query = "insert into booking values(?,?,?,?,?,?,?,?)";
		boolean activeFlight = true;
		Object records[]= {book.getName(), book.getMobileNo(), book.getEmail(),book.getAddress(),book.getNoOfTickets(), book.getFlightNo(), book.getBookingId(), activeFlight};
			int b =jdbcTemplate.update(query,records);
			System.out.println("Records added successfully! "+ records);
			return b;
	}

	@Override
	public int update(booking book, String str) {
		String query = "update booking set  name= ?, mobileNo=?, email=?, address=?, noOfTicket=?, flightNo=? where flightNo= ? and userName=? and ";
		Object records[]= {book.getName(), book.getMobileNo(), book.getEmail(),book.getAddress(),book.getNoOfTickets(), book.getFlightNo() };
				int b =jdbcTemplate.update(query, records);
				System.out.println("Records updated successfully! "+ book);
				return b;
	}

	@Override
	public int delete(long bookingId) {
		String query ="delete from booking where bookingId= ?";
		int b =jdbcTemplate.update(query, bookingId);
		return b;
	}

	@Override
	public List<booking> show() {
		return null;
	}

	@Override
	public boolean check(long a) {
		String query ="select * from booking where bookingId =?";
ResultSetExtractor<List<booking>> rst = new BookingResultSetExtractor();
		
		
		List<booking> book = jdbcTemplate.query(query,rst,a);
		if(book.isEmpty())
		{
			return true;
		}
		return false;
	}

	@Override
	public List<booking> search(String userName) {
		String query ="select * from booking where email =?";

		ResultSetExtractor<List<booking>> rst = new BookingResultSetExtractor();
		
		
		List<booking> book = jdbcTemplate.query(query,rst,userName);
		
		return book;
	}

	@Override
	public booking searchById(long bookingId) {
		String query ="select * from booking where bookingId =?";
		ResultSetExtractor<List<booking>> rst = new BookingResultSetExtractor();
				
				
				List<booking> book = jdbcTemplate.query(query,rst,bookingId);
				return book.get(0);
	}

	@Override
	public List<booking> searchByFno(int fno) {
		String query ="select * from booking where flightNo =?";

		ResultSetExtractor<List<booking>> rst = new BookingResultSetExtractor();
		
		
		List<booking> book = jdbcTemplate.query(query,rst,fno);
		
		return book;
	}

	@Override
	public int cancelFlight(boolean activeFlight , int fno) {
		String query = "update booking set activeFlight=?  where flightNo= ?";
				int b =jdbcTemplate.update(query, activeFlight, fno);
				System.out.println("Records updated successfully! "+ activeFlight);
				return b;
	}

}
