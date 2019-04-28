package com.demo.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用Properties类读写属性文件
 * @author Teacher
 * @createTime 2017年7月26日 上午10:33:26
 * @version 1.0.0
 */
public class TestProperties {

	public static void main(String[] args) throws Exception {
		//创建属性列表对象
		Properties prop = new Properties();
		//加载属性
		prop.load(new FileInputStream("src/message.properties"));
		//获得属性
		String name = prop.getProperty("name");
		String gender = prop.getProperty("gender");
		String age = prop.getProperty("age");
		System.out.println(name+", "+gender+", "+age);
		
		//修改属性
		prop.setProperty("name", "Jack");
		//更新文件
		prop.store(new FileOutputStream("src/message.properties"), "update property!");
	}

}
