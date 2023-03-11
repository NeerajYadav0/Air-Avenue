package org.nic.airAvenue.dao;

import java.util.List;

import org.nic.airAvenue.entity.booking;

public interface BookingDao {

	public int insert(booking book);
	public int update(booking book, String str);
	public int delete(long bookingId);
	public List<booking> show();
	public boolean check(long a);
	public List<booking> search(String userName);
	public booking searchById(long bookingId);
	public List<booking> searchByFno(int fno);
	public int cancelFlight(boolean activeFlight, int fno);
}
