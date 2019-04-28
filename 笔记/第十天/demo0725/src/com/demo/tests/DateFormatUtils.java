package com.demo.tests;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义时间格式化类
 * @author Teacher
 * @createTime 2017年7月25日 上午11:11:34
 * @version 1.0.0
 */
public class DateFormatUtils {
	
	//定义时间格式化对象
	private static SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	/**
	 * 设置时间格式
	 * @param pattern
	 */
	public static void setPattern(String pattern) {
		dateformat.applyPattern(pattern);
	}
	
	/**
	 * 字符串格式化成时间型
	 * @param source
	 * @return
	 */
	public static Date parse(String source) {
		try {
			return dateformat.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 时间型格式化成字符串
	 * @param date
	 * @return
	 */
	public static String format(Date date) {
		return dateformat.format(date);
	}

	public static void main(String[] args) {
		System.out.println(DateFormatUtils.format(new Date()));
		DateFormatUtils.setPattern("yyyy年MM月dd日");
		System.out.println(format(new Date()));
		
		String source = "2000年01月23日";
		Date date = DateFormatUtils.parse(source);
		System.out.println(date);
	}

}
