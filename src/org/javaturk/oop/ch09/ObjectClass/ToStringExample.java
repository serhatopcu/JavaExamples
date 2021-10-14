package org.javaturk.oop.ch09.ObjectClass;

public class ToStringExample extends Object{

	public static void main(String[] args) {

		Car c1 = new Car(2012, "Mercedes", "CLK200", 450);
		
		System.out.println(c1);
		System.out.println(c1.toString());
		System.out.println(c1.hashCode());
		System.out.println(c1.getClass().getName());
		System.out.println(c1.getClass().getName() + '@' + Integer.toHexString(c1.hashCode()));

		System.out.println();
		Car c2 = new Car(2006, "Skoda", "Fabia", 70);
		System.out.println(c2);
	}
}
