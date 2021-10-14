/**
 * 
 */
package org.javaturk.oop.ch03;

import java.math.BigDecimal;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class FloatingPointDemo {

	public static void main(String[] args) {
		doFPCalculation();
	}
	
	public static void doFPCalculation(){
		System.out.println("in doFPCalculation()");

		float fSum6 = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		System.out.println("fSum6: " + fSum6);
		
		float fSum7 = fSum6 + 0.1f;
		System.out.println("fSum7: " + fSum7);
		
		float fSum8 = fSum7 + 0.1f;
		System.out.println("fSum8: " + fSum8);
		
		float fSum9 = fSum8 + 0.1f;
		System.out.println("fSum9: " + fSum9);
		
		float fSum10 = fSum9 + 0.1f;
		System.out.println("fSum10: " + fSum10);
		
		float f20 = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		System.out.println("0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f = " + f20);
		
		float floatSum = 0.0f;

		for (int i = 0; i < 100; i++) {
			floatSum = floatSum + 0.1f;
		}

		System.out.println("floatSum:  " + floatSum);
		
		System.out.println();
		
		double d20 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		System.out.println("0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 = " + d20);
		
		double doubleSum = 0.0d;

		for (int i = 0; i < 100; i++) {
			doubleSum = doubleSum + 0.1;
		}

		System.out.println("doubleSum: " + doubleSum);
		System.out.println();
	}
	
	public static void doBigDecimalCalculation(){
		System.out.println("in doBigDecimalCalculation()");
		BigDecimal bd1 = new BigDecimal(0.9f);
		BigDecimal bd2 = new BigDecimal(0.1f);
		BigDecimal bd3 = bd1.add(bd2);
		System.out.println("BigDecimal bd3: " + bd3);
		
		BigDecimal bdSum = new BigDecimal(0);

		for (int i = 0; i < 100; i++) {
			bdSum = bdSum.add(new BigDecimal(0.1f));
		}

		System.out.println("bdSum:  " + bdSum);
	}

}
