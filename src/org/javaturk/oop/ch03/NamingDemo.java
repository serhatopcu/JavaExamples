
package org.javaturk.oop.ch03;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class NamingDemo {
	private int anIntegerVariable; 
	private double aDoubleVariable;

	public static void main(String[] args) {
		NamingDemo namingDemo = new NamingDemo();
		namingDemo.anIntegerVariable = 95;
		namingDemo.aDoubleVariable = 0.33;
		namingDemo.aSimpleMethod(2, 5);
		namingDemo.anotherSimpleMethod(8, 4, false);
	}
	
	public void aSimpleMethod(int aParameter, int anotherParameter){
		System.out.println("in aSimpleMethod(int aParameter, int anotherParameter)");
	}
	
	public void anotherSimpleMethod(int aParameter, long anotherParameter, boolean yetAnotherParameter){
		System.out.println("in anotherSimpleMethod(int aParameter, long anotherParameter, boolean yetAnotherParameter)");
	}
}
