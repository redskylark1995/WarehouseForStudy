package com.demo.test;

/**
 * 已知数值：63521，提取出每一位的数值，结果：1 2 5 3 6
 * @author Teacher
 * @createTime 2017年7月12日 下午4:38:17
 * @version 1.0.0
 */
public class TestOperator {

	public static void main(String[] args) {
		int value = 63521;
		System.out.print(value%(value/10)+" ");
		System.out.print(value/10%(value/100)+" ");
		System.out.print(value/100%(value/1000)+" ");
		System.out.print(value/1000%(value/10000)+" ");
		System.out.println(value/10000);
	}

}
