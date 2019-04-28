package com.demo.tests;

class Person {
	
	@Override
	public void finalize() {
		System.out.println(this+"销毁，资源被回收!");
	}
	
}

/**
 * 使用资源回收器
 * @author Teacher
 * @createTime 2017年7月26日 下午4:52:45
 * @version 1.0.0
 */
public class TestGarbageCollection {
	
	public static void method() {
		Person p = new Person();
	}

	public static void main(String[] args) {
		Person p = new Person();
		p = new Person();
		
		Person p2 = new Person();
		p2 = null;
		
		new Person();
		
		method();
		
		System.gc();
	}

}
