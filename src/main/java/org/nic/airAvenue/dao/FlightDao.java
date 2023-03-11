package org.nic.airAvenue.dao;

import java.util.List;

import org.nic.airAvenue.entity.company;
import org.nic.airAvenue.entity.flightDetails;

public interface FlightDao {
	public int insert(flightDetails fli);
	public int update(flightDetails fli, int fno);
	public int delete(int fno);
	public List<flightDetails> show();
	public int updateSeat(int seatsBooked, int seatsLeft, int flightNo );
	public flightDetails search(int flightNo);

	
}
