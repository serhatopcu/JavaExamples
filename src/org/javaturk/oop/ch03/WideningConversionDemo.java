
package org.javaturk.oop.ch03;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class WideningConversionDemo {

	public static void main(String args[]) {
		byte b = 126;
		short s = 1000;
		char c = 65;
		int i = 2_147_483_647;
		long l;
		float f = 3.14f;
		double d;
		/*
		 * c = b; // compile error: possible loss of precision c = s; // compile
		 * error: possible loss of precision i = d; // compile error: possible
		 * loss of precision
		 */
		s = b;
		l = i;
		// Loss of precision
		f = i;
		System.out.println("i: " + i + " f: " + f);

		l = (long)i + 1;
		System.out.println("i: " + i + " l: " + l);
		System.out.println();
		// Loss of precision
		l = 987_654_321_123_456_789L;
		f = l;
		System.out.println("l: " + l + " f: " + f);
		
		d = l;
		System.out.println("l: " + l + " d: " + d);

		d = f;
		i = c;
		d = i;
	}
}
