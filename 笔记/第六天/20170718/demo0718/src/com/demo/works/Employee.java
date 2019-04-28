package com.demo.works;

/**
 * 职员类
 * @author Teacher
 * @createTime 2017年7月18日 上午9:22:58
 * @version 1.0.0
 */
public class Employee {

	String name; //姓名
	String gender; //性别
	String birthday; //生日
	String workInTime; //入职时间
	double basicSalary; //基本工资
	private double perforSalary; //绩效工资
	
	public Employee() {
		
	}
	
	public Employee(String name, String gender, String birthday,
			String workInTime, double basicSalary, double perforSalary) {
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.workInTime = workInTime;
		this.basicSalary = basicSalary;
		this.perforSalary = perforSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getWorkInTime() {
		return workInTime;
	}

	public void setWorkInTime(String workInTime) {
		this.workInTime = workInTime;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getPerforSalary() {
		return perforSalary;
	}

	public void setPerforSalary(double perforSalary) {
		this.perforSalary = perforSalary;
	}
	
	public void printBasicInfo() {
		System.out.println(name+"\t"+gender+"\t"+getBirthday()
		       +"\t"+getWorkInTime()+"\t"+getBasicSalary());
	}
	
	public void printSalaryInfo() {
		System.out.println(name+"\t"+(getBasicSalary()+getPerforSalary()));
	}
	
}














