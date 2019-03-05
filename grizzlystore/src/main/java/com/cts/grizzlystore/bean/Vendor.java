package com.cts.grizzlystore.bean;

public class Vendor {
	private String id;
	private String name;
	private float rating;
	private String contactNumber;
	private String address;
	
	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", rating=" + rating + ", contactNumber=" + contactNumber
				+ ", address=" + address + "]";
	}
	public Vendor(String id, String name, float rating, String contactNumber, String address) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
