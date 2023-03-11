package org.nic.airAvenue.dao;

import java.util.List;

import org.nic.airAvenue.entity.airport;
import org.nic.airAvenue.resultSetExtractor.AirportResultSetExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
@Repository
public class AirportDaoImpl implements AirportDao{
	@Autowired
	 JdbcTemplate jdbcTemplate ;
	@Override
	public int insert(airport air) {
	String query = "insert into airport values(?,?)";
	Object records[]= { air.getaName(),air.getLocation()};
		int b =jdbcTemplate.update(query,records);
		System.out.println("Records added successfully! "+ records);
		return b;
	}

	@Override
	public int update(airport air, String str) {
		String query = "update airport set aName= ? , location= ? where aName= ?";
		Object records[]= {air.getaName(),air.getLocation(),str };
				int b =jdbcTemplate.update(query, records);
				System.out.println("Records updated successfully! "+ air);
				return b;
	}

	@Override
	public int delete(String str) {
		String query ="delete from airport where aName= ?";
		int b =jdbcTemplate.update(query, str);
		return b;
	}

	@Override
	public List<airport> show() {
		String query ="select * from airport";
		ResultSetExtractor<List<airport>> rst = new AirportResultSetExtractor();
		
		
		List<airport> air = jdbcTemplate.query(query,rst);
		return air;
	}

}
