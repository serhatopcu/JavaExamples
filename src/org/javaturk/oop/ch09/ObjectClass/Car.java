package org.javaturk.oop.ch09.ObjectClass;

class Car {
	int year;
	String brand;
	String model;
	int power;

	public Car(int year, String brand, String model, int power) {
		super();
		this.year = year;
		this.brand = brand;
		this.model = model;
		this.power = power;
	}

	/**
	 * @author akin
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [year=" + year + ", brand=" + brand + ", model=" + model + ", power=" + power + "]";
	}

//	/**
//	 * @author akin
//	 * @return
//	 * @see java.lang.Object#toString()
//	 */
//	@Override
//	public String toString() {
//		return "Car [year=" + year + ", brand=" + brand + ", model=" + model + ", power=" + power + "]";
//	}

//	@Override
//	public String toString() {
//		String s = new String();
//		s += "Car Info\n";
//		s += "Year: " + year + "\n";
//		s += "Brand: " + brand + "\n";
//		s += "Model: " + model + "\n";
//		s += "Power: " + power + " HP \n";
//		return s;
//	}
	
	
}