package com.demo.test;

/**
 * 语句块与静态语句块
 * @author Teacher
 * @createTime 2017年7月19日 下午4:39:08
 * @version 1.0.0
 */
public class TestStatement {

	//int i = 10;  //输出结果：20
	//static int x = 100; //输出结果：200
	
	{
		i = 20;
		System.out.println("语句块!");
	}
	
	int i = 10; //输出结果：10
	
	static {
		//i = 30; //静态语句块中，不能使用实例成员
		x = 200;
		System.out.println("静态语句块!");
	}
	
	static int x = 100; //输出结果：100
	
	public static void main(String[] args) {
		TestStatement ts = new TestStatement();
		System.out.println(ts.i);
		System.out.println(ts.x);
	}

}
