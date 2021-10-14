
package org.javaturk.oop.ch05.algorithm;

import java.util.Scanner;


public class FactorialExampleByRecursion {
	
	static long factorial = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer number to calculate its factorial:");
		int number = sc.nextInt();
		if (number < 0) {
			System.out.println("Number must be a positive integer.");
		} else if (number == 0 || number == 0) {
			System.out.println("Factorial of " + number + " is " + 1);
		} else {
			long factorial = calculateFactorial(number);
			if (factorial < 0)
				System.out.println("Factorial of " + number + " is out of range!");
			else
				System.out.println("Factorial of " + number + " is " + factorial);
		}
	}
	
	public static long calculateFactorial(int n){
		if (n == 1)
			factorial = 1;
		else
			factorial = n * calculateFactorial(n-1);
		return factorial;
	}
}
