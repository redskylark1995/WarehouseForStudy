package com.demo.test;

class Student {
	
	private String name;
	
	public void setN(String str) {
		this.name = str;
	}
	
	public void printInfo() {
		System.out.println(name);
	}
	
}

/**
 * 信息隐藏
 * @author Teacher
 * @createTime 2017年7月17日 上午11:42:40
 * @version 1.0.0
 */
public class TestMessageHidden {

	public static void main(String[] args) {
		Student stu = new Student();
		//stu.name = "张三"; //无法访问其属性，即为信息隐藏
		stu.printInfo();
	}

}
