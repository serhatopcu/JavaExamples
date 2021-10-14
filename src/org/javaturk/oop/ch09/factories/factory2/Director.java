package org.javaturk.oop.ch09.factories.factory2;


public class Director extends Manager {
	protected double bonus;
	
	public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
		super(no, name, year, workingDepartment, managingDepartment);
		this.bonus = bonus;
	}
	
	public void work() {
		System.out.println("Director is working");
		manage();
		makeAStrategicPlan();
	}
	
	public void manage() {
		System.out.println("Director manages whole company.");
	}
	
	public void makeAStrategicPlan(){
		System.out.println("Director makes a strategic plan for the company!");
	}
	
	public double calculateSalary(){
		return super.calculateSalary() + bonus;
	}
}
