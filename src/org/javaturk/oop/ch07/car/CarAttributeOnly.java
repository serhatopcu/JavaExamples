package org.javaturk.oop.ch07.car;

/**
 * That's a attribute-only car. It does not have any behavior, it has only attributes.
 * @author akin
 *
 */
public class CarAttributeOnly {
	String make;
	String model;
	String year;
	int speed;
	int distance;
	
	public static void main(String[] args) {
				
		CarAttributeOnly myCar = new CarAttributeOnly();
		System.out.println("My Car: " + myCar.year + " " + myCar.make + " " + myCar.model + " " +  myCar.speed  + " " + myCar.distance);
		
		myCar.make = "Mercedes";
		myCar.model = "E200";
		myCar.year = "2011";
		myCar.speed = 80;
		myCar.distance = 30000;	

		System.out.println("My Car: " + myCar.year + " " + myCar.make + " " + myCar.model + " " +  myCar.speed  + " " + myCar.distance);
		
		CarAttributeOnly yourCar = new CarAttributeOnly();
		yourCar.make = "Toyota";
		yourCar.model = "Camry";
		yourCar.year = "2011";
		yourCar.speed = 0;
		yourCar.distance = 0;
		System.out.println("Your Car: " + yourCar.year + " " + yourCar.make + " " + yourCar.model + " " +  yourCar.speed  + " " + yourCar.distance);

		//Following shows the difference between a reference and an object.	
		CarAttributeOnly tmpCar = myCar;
		myCar = yourCar;
		yourCar = tmpCar;
		System.out.println("My Car: " + myCar.year + " " + myCar.make + " " + myCar.model);
		System.out.println("Your Car: " + yourCar.year + " " + yourCar.make + " " + yourCar.model);
	}
}
