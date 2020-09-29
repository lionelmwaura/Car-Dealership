package com.customer;

import com.customer.Address;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Address address;
	private String vId;
	
	public Customer() {
		
	}
	
	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getvId() {
		return vId;
	}

	public void setvId(String vId) {
		this.vId = vId;
	}
	
	
}
