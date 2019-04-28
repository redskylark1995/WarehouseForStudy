package com.demo.database.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

import com.demo.database.DataSource;

/**
 * 预编译的SQL操作数据库
 * @author Teacher
 * @createTime 2017年8月11日 下午2:33:50
 * @version 1.0.0
 */
public class PrepareDataOperaUtils {

	/**
	 * 输出查询出的数据
	 * @throws Exception
	 */
	public void printData() throws Exception {
		//获得数据库连接
		Connection conn = DataSource.getMySQLConnection();
		//创建预编译的SQL执行对象
		PreparedStatement stm = conn.prepareStatement(
				"select * from t_demo_student where stu_name like ?"); //?称为占位符，索引从1开始
		//设置参数
		stm.setString(1, "%");
		//执行查询语句，返回结果集
		ResultSet rs = stm.executeQuery();
		//循环提取数据
		while(rs.next()) {
			System.out.println(rs.getInt("stu_id")+"\t"+rs.getString("stu_name"));
		}
		//关闭连接
		rs.close();
		
		/*//设置参数
		stm.setString(1, "李%");
		//执行查询语句，返回结果集
		rs = stm.executeQuery();
		//循环提取数据
		while(rs.next()) {
			System.out.println(rs.getInt("stu_id")+"\t"+rs.getString("stu_name"));
		}*/
		
		//关闭连接
		rs.close();
		stm.close();
		conn.close();
	}
	
	/**
	 * 插入数据
	 */
	public void insert() throws Exception {
		//获得数据库连接
		Connection conn = DataSource.getMySQLConnection();
		//创建预编译的SQL执行对象
		PreparedStatement stm = conn.prepareStatement(
				"insert into t_demo_student(stu_name,stu_birthday,create_time) "
				+"values(?, ?, ?)");
		//设置参数
		stm.setString(1, "孙武1");
		stm.setString(2, "1996-05-28");
		stm.setTimestamp(3, new Timestamp(new Date().getTime()));
		//执行插入语句
		stm.executeUpdate();
		
		stm.setString(1, "孙武2");
		stm.setString(2, "1996-05-28");
		stm.setTimestamp(3, new Timestamp(new Date().getTime()));
		//执行插入语句
		stm.executeUpdate();
		
		//关闭连接
		stm.close();
		conn.close();
	}
	
	/**
	 * 插入数据
	 */
	public void insertImg() throws Exception {
		//获得数据库连接
		Connection conn = DataSource.getMySQLConnection();
		//创建预编译的SQL执行对象
		PreparedStatement stm = conn.prepareStatement(
				"insert into t_demo_student(stu_name,"
				+ "stu_birthday,create_time,stu_header_image) "
				+ "values(?, ?, ?, ?)");
		//设置参数
		stm.setString(1, "孙武1");
		stm.setString(2, "1996-05-28");
		stm.setTimestamp(3, new Timestamp(new Date().getTime()));
		//创建字节输入流
		InputStream in = new FileInputStream("D:\\myfile\\Frame.jpg");
		stm.setBlob(4, in);
		//执行插入语句
		stm.executeUpdate();	
		//关闭连接
		stm.close();
		conn.close();
		//关闭流
		in.close();
		System.out.println("添加数据成功!");
	}
	
	/**
	 * 提取字节大对象中数据
	 * @throws Exception 
	 */
	public void getBlobData() throws Exception  {
		//获得数据库连接
		Connection conn = DataSource.getMySQLConnection();
		//创建执行SQL语句的对象
		Statement stm = conn.createStatement();
		//执行查询的SQL语句返回结果集
		ResultSet rs = stm.executeQuery("select * from t_demo_student where stu_id=9");
		//光标移到结果集的下一行
		rs.next();
		//提取直接大对象
		//创建输入流与输出流
		InputStream in = rs.getBlob("stu_header_image").getBinaryStream();
		OutputStream out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Frame.jpg");
		//定义缓存读取数据的数组
		byte[] buff = new byte[1024*1024];
		//定义记录读取字节数的变量
		int len;
		//循环写入数据到文件中
		while((len=in.read(buff))!=-1) {
			out.write(buff, 0, len);
		}
		//关闭流
		out.flush();
		out.close();
		in.close();
		//关闭连接
		stm.close();
		conn.close();
		System.out.println("提取大对象数据成功!");
	}
	
	public static void main(String[] args) {
		try {
			PrepareDataOperaUtils pdop = new PrepareDataOperaUtils();
			//查询学生数据
			//pdop.printData();
			//pdop.insert();
			//pdop.insertImg();
			pdop.getBlobData();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
