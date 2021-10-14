
package org.javaturk.oop.ch03;

import org.javaturk.oop.ch02.Car;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class PrimitiveAndReferenceVariables {

	public static void main(String[] args) {

		// First primitive variables
		int i = 5;
		int j = i;
		i = 7;
		System.out.println("i: " + i + " \t " + " j: " + j);

		// Then reference variables
		Car car1 = new Car();
		car1.make = "Mercedes";
		car1.model = "C200";
		car1.year = "2015";
		car1.distance = 0;
		car1.speed = 0;
		System.out.println("car1:   " + car1.getInfo());
		
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "i8";
		car2.year = "2016";
		car2.distance = 10000;
		car2.speed = 160;
		System.out.println("car2:   " + car2.getInfo());
		
		Car tmpCar = car1;
		car1 = car2;
		car2 = tmpCar;
		
		System.out.println("\ncar1:   " + car1.getInfo());
		System.out.println("car2:   " + car2.getInfo());
		System.out.println("tmpCar: " + tmpCar.getInfo());
		
		car2.accelerate(180);
		car2.go(25);
		
		System.out.println("\ncar2:   " + car2.getInfo());
		System.out.println("tmpCar: " + tmpCar.getInfo());
		
		tmpCar.go(50);
		tmpCar.stop();
		
		System.out.println("\ncar2:   " + car2.getInfo());
		System.out.println("tmpCar: " + tmpCar.getInfo());
	}
}
