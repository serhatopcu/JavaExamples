
package org.javaturk.oop.ch03;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class NarrowingConversionDemo {

	public static void main(String args[]) {
		byte b = 0;
		short s = 1000;
		char c;
		int i = -100;
		long l = 10_000_000_000l;
		float f = 65.999_999f;
		double d = 3.14_353_459_485_483d;

		// b = s; // compile error: possible loss of precision
		// c = i; // compile error: possible loss of precision
		// f = d; // compile error: possible loss of precision
		// System.out.println(f);

		b = (byte) s;
		System.out.println("s: " + s + "\t\tb: " + b);
		i = (int) l; 	// Loss of info
		System.out.println("l: " + l + "\t\ti: " + i);
		i = (int) f;  	// Loss of floting point info
		System.out.println("f: " + f + "\t\ti: " + i);
		l = (long) f;	// Loss of floting point info
		System.out.println("f: " + f + "\t\tl: " + l);
		f = (float) d;	// Loss of info
		System.out.println("d: " + d + "\t\tf: " + f);
		
		i= 65;
		c = (char) i;
		System.out.println("i: " + i + "\t\tc: " + c);
		i= -i;
		c = (char) i;  // Problem!
		System.out.println("i: " + i + "\t\tc: " + c);
		
//		byte b1 = -8;
//		char c1 = b1;
		
		i = (int) d;
		System.out.println("i: " + i + "\t\td: " + d);
	}
}
