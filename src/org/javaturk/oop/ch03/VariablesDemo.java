package org.javaturk.oop.ch03;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class VariablesDemo {

	public static void main(String[] args) {

		// Declaring a variable
		int i;
		boolean b;
		String s1;
		
		// Do not use a variable before defining it!
//		 System.out.println(i + " " + b + " " + s1);

		// Initializing a variable
		i = 8;
		b = false;
		s1 = "JavaTurk.org";

		// After they are defined and we can use them.
		System.out.println(i + " " + b + " " + s1);

		// Defining a variable
		int j = 18;
		float sin30 = 0.6f;
		String s2 = new String("Selam :)");
		System.out.println(j + " " + sin30 + " " + s2);
	}
}
