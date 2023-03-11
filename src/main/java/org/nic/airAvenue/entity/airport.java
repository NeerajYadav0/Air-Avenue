package org.nic.airAvenue.entity;

import org.springframework.stereotype.Repository;

@Repository
public class airport {
	String aName;
	String location;
	@Override
	public String toString() {
		return "airport [aName=" + aName + ", location=" + location + "]";
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
