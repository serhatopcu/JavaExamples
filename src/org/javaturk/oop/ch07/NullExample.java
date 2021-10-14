/**
 * 
 */
package org.javaturk.oop.ch07;

import org.javaturk.oop.ch09.factories.factory3.Director;

/**
 * @author akin
 *
 */
public class NullExample {

	public static void main(String[] args) {
		System.out.println("Getting a director.");
		Director d = getMeADirector();
		if(d != null)
			d.calculateSalary();
	}
	
	public static Director getMeADirector(){
		Director d = null;
		return d;
	}

}
