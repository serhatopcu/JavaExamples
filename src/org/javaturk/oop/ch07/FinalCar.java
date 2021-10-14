package org.javaturk.oop.ch07;

public class FinalCar {
//	If not initialized here it must be in constructor
	final String make; // blank final
	String model;
	String year;
	int speed;
	int distance;
	String owner;
	
//	Remove the initialization of variable make, following constructor will give
//	a compile-time error.
	public FinalCar(String make, String model, String year, int speed, int distance) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.speed = speed;
		this.distance = distance;
	}
	
	public FinalCar(String model, String year) {
		make = "Mercedes";
		this.model = model;
		this.year = year;
		speed = 0;
		distance = 0;
	}
	
	// final parameter
	public void speedUp(final int newSpeed){
//		Can't do that
//		newSpeed = 75;
		speed = newSpeed;
	}
	
	public void setOwner(final String newOwner){
//		Can't do that
//		newOwner = "Selim Soylu";
		owner = newOwner;
	}

	public static void main(String[] args) {
//		FinalCar is a final reference
		final FinalCar finalCar; //= new FinalCar("CLK200", "2011", 0, 0);
		
//		Can do this only if finalCar is not defined above!
		finalCar = new FinalCar("Mercedes", "CLK200", "2011", 0, 0);
		
//		finalCar = new FinalCar("BMW", "i8", "2011", 0, 0);
		
//		Can't do this.
//		finalCar.make = " Murat 124";
		
//		Can't do this
//		finalCar = new FinalCar("CLK200", "2011", 0, 0);
		finalCar.speed = 120;

//		Doable
		final int i;
		i = 6;
//		i = 9;
		
		finalCar.speedUp(100);
		
//		finalCar = null;

	}
}
