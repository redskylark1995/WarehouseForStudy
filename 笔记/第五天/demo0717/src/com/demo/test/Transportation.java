package com.demo.test;

/**
 * 交通工具类
 * @author Teacher
 * @createTime 2017年7月17日 下午4:32:46
 * @version 1.0.0
 */
public class Transportation {
	
	private String number = "渝ASD12";
	double price = 800000;
	protected String type = "货车";
	public String createTime = "2016-10-25";

	public void printInfo() {
		//同类中
		System.out.println(number+"\t"+price+"\t"+type+"\t"+createTime);
	}
}
