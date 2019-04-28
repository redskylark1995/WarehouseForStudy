package com.demo.tests;

/**
 * 可变字符序列
 * StringBuffer
 * @author Teacher
 * @createTime 2017年7月24日 下午2:41:54
 * @version 1.0.0
 */
public class TestStringBuffer {

	public static void main(String[] args) {
		//要进行大量的字符串拼接时，就考虑使用StringBuffer或StringBuilder
		StringBuffer sbuff = new StringBuffer("names:[");
		sbuff.append("Tom,");
		sbuff.append("Jack,");
		sbuff.append("Rose,");
		sbuff.append("Lily");
		sbuff.append("]");
		String str = sbuff.toString();
		System.out.println(str);
		System.out.println("长度："+sbuff.length());
	}

}
