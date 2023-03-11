package org.nic.airAvenue.entity;

public class login {
	String name;
	String userName;
	String pass;
	String utype;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	@Override
	public String toString() {
		return "login [name=" + name + ", userName=" + userName + ", pass=" + pass + ", utype=" + utype + "]";
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getUtype() {
		return utype;
	}
	public void setUtype(String utype) {
		this.utype = utype;
	}
	
}
