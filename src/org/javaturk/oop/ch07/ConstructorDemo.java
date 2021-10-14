package org.javaturk.oop.ch07;

import java.util.Date;

public class ConstructorDemo {
	private Date date;
	
	public ConstructorDemo(){
		this.date = new Date();
	}
	
	
	public void ConstructorDemo(){
		System.out.println("Demo date: " + date);
	}
	
	public static void main(String[] args) {
		ConstructorDemo demo = new ConstructorDemo();
		demo.ConstructorDemo();
	}
}
