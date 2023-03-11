package org.nic.airAvenue.dao;

import java.util.List;
import org.nic.airAvenue.entity.flightDetails;
import org.nic.airAvenue.resultSetExtractor.FlightDetailsResultSetExtractor;
import org.nic.airAvenue.rowMapper.FlightDetailsRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository
public class FlightDaoImpl implements FlightDao {
   @Autowired
   JdbcTemplate jdbcTemplate;
	@Override
	public int insert(flightDetails fli) {
		
				String query = "insert into flightDetails values(?,?,?,?,?,?,?,?,?,?,?,?)";
				Object records[]= {fli.getFlightNo(), fli.getNoOfSeats(), fli.getCost(), fli.getDestination(),fli.getPickUp(), fli.getCompany(), fli.getAircraftName(), fli.getSeatsLeft(), fli.getBookedSeats(),fli.getDepartureTime(), fli.getArrivalTime(), fli.getDate()};
				int b =jdbcTemplate.update(query, records);
				System.out.println("Records added successfully! "+ fli);
				return b;
	}

	@Override
	public int update(flightDetails fli, int fno) {
		String query = "update flightDetails set flightNo =?, noOfSeats =? , cost =? ,  destination =?, pickUp =?, company =?, aircraftName =?, seatsLeft =?, bookedSeats =? , departureTime =?, arrivalTime =?, date =?  where flightNo= ?";
		Object records[]= { fli.getFlightNo(), fli.getNoOfSeats(), fli.getCost(), fli.getDestination(),fli.getPickUp(), fli.getCompany(), fli.getAircraftName(), fli.getSeatsLeft(), fli.getBookedSeats(),fli.getDepartureTime(), fli.getArrivalTime(),fli.getDate(), fno};
				int b =jdbcTemplate.update(query, records);
				System.out.println("Records updated successfully! "+ fli);
				return b;
	}

	@Override
	public int delete(int fno) {
		String query ="delete from flightDetails where flightNo= ?";
		int b =jdbcTemplate.update(query, fno);
		return b;
	}

	@Override
	public List<flightDetails> show() {
		String query ="select * from flightDetails";
		ResultSetExtractor<List<flightDetails>> rst = new FlightDetailsResultSetExtractor();
		
		
		List<flightDetails> fli = jdbcTemplate.query(query,rst);
		return fli;
	}

	@Override
	public int updateSeat(int seatsBooked, int seatsLeft, int flightNo) {
		String query = "update flightDetails set seatsLeft =?, bookedSeats =? where flightNo= ?";
		Object records[]= {seatsLeft, seatsBooked, flightNo};
				int b =jdbcTemplate.update(query, records);
				System.out.println("Records updated successfully! ");
				return b;
	}

	@Override
	public flightDetails search(int flightNo) {
		String query ="select * from flightDetails where flightNo =?";
		RowMapper<flightDetails> rm = new FlightDetailsRowMapper();
		System.out.println("in serch");
		List<flightDetails> fli= jdbcTemplate.query(query,rm, flightNo);
		System.out.println(fli);
		
		if(fli.isEmpty())
		{
			flightDetails flight = new flightDetails();
			return flight;
		}
		return fli.get(0);
	}

	
}
