package org.javaturk.oop.ch09.shadowing;

public class Child extends Parent {
	int i = 6;
	
//	@Override
	
	public void f() {
		System.out.println("f() in Child");
	}
	
//	@Override
	public static void g(){
		System.out.println("g() in Child");
	}

	public void printInfo() {
		System.out.println("\nInfo: ");
		System.out.println(i);
		System.out.println(super.i);
	}
}
