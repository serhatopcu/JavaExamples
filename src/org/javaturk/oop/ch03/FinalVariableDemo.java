package org.javaturk.oop.ch03;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class FinalVariableDemo {
	// static final int z;

	public static void main(String[] args) {

		final int i = 8;
		System.out.println(i);

		// Illegal
		// i = 7;
		// i++;

		// Following is not illegal
		final long l; // Blank final

		l = 7;
		
//		l = 8; // That's illegal
		System.out.println(l);
		
//		f();
	}

	public static void f() {
		int x = 3;
		int y = 8;
		final int i;

		if (x > y)
			i = 9;
		else
			i = 11;

		System.out.println(i);
	}
}
