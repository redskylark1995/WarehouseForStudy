package com.demo.works;

import java.util.Calendar;
import java.util.Date;

/**
 * 自定义工具类
 * @author Teacher
 * @createTime 2017年7月25日 上午9:58:42
 * @version 1.0.0
 */
public class MyUtils {

	/**
	 * 转换字符串，获得数值
	 * @param str
	 * @return
	 */
	public static double parseNumber(String str) {
		return Double.parseDouble(str);
	}
	
	/**
	 * 获得当前时间
	 * @return
	 */
	public static Date getCurrentDate() {
		return new Date();
	}
	
	/**
	 * 获得指定“年月日”的日期对象
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public static Date getDate(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day);
		return cal.getTime();
	}
	
	/**
	 * 获得指定“年月日 时分秒”的日期对象
	 * @param year
	 * @param month
	 * @param day
	 * @param hour
	 * @param minute
	 * @param second
	 * @return
	 */
	public static Date getDateTime(int year, int month, int day, int hour, int minute, int second) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day, hour, minute, second);
		return cal.getTime();
	}
	
	/**
	 * 格式化日期对象，返回“yyyy年MM月dd日 HH:mm:ss”格式的时间字符串
	 * @param date
	 * @return
	 */
	public static String format(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月"
		        +cal.get(Calendar.DAY_OF_MONTH)+"日  "+cal.get(Calendar.HOUR_OF_DAY)+":"
		        +cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
	}
	
	public static void main(String[] args) {
		System.out.println(parseNumber("123.56")+100);
		System.out.println(getCurrentDate());
		System.out.println(getDate(1995, 6, 25));
		System.out.println(getDateTime(1996, 7, 10, 23, 12, 12));
		System.out.println(format(getCurrentDate()));
		System.out.println(format(getDateTime(1996, 7, 10, 23, 12, 12)));
	}

}
