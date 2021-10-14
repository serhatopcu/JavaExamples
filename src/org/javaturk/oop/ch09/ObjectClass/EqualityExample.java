package org.javaturk.oop.ch09.ObjectClass;

public class EqualityExample {

	public static void main(String[] args) {

		Product p1 = new Product(11, "Kanepe", 171.0);
		Product p2 = new Product(11, "Kanepe", 169.99);
		
		boolean b = p1 == p2;
		if (b)
			System.out.println("The same");
		else
			System.out.println("Different");
		
		b = p1.equals(p2);
		
		if (b)
			System.out.println("The same");
		else
			System.out.println("Different");
		
		b = p2.equals(p1);
		if (b)
			System.out.println("The same");
		else
			System.out.println("Different");
	}
}
