package com.demo.database;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

/**
 * 数据源类
 * @author Teacher
 * @createTime 2017年8月11日 上午9:40:58
 * @version 1.0.0
 */
public class DataSource {

	private static String url = "jdbc:mysql://localhost:3306/demo"
			+ "?useUnicode=true&characterEncoding=UTF-8"; //连接路径
	private static String user = "root"; //用户
	private static String password = "123456"; //密码
	
	/**
	 * 获得Mysql数据库连接
	 * @return
	 * @throws Exception 
	 * @throws Exception
	 */
	public static Connection getMySQLConnection() throws Exception  {
		//创建MySQL的数据源对象
		MysqlDataSource source = new MysqlDataSource();
		//设置连接的属性
		source.setUrl(url);
		source.setUser(user);
		source.setPassword(password);
		//打开并返回数据库连接
		return source.getConnection();
	}
	
}
