package org.javaturk.oop.ch04;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>
 *      This is an example taken from Java Tutorial of Oracle.
 */
class Bottles {
	static void printSong(Object stuff, int n) {
		String plural = (n == 1) ? "" : "s";
		loop: while (true) {
			System.out.println(n + " bottle" + plural + " of " + stuff + " on the wall,");
			System.out.println(n + " bottle" + plural + " of " + stuff + ";");
			System.out.println("You take one down " + "and pass it around:");
			--n;
			plural = (n == 1) ? "" : "s";
			if (n == 0)
				break loop;
			System.out.println(n + " bottle" + plural + " of " + stuff + " on the wall!");
			System.out.println();
		}
		System.out.println("No bottles of " + stuff + " on the wall!");
	}

	public static void main(String[] args) {
		printSong("slime", 3);
	}
}
