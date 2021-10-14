package org.javaturk.oop.ch03;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class ScopeDemo {
	// Instance variable
	private int i = 1;

	public static void main(String[] args) {

		int i = 0;
		System.out.println(i);
		// int i = 2;  // Duplicated variable
		// int ii;
		for (; i < 5; i++) {
			System.out.println(i);
			if (i < 3) {
				// Can't say this.
//				 int i = 4;
				int ii = 3;
				int a;
				f(ii);
			} else if (3 < i & i < 12) {
				int ii = 8;
				f(ii);
			} else {
				int ii = 17;
				f(ii);
			}
		}
	}

	public static void f(int i) {
		// Can't say this.
		// int i = 4;
		System.out.println(i);
	}
	
	public void f() {
		System.out.println(i);
	}

	public void ff() {
		int i = 6;
		System.out.println(this.i);
	}
}
