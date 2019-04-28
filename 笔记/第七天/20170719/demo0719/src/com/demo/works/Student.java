package com.demo.works;

/**
 * 学生类
 * @author Teacher
 * @createTime 2017年7月19日 上午10:50:03
 * @version 1.0.0
 */
public class Student extends Person {

	private String school;
	private double chinese;
	private double math;
	private double english;
	
	public Student() {
		
	}
	
	public Student(String name, String gender, String birthday,
			String school, double chinese, double math,
			double english) {
		this.setName(name);
		this.setGender(gender);
		this.birthday = birthday;
		this.school = school;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getChinese() {
		return chinese;
	}

	public void setChinese(double chinese) {
		this.chinese = chinese;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}
	
	public double getTotalScore() {
		return chinese+math+english;
	}
	
}
