package org.nic.airAvenue.dao;

import org.nic.airAvenue.entity.bookingLogin;

public interface BookingLoginDao {

	public int insert(bookingLogin bookl);
	public int update(bookingLogin bookl, String str);
	public int delete(String str);
    public bookingLogin search(String username);
    public boolean login(bookingLogin log);
}
