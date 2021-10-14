package org.javaturk.oop.ch03;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class StringDemo {

	public static void main(String[] args) {

		String s1 = new String("http://www.JavaTurk.org"); 	// s1 => "http://www.JavaTurk.org"
		String s2 = new String("http://java.sun.com");		// s2 => "http://java.sun.com"

		System.out.println("s1: " + s1 + " \t " + "s2: " + s2);
		String tmp = s1;		// tmp => "http://www.JavaTurk.org", There are two references to "http://www.JavaTurk.org"
		s1 = s2;				// s1  => "http://java.sun.com", There are two references to "http://java.sun.com", only one ref to "http://www.JavaTurk.org"
		s2 = tmp;			// s2 => "http://www.JavaTurk.org", There are two references to "http://www.JavaTurk.org", only one ref to "http://java.sun.com"
		System.out.println("s1: " + s1 + " \t " + "s2: " + s2);
		
		System.out.println("s1: " + s1 + " \t " + "tmp: " + tmp + " \t " + " s2: " + s2);
		
		// String objects can not be changed! Each change creates a new String object with the new value!
		String s3 = s2.concat("XYZ");
		System.out.println("s2: " + s2 + " \t " + "s3: " + s3);
		
		// Null references
		System.out.println("s1 starts with: " + s1.charAt(0));
		s1 = null;
		System.out.println("s1: " + s1);  // "http://java.sun.com" object can't be reached anymore!
		if(s1 != null)	System.out.println("s1 starts with: " + s1.charAt(0));
		
		// New objects with the same type can be assigned.
		s1 = new String("www.oracle.com/technetwork/java/index.html");
		System.out.println("s1: " + s1);
		System.out.println("s1 starts with: " + s1.charAt(0));
	}
}
