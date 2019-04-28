package com.demo.tests;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期对象
 * @author Teacher
 * @createTime 2017年7月24日 下午4:13:38
 * @version 1.0.0
 */
public class TestDate {

	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println(date1);  //格林威治时间格式
		java.sql.Date date2 = new java.sql.Date(date1.getTime());
		System.out.println(date2); //yyyy-MM-dd
		//判断两个事件是否相等
		if(date1.equals(date2)) {
			System.out.println("同一时刻!");
		} else {
			System.out.println("时间不同!");
		}
		//输出时间的毫秒数
		System.out.println(date1.getTime());
		System.out.println(date2.getTime());
		
		
	    //时间戳
		Timestamp ts = new Timestamp(date1.getTime());
		System.out.println(ts);
		
		//时间格式化
		//创建时间格式化对象
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(format.format(date1));
		System.out.println(format.format(date2));
		
		//System对象获得毫秒数
		long time = System.currentTimeMillis();
		System.out.println(time);
		//创建当前的时间对象
		Timestamp ts2 = new Timestamp(time);
		System.out.println(ts2);
		
		//创建指定时间的Timestamp对象，字符串格式的时间转换成Timestamp型
		String datetime = "1997-02-25 17:33:33.666";
		Timestamp ts3 = Timestamp.valueOf(datetime);
		System.out.println(ts3);
	}

}







