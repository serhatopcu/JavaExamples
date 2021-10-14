package org.javaturk.oop.ch03;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class BinaryOctalHexadecimalDemo {

	public static void main(String[] args) {

		int sayi1 = 0b1010;
		int sayi2 = 0132;
		int sayi3 = 0x5a;

		System.out.println(sayi1 + " " + sayi2 + " " + sayi3);
		
		int sayi4 = sayi1 + sayi2 + sayi3;
		int sayi5 = sayi1 * sayi2 * sayi3;;
		
		System.out.println(sayi4);
		System.out.println(sayi5);
		
		Integer anInt = Integer.decode("8");
		
		System.out.println(anInt);
	}
}
