package org.javaturk.oop.ch02;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class CarTest {

	public static void main(String[] args) {

		Car car1 = new Car();
		System.out.println(car1.getInfo());

		car1.make = "Mercedes";
		car1.model = "C200";
		car1.year = "2016";
		car1.distance = 0;
		car1.speed = 0;
		System.out.println(car1.getInfo());
		System.out.println();

		car1.accelerate(125);
		car1.go(100);
		car1.go(50);
		System.out.println(car1.getInfo());

		System.out.println();

		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "i8";
		car2.year = "2016";
		car2.distance = 10000;
		car2.speed = 160;
		System.out.println(car2.getInfo());

		car2.accelerate(220);
		car2.go(150);
		System.out.println(car2.getInfo());
	}
}
