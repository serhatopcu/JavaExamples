package org.javaturk.oop.ch07;

public class Overloading {
	
	public void calculateExp(int base, int exp){
		System.out.println("calculateExp(int base, int exp)");
		double result = Math.pow(base, exp);
		System.out.println(base + "" + exp + " = " + result);
	}
	
	public void calculateExp(double base, int exp){
		System.out.println("calculateExp(double base, int exp)");
		double result = Math.pow(base, exp);
		System.out.println(base + "" + exp + " = " + result);
	}
	
//  Can't overload over return type!	
//	public double calculateExp(double base, int exp){
//		System.out.println("calculateExp(double base, int exp)");
//		double result = Math.pow(base, exp);
//		System.out.println(base + "" + exp + " = " + result);
//	}

	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.calculateExp(5, 7);
		o.calculateExp(5d, 7);
	}

}
