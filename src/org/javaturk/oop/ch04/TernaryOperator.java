/* 
 * ConditionalOperators.java
 * 
 * This example shows conditional operators & and | and their shortcuts && and ||.
 * See the effects of shortcuts.
 */

package org.javaturk.oop.ch04;

public class TernaryOperator {

	public static void main(String args[]) {
		
		int i = 8;
		int j = 11;
		int min = (i <= j) ? i : j;
		System.out.println("Min: " + min);
		
		System.out.println(true ? "true" : "false" );
		System.out.println(false ? "true" : "false" );
		
		String string1 = "I love Java very much";
		String string2 = (string1.matches(".*Java.*")) ? string1 : "I love nothing";
		System.out.println(string2);
		
		if(string1.matches(".*Java.*"))
			string2 = string1;
		else
			string2 = "I love nothing";
		System.out.println(string2);
		
		string1 = "I love Javaaaa!";
		string2 = (string1 == "I love Javaaaa!") ? string1 : "I love nothing";

		System.out.println(string2);
		
//		(i<j) ? System.out.println(i) : System.out.println(j); // Can't do this.
	}
}
