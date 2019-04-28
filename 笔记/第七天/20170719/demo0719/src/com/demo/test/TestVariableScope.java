package com.demo.test;

/**
 * 测试变量的作用域
 * @author Teacher
 * @createTime 2017年7月19日 上午11:35:28
 * @version 1.0.0
 */
public class TestVariableScope {
	
	//private int value = 10;
	
	public void method() {
		System.out.println(value);
		value = 100;
		System.out.println(value);
	}
	
	public void method2() {
		int value = 1;  //局部变量名与成员变量名相同，若未超出局部变量作用域，使用的是局部变量。
		System.out.println(value);
		//System.out.println("i="+i); //错误：编译不通过，局部变量要遵守"先定义，后使用"的规则。
		int i = 10;
		System.out.println("i="+i);
	}
	
	public void method3() {
		if(3>2) {
			int i = 20;
		}
		//System.out.println("i="+i); //错误：编译不通过, 超出了变量i的作用域范围。
	}

	public static void main(String[] args) {
		TestVariableScope tvs = new TestVariableScope();
		tvs.method();
		tvs.method2();
	}
	
	private int value = 10;

}
