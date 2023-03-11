package org.nic.airAvenue.dao;

import java.util.List;

import org.nic.airAvenue.entity.company;

public interface CompanyDao {
	public int insert(company comp);
	public int update(company comp, String a);
	public int delete(String comp);
	public List<company> show();
	

}
