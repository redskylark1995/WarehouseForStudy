package com.demo.tests;

/**
 * 使用可变参数
 * @author Teacher
 * @createTime 2017年7月25日 下午6:04:59
 * @version 1.0.0
 */
public class TestVarargs {

	/**
	 * 可变参数
	 * @param x
	 */
	public void sum(int...x) {
		int sum = 0;
		for(int i: x) {
			sum += i;
		}
		System.out.println("sum="+sum);
	}
	
	public static void main(String[] args) {
		TestVarargs tv = new TestVarargs();
		tv.sum(10);
		tv.sum(10, 20);
		tv.sum(10, 20, 30);
		tv.sum(new int[]{10, 20, 40, 50});
	}

}
