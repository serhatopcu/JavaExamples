
package org.javaturk.oop.ch01;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>
 */
public class SelamTest {

	public static void main(String[] args) {
		Selam nesne = new Selam();
		String cevap = nesne.selamSoyle("Ali");
		System.out.println(cevap);
	}

}
