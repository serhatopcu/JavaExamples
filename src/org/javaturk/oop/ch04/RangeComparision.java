
package org.javaturk.oop.ch04;

/**
 * @author akin
 *
 */
public class RangeComparision {

	public static void main(String[] args) {
		int i = 5;

		// boolean b = 3 < i < 7; // Illegal!

		boolean b = (3 < i) & (i < 7);

		System.out.println(b);

	}
}
