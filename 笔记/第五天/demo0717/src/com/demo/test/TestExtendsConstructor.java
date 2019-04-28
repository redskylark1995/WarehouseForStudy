package com.demo.test;

class Parent {
	
	public Parent() {
		System.out.println("父类构造方法!");
	}
	
}

class Sub extends Parent {
	
	public Sub() {
		System.out.println("子类构造方法!");
	}
	
}

/**
 * is a关系中构造方法
 * @author Teacher
 * @createTime 2017年7月17日 下午4:10:59
 * @version 1.0.0
 */
public class TestExtendsConstructor {

	public static void main(String[] args) {
		Sub sub = new Sub();
	}

}
