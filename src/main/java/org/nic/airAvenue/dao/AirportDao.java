package org.nic.airAvenue.dao;

import java.util.List;

import org.nic.airAvenue.entity.airport;

public interface AirportDao {
public int insert(airport air);
public int update(airport air, String str);
public int delete(String str);
public List<airport> show();

}
