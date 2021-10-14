package org.javaturk.oop.ch07.memory;

public class StackDemo {

	static int callCount;
	
	public static void main(String[] args) {
		recursiveCall();
	}
	
	/**
	 * Once hic String nesnesi olmadan calıstırın ve ne zaman patladıgını görün.
	 * Sonra bir tane String nesnesi tnaımlayın ve etkisini görün: String s = new String("Naber abi nasılsın?");
	 * Sonra 10 tane String nesnesi tanımlayıp etkisini görün.
	 * 
	 * http://www.mkyong.com/java/find-out-your-java-heap-memory-size/
	 */
	public static void recursiveCall(){
//		String s1 = new String("Naber abi nasılsın?");
//		String s2 = new String("Naber abi nasılsın?");
//		String s3 = new String("Naber abi nasılsın?");
//		String s4 = new String("Naber abi nasılsın?");
//		String s5 = new String("Naber abi nasılsın?");
//		String s6 = new String("Naber abi nasılsın?");
//		String s7 = new String("Naber abi nasılsın?");
//		String s8 = new String("Naber abi nasılsın?");
//		String s9 = new String("Naber abi nasılsın?");
//		String s10 = new String("Naber abi nasılsın?");
//		String s11 = "Naber abi nasılsın?";
//		String s12 = "Naber abi nasılsın?";
//		String s13 = "Naber abi nasılsın?";
//		String s14 = "Naber abi nasılsın?";
//		String s15 = "Naber abi nasılsın?";
//		String s16 = "Naber abi nasılsın?";
//		String s17 = "Naber abi nasılsın?";
//		String s18 = "Naber abi nasılsın?";
//		String s19 = "Naber abi nasılsın?";
//		String s20 = "Naber abi nasılsın?";
		callCount++;
		if(callCount%100 == 0)
			System.out.println(callCount);
		recursiveCall();
	}
}
