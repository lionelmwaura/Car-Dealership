package com.car;

import java.util.ArrayList;
import java.util.Date;

public abstract class Car {

	//Variables needed to create a car 
	protected String model;
	protected String make;
	protected int miles;
	protected double price;
	protected int year;
	protected String inDate;
	protected boolean bought;
	protected String color;
	protected String carType;
	private String vId;
	private double bid;
	
	public Car(String make, String model, int miles, double price, int year, String inDate, boolean bought, String color, String carType, String vId, double bid) {
		this.bought = bought;
		this.inDate = inDate;
		this.make = make;
		this.miles = miles;
		this.model = model;
		this.price = price;
		this.year = year;
		this.color = color;
		this.carType = carType;
		this.vId = vId;
		this.bid = bid;
		
	}
	
	//Getters
	public String getModel() {
		return model;
	}
	public String getMake() {
		return make;
	}
	public int getMiles() {
		return miles;
	}
	public double getPrice() {
		return price;
	}
	public int getYear() {
		return year;
	}
	public String getInDate() {
		return inDate;
	}
	public boolean isBought() {
		return bought;
	}
	public String getColor() {
		return color;
	}
	public  String getCarType() {
		return carType;
	}
	public String getvId() {
		return vId;
	}
	public double getBid() {
		return bid;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	public void setBought(boolean bought) {
		this.bought = bought;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public void setvId(String vId) {
		this.vId = vId;
	}

	public void setBid(double bid) {
		this.bid = bid;
	}

	
	
}
