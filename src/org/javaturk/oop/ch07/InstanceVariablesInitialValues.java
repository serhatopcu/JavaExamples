package org.javaturk.oop.ch07;

public class InstanceVariablesInitialValues {
    boolean t;	// false
    char c;		// 0
    byte b;		// 0
    short s;		// 0
    int i;		// 0
    long l;		// 0L
    float f;		// 0.0F
    double d;	// 0.0D
    String str;	// null
    
    void print() {
        System.out.println(
        "Data type      Initial value\n" +
        "boolean        " + t + "\n" +
        "char           [" + c + "] "+ (int)c +"\n"+
        "byte           " + b + "\n" +
        "short          " + s + "\n" +
        "int            " + i + "\n" +
        "long           " + l + "\n" +
        "float          " + f + "\n" +
        "double         " + d + "\n" +
        "String         " + str);
    }
    
    public static void main(String[] args) {
    	
//    		int i;
//   		int k = i;
//    		System.out.println(i);
		
		InstanceVariablesInitialValues nesne = new InstanceVariablesInitialValues();
//		System.out.println(nesne.l);
		nesne.print();
	}
}
