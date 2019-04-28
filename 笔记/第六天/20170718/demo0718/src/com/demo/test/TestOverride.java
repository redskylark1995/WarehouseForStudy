package com.demo.test;

class Person {
	
	String name = "Tom";
	
	public void setName(String name) {
		this.name = name;
	}
	
	protected String getName() {
		return name;
	}
	
}

class Student extends Person {
	
	//重写属性
	//int name = 7;
	String name = "张三";
	
	//重写方法
	@Override //注解，检测子类方法是否重写父类的方法
	protected String getName() {
		return name;
	}
}

/**
 * 重写
 * @author Teacher
 * @createTime 2017年7月18日 上午11:06:57
 * @version 1.0.0
 */
public class TestOverride {

	public static void main(String[] args) {
		Student stu = new Student();
		//System.out.println(stu.name); //7
		//System.out.println(stu.getName()); //Tom   重写getName()前
		System.out.println(stu.name); //张三
		System.out.println(stu.getName()); //张三
	}

}
