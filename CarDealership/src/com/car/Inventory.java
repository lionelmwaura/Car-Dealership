package com.car;

import java.util.ArrayList;

public class Inventory {
	
	private ArrayList<Car> cars;
	
	public Inventory(ArrayList<Car> cars) {
		// create car inventory
		//Camry:
		Camry camry1 = new Camry(4, 32000, 2020, "2020-01-24", false, "Red", "Sedan", "312488", 0);
		cars.add(camry1);
							
		Camry camry2 = new Camry(2300, 24200, 2018, "2020-06-23", false, "Blue", "Sedan", "312489", 0);
		cars.add(camry2);
							
		Camry camry3 = new Camry(13400, 16320, 2016, "2020-03-18", false, "Gray", "Sedan", "312490", 0);
		cars.add(camry3);
							
		//Corolla:
		Corolla corolla1 = new Corolla( 13, 19300, 2020, "2020-01-24", false, "White", "Hatchback", "217003", 0);
		cars.add(corolla1);
							
		Corolla corolla2 = new Corolla( 24, 19600, 2021, "2020-05-10", false, "Gray", "Com-Sedan", "217004", 0);
		cars.add(corolla2);
							
		Corolla corolla3 = new Corolla( 23453, 13200, 2017, "2020-02-03", false, "Black", "Com-Sedan", "217005", 0);
		cars.add(corolla3);
		
		this.cars = cars;
	}

	public ArrayList<Car> getCars() {
		return cars;
	}
	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}
	
	
	
	

}
