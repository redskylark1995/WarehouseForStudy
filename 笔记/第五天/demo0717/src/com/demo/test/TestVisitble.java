package com.demo.test;

/**
 * 访问权限
 * @author Teacher
 * @createTime 2017年7月17日 下午4:18:14
 * @version 1.0.0
 */
public class TestVisitble {

	public static void main(String[] args) {
		Transportation trans = new Transportation();
		trans.printInfo();
		//同包的其他类
		//System.out.print(trans.number); //编译失败，无访问权限
		System.out.print(trans.price+"\t");
		System.out.print(trans.type+"\t");
		System.out.print(trans.createTime+"\t");
		System.out.println();
	}

}
