package org.javaturk.oop.ch03;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class TurkceKarakterlerDemo {
	public static void main(String[] args) {
		int ı = 8;
		int ğ = 3;

		double ş = şunuHesaplaBakalım(ı, ğ);
		System.out.println("Toplam fiyat: " + ş + '\u20BA');
	}

	public static double şunuHesaplaBakalım(int ö, int ü) {
		int ı = ö + ü;
		double j = ö - ü;
		return ı * j;
	}
}
