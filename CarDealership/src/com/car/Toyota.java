package com.car;

import java.util.Date;

public abstract class Toyota extends Car {
	
	public Toyota(String model, int miles, double price, int year, String inDate, boolean bought, String color, String carType, String vId, double bid) {
		super("Toyota", model, miles, price, year, inDate, bought, color, carType,vId,bid);
	}
	
}
