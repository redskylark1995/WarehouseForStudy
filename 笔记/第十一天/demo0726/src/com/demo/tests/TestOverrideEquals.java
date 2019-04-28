package com.demo.tests;

class Dog {
	
	private String number;
	private String name;
	
	public Dog(String number, String name) {
		this.number = number;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Dog) {
			Dog dog = (Dog) o;
			return number.equals(dog.number);
		}
		return false;
	}
	
}

class Cat {
	
	private String number;
	private String name;
	
	public Cat(String number, String name) {
		this.number = number;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return number.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		return this.hashCode()==o.hashCode();
	}
}

/**
 * 测试重写equals与hashcode方法
 * @author Teacher
 * @createTime 2017年7月26日 下午3:36:09
 * @version 1.0.0
 */
public class TestOverrideEquals {

	public static void main(String[] args) {
		Dog dog1 = new Dog("0001", "小黑");
		Dog dog2 = new Dog("0001", "小白");
		System.out.println(dog1==dog2);
		System.out.println(dog1.equals(dog2));
		System.out.println("---------------------------");
		Cat cat1 = new Cat("0002", "小花");
		Cat cat2 = new Cat("0002", "小黄");
		System.out.println(cat1==cat2);
		System.out.println(cat1.equals(cat2));
	}

}
