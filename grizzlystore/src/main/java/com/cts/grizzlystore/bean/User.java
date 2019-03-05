package com.cts.grizzlystore.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
	
	private String userId;
	private String name;
	private String password;
	private String userType;
	private int status;
	private String contactNo;
	private String address;
	private String designation;
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", password=" + password + ", userType=" + userType
				+ ", status=" + status + ", contactNo=" + contactNo + ", address=" + address + ", designation="
				+ designation + "]";
	}
	public User() {
		super();
	}
	public User(String userId, String name, String password, String userType, int status, String contactNo,
			String address, String designation) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.userType = userType;
		this.status = status;
		this.contactNo = contactNo;
		this.address = address;
		this.designation = designation;
	}
	@Id
	@Column
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Column
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Column
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Column
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	@Column
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

	
	
	

}
