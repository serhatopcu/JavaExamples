
package org.javaturk.oop.ch04;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>
 *      This is an example about conditional operators.
 */
public class ConditionalOperators {

	public static void main(String args[]) {

		boolean b1 = true;
		boolean b2 = true;
		boolean b3 = b1 & b2;
		boolean b4 = b1 | b2;
		boolean b5 = b1 ^ b2;

		System.out.println("b1 & b2: " + b3);
		System.out.println("b1 | b2: " + b4);
		System.out.println("b1 ^ b2: " + b5);
		System.out.println("!b1: " + !b1);

		System.out.println();

		if ((getOne() == 7) & (getTwo() == 2)) {
			System.out.println("value1 is 7 AND value2 is 2");
		}

		if ((getOne() == 8) | (getTwo() == 1)) {
			System.out.println("value1 is 8 OR value2 is 1");
		}
	}

	public static int getOne() {
		System.out.println("In getOne()");
		return 8;
	}

	public static int getTwo() {
		System.out.println("In getTwo()");
		return 9;
	}
}
