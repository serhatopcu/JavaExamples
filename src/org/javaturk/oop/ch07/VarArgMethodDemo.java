
package org.javaturk.oop.ch07;

public class VarArgMethodDemo {

	public static void main(String ... args) {

		calculateAverage(4, 3);
		calculateAverage(4, 3, 8);

		int a[] = { 15, 25, 35, 45, 55, 65 };
		calculateAverageWithArray(a);

		int b[] = { 15, 25, 35, 45, 55, 65, 75, 86 };
		calculateAverageWithArray(b);

		average(1);
		average(1, 2, 3, 4);
		average(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		average(0xAB);

		anotherAverage(2, true, 3, 4, 5);
	}

	public static void calculateAverage(int x, int y) {
		System.out.println("Average: " + (double) (x + y) / 2);
	}

	public static void calculateAverage(int x, int y, int z) {
		System.out.println("Average: " + (double) (x + y + z) / 2);
	}

	public static void calculateAverageWithArray(int[] array) {
		int sum = 0;
		int i = 0;
		for (int x : array) {
			sum += x;
			i++;
		}

		System.out.println("Average: " + (double) sum / i);
	}

	public static void average(int ... array) {
		int sum = 0;
		int i = 0;
		for (int x : array) {
			sum += x;
			i++;
		}

		System.out.println("Average: " + (double) sum / i);
	}

	public static void anotherAverage(int y, boolean b, int... array) {
		int sum = 0;
		int i = 0;
		if (b)
			for (int x : array) {
				sum += x;
				i++;
			}

		System.out.println("Average: " + (double) sum / i);
		System.out.println("y: " + y);
	}

	// public static void wrongAverage1(int... array, int y, boolean b,) {
	
	// }

//	public static void wrongAverage2(int... intArray, boolean... booleanArray) {
//
//	}
}
