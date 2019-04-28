package com.demo.tests;

import java.sql.Date;
import java.util.Calendar;

/**
 * 使用日历类
 * @author Teacher
 * @createTime 2017年7月24日 下午5:38:37
 * @version 1.0.0
 */
public class TestCalendar {

	public static void main(String[] args) {
		//创建日历对象
		Calendar cal = Calendar.getInstance();
		//获得当前时间
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeInMillis());
		//设置日历上的字段，指定时间；创建指定时间的日期对象
		cal.set(1995, 5, 23);
		System.out.println(new Date(cal.getTimeInMillis()));
		//单独设置某个字段
		cal.set(Calendar.YEAR, 1990);
		System.out.println(new Date(cal.getTimeInMillis()));
		//获得单独某个字段
		System.out.println(cal.get(Calendar.YEAR)+"\t"
				+(cal.get(Calendar.MONTH)+1)+"\t"
				+cal.get(Calendar.DAY_OF_MONTH));
	}

}
