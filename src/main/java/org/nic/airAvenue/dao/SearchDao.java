package org.nic.airAvenue.dao;

import java.util.List;

import org.nic.airAvenue.entity.Search;
import org.nic.airAvenue.entity.flightDetails;

public interface SearchDao {

	public List<flightDetails> searchFlight(Search srch);
	 
}
