package com.demo.works;

/**
 * 职员类
 * @author Teacher
 * @createTime 2017年7月19日 上午10:57:04
 * @version 1.0.0
 */
public class Employee extends Person {
	
	private String workInTime; //入职时间
	private double salary; //基本工资
	private double perforSalary; //绩效工资
	
	public Employee() {
		
	}
	
	public Employee(String name, String gender, String birthday,
			String workInTime, double salary, double perforSalary) {
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.workInTime = workInTime;
		this.salary = salary;
		this.perforSalary = perforSalary;
	}

	public String getWorkInTime() {
		return workInTime;
	}

	public void setWorkInTime(String workInTime) {
		this.workInTime = workInTime;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getPerforSalary() {
		return perforSalary;
	}

	public void setPerforSalary(double perforSalary) {
		this.perforSalary = perforSalary;
	}
	
	public double getCurrentSalary() {
		return salary+perforSalary;
	}
	
	public double getYearSalary() {
		return (salary+perforSalary)*12;
	}
}
