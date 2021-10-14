package org.javaturk.oop.ch04;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>
 *      This is an example about conversion that take place with unary operators.
 */
public class UnaryConversions {

	public static void main(String[] args) {
//		Unary conversions
		byte b = 3;
		b = (byte) +b;
		b = (byte) +b;		// Unary conversion
		b = (byte) -b;		// Unary conversion
		b = (byte) ~b;		// Unary conversion
		
//		Binary conversions
//		byte c = b >>> b;
		byte c = (byte) (b >>> b);
	}
}
