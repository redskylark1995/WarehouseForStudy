package com.demo.tests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 使用日历类
 * 上下翻页
 * @author Teacher
 * @createTime 2017年7月26日 上午10:18:12
 * @version 1.0.0
 */
public class TestCalendar {

	private static DateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static String format(Date date) {
		return dataFormat.format(date);
	}
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(format(cal.getTime()));
		cal.roll(Calendar.MONTH, true); //向上翻页
		System.out.println(format(cal.getTime()));
		cal.roll(Calendar.MONTH, false); //向下翻页
		System.out.println(format(cal.getTime()));
		
		cal.roll(Calendar.MONTH, 2); //向下翻2页
		System.out.println(format(cal.getTime()));
		cal.roll(Calendar.MONTH, -3); //向下翻3页
		System.out.println(format(cal.getTime()));
		
	}

}
