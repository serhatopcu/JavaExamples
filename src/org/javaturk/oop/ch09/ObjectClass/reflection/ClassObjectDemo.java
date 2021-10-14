/**
 * 
 */
package org.javaturk.oop.ch09.ObjectClass.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.javaturk.oop.ch09.factories.factory3.Employee;
import org.javaturk.oop.ch09.factories.factory3.Manager;

public class ClassObjectDemo {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Employee e1 = new Employee(1, "Ali", 8, "Production");
		Class e1Class = e1.getClass();

		Employee e2 = new Employee(2, "Sami", 18, "Marketing");
		Class e2Class = e2.getClass();
		System.out.println(e1Class.hashCode());
		System.out.println(e2Class.hashCode());

		Manager m1 = new Manager(2, "Fatma", 3, "Production", "Production");
		Class m1Class = m1.getClass();

		System.out.println(e1Class.hashCode());
		System.out.println(m1Class.hashCode());

		System.out.println("Name: " + e1Class.getName());
		System.out.println("Simple name: " + e1Class.getSimpleName());
		System.out.println("Super class' name: " + e1Class.getSuperclass().getName());

		System.out.println("***   Declared Fields   ***");
		Field[] fields = e1Class.getDeclaredFields();
		for (Field f : fields)
			System.out.println(f.getName());

		System.out.println("***   Declared Methods   ***");
		Method[] methods = e1Class.getDeclaredMethods();
		for (Method m : methods) {
			String methodName = m.getName();
			System.out.println(methodName);
			if (methodName.equals("printInfo")) {
				try {
					m.invoke(e2, null);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		System.out.println("***   Fields   ***");
		fields = e1Class.getFields();
		for (Field f : fields)
			System.out.println(f.getName());

		System.out.println("***   Methods   ***");
		methods = e1Class.getMethods();
		for (Method m : methods)
			System.out.println(m.getName());
		
		System.out.println("Calling printInfo() of an Employee");
		callPrintInfoMethod(e1);
		
		System.out.println("Calling printInfo() of an Manager");
		callPrintInfoMethod(m1);
	}

	public static void callPrintInfoMethod(Employee employee) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = employee.getClass();
		Method[] methods = clazz.getDeclaredMethods();
		for (Method m : methods) {
			String methodName = m.getName();
			System.out.println(methodName);
			if (methodName.equals("printInfo")) {
				m.invoke(employee, null);
			}
		}
	}
}
