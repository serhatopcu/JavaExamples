package org.javaturk.oop.ch07.memory;

import java.util.*;

import javax.swing.JOptionPane;
//http://www.oracle.com/technetwork/java/javase/tech/vmoptions-jsp-140102.html
/**
 * Run with -XX:+PrintGC flag to see GC invocations.
 */
public class HeapDemo2 {
	static final int MB = 1024 * 1024;
	
	private static List list = new ArrayList();
	
	public static void main(String[] args) {
		System.out.println("At the beginning.");
		getMemory(0);
		
		String countString = JOptionPane.showInputDialog("Enter number of objects:");
		long objectCount = Long.parseLong(countString);
		
		for (long i = 1; i <= objectCount; i++) {
			Person person = new Person("TCKN"+i, "Akin"+i, "Kaldiroglu"+i, "Address"+i, "Phone"+i, "CellPhone"+i);
			Car car = new Car("Turkey"+i, "Personal car"+i, "Mercedes"+i, "CLK200"+i, "2012"+i, i, i, person);
			list.add(car);
			if(i%1000000 == 0)
				getMemory(i);
		}
		System.out.println("Done!");
	}
	
	public static void getMemory(long i){
		System.out.println("Object count: " + (2 * i));
		long heapSize = Runtime.getRuntime().totalMemory();
		System.out.println("\nHeap size: " + heapSize/MB + " MB");
		
		long heapMaxSize = Runtime.getRuntime().maxMemory();
		System.out.println("Max Heap size: " + heapMaxSize/MB + " MB");
		
		long heapFreeSize = Runtime.getRuntime().freeMemory();
		System.out.println("Free Heap size: " + heapFreeSize/MB + " MB");
		
		long heapUsedSize = heapSize - heapFreeSize;
		System.out.println("Used Heap size: " + heapUsedSize/MB + " MB");
	}
}
