package org.nic.airAvenue.resultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.nic.airAvenue.entity.airport;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class AirportResultSetExtractor implements ResultSetExtractor<List<airport>> {

	@Override
	public List<airport> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<airport> air= new ArrayList<airport>();
		while(rs.next())
		{

			airport a= new airport();
			
			a.setaName(rs.getString("aName"));
			a.setLocation(rs.getString("location"));
			
			air.add(a);
				
		}
		return air;
	}

}
