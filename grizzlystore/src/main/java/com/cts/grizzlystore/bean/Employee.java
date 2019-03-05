package com.cts.grizzlystore.bean;

public class Employee {
	private String name;
	private String userId;
	private String password;
	private String userType;
	private String contactNumber;
	private String designation;
	private String address;
	
		
	public Employee() {
		super();
	}
	
	public Employee(String name, String userId, String password, String userType, String contactNumber,
			String designation, String address) {
		super();
		this.name = name;
		this.userId = userId;
		this.password = password;
		this.userType = userType;
		this.contactNumber = contactNumber;
		this.designation = designation;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	
}
