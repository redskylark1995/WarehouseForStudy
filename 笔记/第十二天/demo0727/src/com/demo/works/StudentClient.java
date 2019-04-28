package com.demo.works;

import java.sql.Date;

/**
 * 学生类
 * @author Teacher
 * @createTime 2017年7月27日 上午10:39:16
 * @version 1.0.0
 */
class Student {
	
	private String number;
	private String name;
	private String gender;
	private Date birthday;
	
	public Student() {
		System.out.println(this+"\t"+new Date(System.currentTimeMillis())+"\t被创建!");
	}
	
    public Student(String number, String name,
    		String gender, Date birthday) {
    	this();
    	this.number = number;
    	this.name = name;
    	this.gender = gender;
    	this.birthday = birthday;
    }
    
    @Override
    public int hashCode() {
    	return number.hashCode();
    }
    
    @Override
    public boolean equals(Object o) {
    	return this.hashCode()==o.hashCode();
    }
    
    @Override
    public String toString() {
    	return this.getClass().getName()+"@"+super.hashCode();
    }
    
    @Override
    public void finalize() {
    	System.out.println(this+"\t"+new Date(System.currentTimeMillis())+"\t被销毁!");
    }
	
}

class A {
	
	public void methodA() {
		System.out.println("父类方法methodA()!");
	}
	
	public void methodB() {
		methodA();  //访问的是子类的methodA()方法
		System.out.println("父类方法methodB()!");
	}
	
}

class B extends A {
	
	public void methodA() {
		System.out.println("子类方法methodA()!");
	}
	
	public void methodB() {
		super.methodB();
	}
}

/**
 * 使用学生类
 * @author Teacher
 * @createTime 2017年7月27日 上午10:38:57
 * @version 1.0.0
 */
public class StudentClient {

	public static void main(String[] args) {
		Student stu1 = new Student("00001","张三","男",null);
		Student stu2 = new Student("00001","张龙","男",null);
		System.out.println(stu1==stu2);
		System.out.println(stu1.equals(stu2));
		
		stu1 = null;
		stu2 = null;
		System.gc();
		
		//new B().methodB();
	}

}
