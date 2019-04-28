package com.demo.works;

/**
 * 人员类
 * 
 * @author Teacher
 * @createTime 2017年7月19日 上午10:47:07
 * @version 1.0.0
 */
public class Person {

	protected String name; // 姓名
	protected String gender; // 性别
	protected String birthday; // 出生年月

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getGender() {
		return gender;
	}

	protected void setGender(String gender) {
		this.gender = gender;
	}

	protected String getBirthday() {
		return birthday;
	}

	protected void setBirthday(String birthday) {
		this.birthday = birthday;
	}

}
