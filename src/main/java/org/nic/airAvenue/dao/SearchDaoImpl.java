package org.nic.airAvenue.dao;

import java.util.List;

import org.nic.airAvenue.entity.Search;
import org.nic.airAvenue.entity.flightDetails;
import org.nic.airAvenue.resultSetExtractor.FlightDetailsResultSetExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
@Repository
public class SearchDaoImpl implements SearchDao{
	@Autowired
	 JdbcTemplate jdbcTemplate ;
	@Override
	public List<flightDetails> searchFlight(Search srch) {
		String query ="select * from flightDetails where pickUp=? and destination=? and date=?";
		Object records[]= {srch.getPickUp(), srch.getDestination(), srch.getDate()};
		ResultSetExtractor<List<flightDetails>> rst = new FlightDetailsResultSetExtractor();
		List<flightDetails> fli = jdbcTemplate.query(query,rst,records);
		return fli;
		
	}

}
