package org.javaturk.oop.ch09.finals;

public class FinaMethodExample {

	public static void main(String[] args) {
		Parent parent = new Parent();
//		parent.f();
		parent.g();

		Child child = new Child();
//		child.f();
		child.g();

	}
}

class Parent{
	

	public final void f() {
		System.out.println(Math.PI);
		System.out.println("f() in Parent");
	}

	public void g() {
		System.out.println("g() in Parent");
	}
}

class Child extends Parent {

//	 public final void f() {
//		 System.out.println("f() in Child");
//	 }

	@Override
	public void g() {
		String s;
		System.out.println("g() in Child");
	}
}
