package org.nic.airAvenue.resultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.nic.airAvenue.entity.company;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class CompanyResultSetExtractor implements ResultSetExtractor<List<company>> {

	@Override
	public List<company> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
List<company> comp = new ArrayList<company>() ;
		
		
		while(rs.next())
		{

			company c= new company();
			c.setCompanyName(rs.getString("companyName"));
			
			
			comp.add(c);
				
		}
		return comp;
		
	}

}
