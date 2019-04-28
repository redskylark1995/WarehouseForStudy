package com.demo.tests;

/**
 * 基本数据类型封装类的应用
 * @author Teacher
 * @createTime 2017年7月24日 下午3:36:52
 * @version 1.0.0
 */
public class TestWrapper {

	public static void main(String[] args) {
		//自动装箱      基本数据类型直接赋值给封装类型
		Integer it1 = 100;
		
		int i1 = 10;
		Integer it2 = i1;
		
		//自动拆箱     封装类型直接赋值给基本数据类型
		int i2 = it2;
		
		System.out.println(it1);
		System.out.println(it2);
		System.out.println(i1);
		System.out.println(i2);
		
		int sum = it1 + i1;
		System.out.println("sum="+sum);
		
		//基本数据类型与字符串进行转换
		
		String str = "123";
		//字符串 转换成 整型
		int i3 = Integer.valueOf(str);
		int i4 = Integer.parseInt(str);
		System.out.println(i3+"+"+i4+"="+(i3+i4));
		
		//整型  转换成  字符串
		int i5 = 456;
		/*String str2 = Integer.valueOf(i5).toString(); 
		Integer it5 = i5;
		String str3 = it5.toString(); */
		
		String str4 = String.valueOf(i5);
		System.out.println(str4);
		
		//输出数字不同进制的字符串
		System.out.println(Integer.toBinaryString(17));
		System.out.println(Integer.toOctalString(17));
		System.out.println(Integer.toHexString(17));
	}

}
