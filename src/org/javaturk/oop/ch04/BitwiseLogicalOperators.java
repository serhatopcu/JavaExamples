package org.javaturk.oop.ch04;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>
 *      This is an example that shows bitwise logical operators.
 */
public class BitwiseLogicalOperators {

	public static void main(String[] args) {
		int i = 4;
		int j = 8;
		
		int k = i & j;
		System.out.println(k);
		
		k = i | j;
		System.out.println(k);
		
		k = i ^ j;
		System.out.println(k);
		
		long u = 6;
		long v = 2;
//		int w = (int) (u & v);
		long w = u & v;
		System.out.println(w);
		
		byte m = 6;
		byte n = 2;
		byte l = (byte) (m & n);
		System.out.println(l);
		
		System.out.println(~l);
	}
}
