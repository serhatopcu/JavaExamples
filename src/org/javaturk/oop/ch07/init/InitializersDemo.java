package org.javaturk.oop.ch07.init;

public class InitializersDemo {

	int minAge = 18;
	static double percentage = 5.8;
	boolean isOpen = isDoorOpen();
	
//	No forward references!
//	int ii = j;
//	AA a = new AA(j);
//	int j = 8;
	
//	But following is ok and it may cause a inconsistent state
	
	int i = getJ();   // i = 0;
	{
		System.out.println("In initialization block.");
		System.out.println("i: " + i);
	}
	int j = 8;
	
//	getPi must also be static
	static double pi = getPi();
	
	// For finals, init can be done in a init blok.
	final int f;
	{
		f = 100;
	}

	public static void main(String[] args) {
		InitializersDemo  demo = new InitializersDemo();
		System.out.println("i: " + demo.i);
		System.out.println("j: " + demo.j);
		System.out.println("isOpen: " + demo.isOpen);
		System.out.println("Pi: " + pi);
	}

	private static double getPi() {
		return Math.PI;
	}

	private boolean isDoorOpen() {
		return true;
	}
	
	public int getJ(){
		return j;
	}
}

class AA {
	public AA(int i){}
}
