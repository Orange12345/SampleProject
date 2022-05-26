package com.local.comparator;

public class Address implements Comparable<Address>{
	private int id;
	private String streetAddress;
	
	
	public Address(int id, String streetAddress) {
		super();
		this.id = id;
		this.streetAddress = streetAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	@Override
	public int compareTo(Address o) {
		// TODO Auto-generated method stub
		return this.getStreetAddress().compareTo(o.getStreetAddress());
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", streetAddress=" + streetAddress + "]";
	}
	
}
