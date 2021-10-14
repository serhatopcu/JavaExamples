package org.javaturk.oop.ch05;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		double random = Math.random();
		System.out.println("random: " + random);
		String para = random > 0.5 ? "Tura" : "Yazı";
		System.out.println(para);
		
		if(random > 0.5)
			para = "Tura";
		else
			para = "Yazı";
		System.out.println(para);
		
		int x = 5;
		int y = 2;
		
		int bigger = x > y ? x : y;
		
		System.out.println(bigger);
	}
}
