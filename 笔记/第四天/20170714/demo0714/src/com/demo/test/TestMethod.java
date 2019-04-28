package com.demo.test;

/**
 * 学生类
 * @author Teacher
 * @createTime 2017年7月14日 下午3:59:54
 * @version 1.0.0
 */
class Student {
	
	String name;
	int age;
	
	/*
	 * 局部变量：方法中或语句块中声明的变量。
	 * 方法中参数也是局部变量，一般称为形参变量。
	 */
	//无返回值类型的方法
	public void setName(String name) {
		this.name = name;  //this.name代指的是成员变量name; "="后的name是参数变量
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//带返回值类型的方法
	public String getMessage() {
		return name+", "+age;  //带返回值类型的方法，方法体中必须使用return返回值，且值的数据类型需要与返回值类型相同。
	}
	
}

/**
 * 成员方法
 * 实例方法与类方法
 * @author Teacher
 * @createTime 2017年7月14日 下午3:55:54
 * @version 1.0.0
 */
public class TestMethod {

	public static void main(String[] args) {
		Student stu = new Student();
		String name = "张伟";
		stu.setName(name);
		stu.setAge(26);
		String message = stu.getMessage();
		System.out.println("学生信息: "+message);
	}

}

//注意：一个Java源文件中，可以存在多个类，但是最多只能有一个类拥有public修饰符，拥有public修饰符的类的类名必须与源文件名相同。
