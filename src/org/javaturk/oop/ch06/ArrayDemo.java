/* Ch 7
 * ArrayExample.java
 */

package org.javaturk.oop.ch06;

import java.util.Random;

public class ArrayDemo {

	int[] intArray = new int[10];
	Pizza[] pizzas = new Pizza[3];
	boolean[] flags = { true, false };

	public ArrayDemo() {
		System.out.println("Pizzas: " + pizzas[0] + " " + pizzas[1] + " " + pizzas[2]);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		
		System.out.println("\nInitializing Arrays");
		
		Random r = new Random();
		for (int i = 0; i < intArray.length; i++) {
			int randomInt = r.nextInt();
			int sayi = randomInt % 100;
			intArray[i] = sayi;
		}

		// foreach
		// Following does not initialize intArray's cells!
//		 for(int a:intArray){
//			 Random r = new Random();
//			 int randomInt = r.nextInt();
//			 int sayi = randomInt % 100;
//			 a = sayi;
//		 }

		pizzas[0] = new Pizza("Peynirli");
		pizzas[1] = new Pizza("Sucuklu");
		pizzas[2] = new Pizza("Sebzeli");

	}

	public static void main(String args[]) {
		(new ArrayDemo()).print();
	}

	public void print() {
		System.out.println("Fifth element of intArray is " + intArray[5]);
		System.out.println("First element of flags is " + flags[0]);
		System.out.println("Name of the last element of pizzalar is " + pizzas[2].name);

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
//		foreach
		for(int a : intArray)
			System.out.print(a + " ");
//		
		System.out.println();
//		
		int sum = 0;
		for(int a:intArray)	sum += a;
//			
		System.out.println("Sum: " + sum);
		
		// Negative array size is not ok!
		int arrayLength = -5;
		short[] shorty = new short[arrayLength];
		
//		long index can't be used
//		long l = 5;
//		Pizza pizza = pizzas[l]; 
		
//		Negative index causes ArrayIndexOutOfBoundsException
		int i = 5;
		Pizza pizza1 = null;
		if(i < pizzas.length)
			pizza1 = pizzas[i];
		
		short s = 2;
		Pizza pizza2 = pizzas[s];
		System.out.println(pizza2.name);
	}
}

class Pizza {
	String name;

	Pizza(String name) {
		this.name = name;
	}
}
