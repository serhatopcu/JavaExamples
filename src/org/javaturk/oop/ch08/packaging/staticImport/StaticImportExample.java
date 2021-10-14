
package org.javaturk.oop.ch08.packaging.staticImport;

import static org.javaturk.oop.ch08.packaging.staticImport.AClass.A_CONSTANT;
import static org.javaturk.oop.ch08.packaging.staticImport.AClass.aStaticVariable;
import static org.javaturk.oop.ch08.packaging.staticImport.AClass.aStaticMethod;

import static java.lang.Math.*;
import static java.lang.Math.pow;

public class StaticImportExample {

	public static void main(String[] args) {
		System.out.println(A_CONSTANT);
		System.out.println(aStaticVariable);
		aStaticMethod();
		
		System.out.println(PI);
		System.out.println(pow(2,10));
	}
}
