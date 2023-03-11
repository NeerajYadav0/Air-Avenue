package org.nic.airAvenue.entity;

public class bookingLogin {
String userName;
String password;
long phoneNo;
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
@Override
public String toString() {
	return "bookingLogin [userName=" + userName + ", password=" + password + "]";
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
