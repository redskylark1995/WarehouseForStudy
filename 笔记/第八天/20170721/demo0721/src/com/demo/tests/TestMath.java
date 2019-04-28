package com.demo.tests;

/**
 * 数学函数应用
 * @author Teacher
 * @createTime 2017年7月21日 下午6:00:53
 * @version 1.0.0
 */
public class TestMath {

	public static void main(String[] args) {
		//求次方
		System.out.println(Math.pow(3, 4));
		//四舍五入
		System.out.println(Math.round(10.5)); //11
		System.out.println(Math.round(10.4)); //10
		System.out.println(Math.round(10.49)); //10
		//精确到两位小数
		double d = 100.256; //100.26
		d = (double)Math.round(d*100)/100;
		System.out.println(d);
		//随机数     大于等于 0.0 且小于 1.0 
		System.out.println(Math.random()); 
		//获得10以内（不包括10）
		System.out.println((int)(Math.random()*10)); 
	}

}
