package com.demo.test;

/**
 * 人员类
 * @author Teacher
 * @createTime 2017年7月17日 上午11:20:06
 * @version 1.0.0
 */
public class Person {
	
	String name;
	String gender;
	int age = 18;
	
	public Person() {
		
	}
	
	public Person(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(name+"\t"+gender+"\t"+age);
	}

	public static void main(String[] args) {
	    Person p1 = new Person("Tom", "男", 21);
		p1.printInfo();
		
		Person p2 = new Person();
		p2.printInfo();
	}

}
