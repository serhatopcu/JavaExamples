package org.javaturk.oop.ch02;

/**
 * Bu basit bir araba sınıfı örneğidir.
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.academy">http://www.selsoft.academy</a>
 *      </p>  
 */
public class Car  extends Object{

	public String make;
	public String model;
	public String year;
	public int speed;
	public int distance;

	public void go(int newDistance) {
		distance += newDistance;
	}

	public void accelerate(int newSpeed) {
		speed = newSpeed;
		int i = 5;
		System.out.println(i);
	}

	public void stop() {
		speed = 0;
	}

	public String getInfo() {
		return "Car Info: " + year + " " + make + " " + model + ". Distance: " + distance + " km. and traveling at " + speed + " kmph.";
	}
}
