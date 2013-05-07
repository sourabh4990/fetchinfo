package javalearn;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String uid;
	private String name;
	private String email;
	private String contactNumber;
	private String location;

	public void setUid(String id) {
		uid = id;
	}
	public void setName(String username) {
		name = username;
	}
	public void setEmail(String mail) {
		email = mail;
	}
	public void setContactNumber(String number) {
		contactNumber = number;
	}
	public void setLocation(String loc) {
		location = loc;
	}
	public String getUid() {
		return uid;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public String getLocation() {
		return location;
	}
}
	
	
	

