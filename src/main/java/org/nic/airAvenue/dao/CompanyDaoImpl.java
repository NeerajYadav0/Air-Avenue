package org.nic.airAvenue.dao;

import java.util.List;

import org.nic.airAvenue.config.MvcConfiguration;
import org.nic.airAvenue.entity.company;
import org.nic.airAvenue.resultSetExtractor.CompanyResultSetExtractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
@Service
public class CompanyDaoImpl implements CompanyDao {
	@Autowired
	 JdbcTemplate jdbcTemplate ;
	@Override
	public int insert(company comp) {
		// TODO Auto-generated method stub
		String query = "insert into company values(?)";
		
		int b =jdbcTemplate.update(query, comp.getCompanyName());
		System.out.println("Records added successfully! "+ comp);
		return b;
	}

	@Override
	public int update(company comp, String a) {
String query = "update company set companyName= ? where companyName= ?";
System.out.println( comp.getCompanyName());
System.out.println(a);
Object records[]= { comp.getCompanyName(), a};
		int b =jdbcTemplate.update(query, records);
		System.out.println("Records updated successfully! "+ comp);
		return b;
	}

	@Override
	public int delete(String comp) {
		String query ="delete from company where companyName= ?";
		int b =jdbcTemplate.update(query, comp);
		return b;
	}

	@Override
	public List<company> show() {
		String query ="select * from company";
		ResultSetExtractor<List<company>> rst = new CompanyResultSetExtractor();
		
		
		List<company> comp = jdbcTemplate.query(query,rst);
		return comp;
	}

}
