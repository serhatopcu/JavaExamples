package org.javaturk.oop.ch08.access.memberAccess.p;

public class ClassP {
	public int x = 10;
	int y = 20;
	protected int w = 30;
	private int z = 40;

	public void xMethod() {

	}

	void yMethod() {
		zMethod();
	}

	protected void wMethod() {
		zMethod();
	}

	private void zMethod() {

	}
}
