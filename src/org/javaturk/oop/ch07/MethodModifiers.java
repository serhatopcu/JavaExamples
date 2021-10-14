package org.javaturk.oop.ch07;

public abstract class MethodModifiers {
	
	public void method1(){}
	
	public abstract void method2();
	
	public static void method3(){}
	
//	public abstract static void method4(){}  // Illegal to have both abstract & static
	
	public final void method4(){}
	
	public synchronized void method5(){}
	
	public native void method6();
	
	public strictfp void method7(){}
	
//	public strictfp native void method8();  // Illegal to have both strictfp & native
	
	public static final synchronized native void method9();   // That's the convention
	
	final static native synchronized public void method10();  // That's OK

}
