package com.demo.test;

class Parent {
	
	public final void method() {
		
	}
	
}

class sub extends Parent {
	
	//final int i; //最终成员必须赋初值
	final int i = 10;
	
	final int j;
	
	final int k;
	
	public sub() {
		j = 20;
	}
	
	{
		k = 30;
	}
	
	/*@Override //最终方法不能被重写
	public void method() { 

	}*/
	
	public void function() {
		final int i = 10;
		final int j;
		j = 20;
	}
}

/**
 * 使用final修饰符
 * @author Teacher
 * @createTime 2017年7月19日 下午5:01:47
 * @version 1.0.0
 */
public class TestFinal {

	public static void main(String[] args) {

	}

}
