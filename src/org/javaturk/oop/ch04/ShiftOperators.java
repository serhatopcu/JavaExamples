/* 
 * ShiftOperators.java
 * 
 * This example shows the shift operators.
 */

package org.javaturk.oop.ch04;

public class ShiftOperators {
    
    public static void main(String[] args) {
        int i = 512;
        i = i >> 1;
        System.out.println(i);	// 256
        
        i = i >> 3;
        System.out.println(i);	// 32
        
        i = i << 5;
        System.out.println(i);	// 1024
        
        i = 512;
        
        i = i >>> 1;
        System.out.println("i >>> 1: " + i);
        
        i = -3;
        i = i << 3;
        System.out.println(i);
        
        i = i << 5;
        System.out.println(i);
        
        i = i >>> 8;
        System.out.println(i);
        
        long l1 = 9;
        l1 = l1 >> 2;
        System.out.println(l1);
    }
}
