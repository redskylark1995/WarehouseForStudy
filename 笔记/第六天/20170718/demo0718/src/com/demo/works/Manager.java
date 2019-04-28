package com.demo.works;

/**
 * 经理类
 * @author Teacher
 * @createTime 2017年7月18日 上午9:33:21
 * @version 1.0.0
 */
public class Manager extends Employee {

	double bonus; //奖金 
	
	public Manager(String name, String gender, String birthday,
			String workInTime, double basicSalary, double bonus) {
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.workInTime = workInTime;
		this.basicSalary = basicSalary;
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	/**
	 * 设置职员的绩效
	 * @param emp
	 * @param perfor
	 */
	public void setEmployeePerfor(Employee emp, double perfor) {
		emp.setPerforSalary(perfor);
	}
	
	public void printBasicInfo() {
		System.out.println(getName()+"\t"+getGender()+"\t"+getBirthday()+"\t"
	           +getWorkInTime()+"\t"+getBasicSalary()+"\t"+getBonus()+"\t"
			   +(getBasicSalary()+getBonus()));
	}
	
}
