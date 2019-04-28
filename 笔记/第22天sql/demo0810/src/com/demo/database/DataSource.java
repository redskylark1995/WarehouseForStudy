package com.demo.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

/**
 * 数据源类
 * @author Teacher
 * @createTime 2017年8月10日 下午5:37:29
 * @version 1.0.0
 */
public class DataSource {
	
	private static String driver = "com.mysql.jdbc.Driver"; //驱动名称
	private static String url = "jdbc:mysql://localhost:3306/demo"; //连接路径
	private static String user = "root"; //用户
	private static String password = "123456"; //密码

	/**
	 * 获得数据库连接
	 * @return
	 * @throws Exception
	 */
	public static Connection getConnection() throws Exception {
		//加载驱动
		Class.forName(driver);
		//打开并返回连接
		return DriverManager.getConnection(url, user, password);
	}
	
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
	
	public static void main(String[] args) {
		try {
			//测试是否获得连接
			System.out.println(getConnection());
			System.out.println(getMySQLConnection());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
