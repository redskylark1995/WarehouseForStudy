package com.demo.tests;

import java.sql.Timestamp;

/**
 * 时间工具类
 * @author Teacher
 * @createTime 2017年7月24日 下午5:10:09
 * @version 1.0.0
 */
public class DateUtils {

	/**
	 * 获得当前时间
	 * java.util.Date时间格式
	 * @return
	 */
	public static java.util.Date getCurrentDate() {
		return new java.util.Date();
	}
	
	/**
	 * 获得当前时间
	 * java.sql.Date时间格式
	 * @return
	 */
	public static java.sql.Date getCurrentSqlDate() {
		return new java.sql.Date(System.currentTimeMillis());
	}
	
	/**
	 * 获得当前的时间戳
	 * @return
	 */
	public static Timestamp getCurrentTimestamp() {
		return new Timestamp(System.currentTimeMillis());
	}
	
	public static void main(String[] args) {
		System.out.println(getCurrentDate());
		System.out.println(getCurrentSqlDate());
		System.out.println(getCurrentTimestamp());
	}

}
