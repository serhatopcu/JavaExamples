package org.javaturk.oop.ch07.university;

public class Student {
	String no;
	String name;
	String dob;
	Department department;
	Professor advisor;
	Course[] coursesTaken;

	public Student(){}
	
	public Student(String newNo, String newName) {
		no = newNo;
		name = newName;
	}

	public Student(String newNo, String newName, String newDob) {
		no = newNo;
		name = newName;
		dob = newDob;
	}
	
	public Student(String newNo, String newName, String newDob, Department newDepartment) {
		no = newNo;
		name = newName;
		dob = newDob;
		department = newDepartment;
	}
	
	public Student(String newNo, String newName, String newDob, Department newDepartment, Professor newAdvisor) {
		no = newNo;
		name = newName;
		dob = newDob;
		department = newDepartment;
		advisor = newAdvisor;
	}

}
