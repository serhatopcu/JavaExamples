package org.javaturk.oop.ch06;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo {
	
	int[] intArray = new int[20];
	Pizza[] pizzalar = new Pizza[3];
	boolean[] flags = { true, false };

	public ArraysDemo() {
		for (int i = 0; i < intArray.length; i++) {
			Random r = new Random();
			int randomInt = r.nextInt();
			int sayi = randomInt % 100;
			intArray[i] = sayi;
		}
		
		System.out.print("Original array: ");
		prt(intArray);

		pizzalar[0] = new Pizza("Peynirli");
		pizzalar[1] = new Pizza("Sucuklu");
		pizzalar[2] = new Pizza("Sebzeli");
	}

	public static void main(String args[]) {
		ArraysDemo demo = new ArraysDemo();
//		demo.copy();
//		demo.copyRange();
		demo.sort();
//		demo.search(5);
//		demo.fill(11);
	}

	public void copy() {
		System.out.println("\nCopying the array: ");
		int[] copy1 = Arrays.copyOf(intArray, intArray.length);
		prt(copy1);
		
		int[] copy2 = Arrays.copyOf(intArray, 5);
		prt(copy2);
	}

	public void copyRange() {
		System.out.println("\nCopying the range of the array: ");
		int[] copy = Arrays.copyOfRange(intArray, 5, 25);
		prt(copy);
	}

	public void search(int key) {
		System.out.println("\nSearching " + key + " in an array");
		intArray[10] = 5;
		// Searching an array
		Arrays.sort(intArray);
		int index = Arrays.binarySearch(intArray, key);
		System.out.println("Index of " + key + ": " + index);
	}

	public void fill(int key) {
		System.out.println("\nFilling an array with " + key);
		// Filling an array
		Arrays.fill(intArray, key);
		prt(intArray);
	}

	public void sort() {
		System.out.print("\nSorting an array: ");
		Arrays.sort(intArray);
		prt(intArray);
	}

	public void prt(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
	}
}
