package com.demo.database.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import com.demo.database.DataSource;

/**
 * 简单的数据库操作工具类
 * @author Teacher
 * @createTime 2017年8月11日 上午10:09:18
 * @version 1.0.0
 */
public class SimpleDataOperaUtils {
	
	/**
	 * 创建表
	 * @param sql
	 * @throws Exception 
	 */
	public void createTable(String sql) throws Exception {
		//获得数据库连接
		Connection conn = DataSource.getMySQLConnection();
		//创建执行SQL语句的对象
		Statement stm = conn.createStatement();
		//执行SQL语句创建表
		stm.execute(sql);
		//关闭连接
		stm.close();
		conn.close();
	}

	/**
	 * 输出查询出的数据
	 * @param sql
	 */
	public void printData(String sql) throws Exception {
		//获得数据库连接
		Connection conn = DataSource.getMySQLConnection();
		//创建执行SQL语句的对象
		Statement stm = conn.createStatement();
		//执行SQL语句，查询并返回结果集合
		ResultSet rs = stm.executeQuery(sql);
		//获得结果集元数据对象
		ResultSetMetaData rsmd = rs.getMetaData();
		//循环取出数据
		while(rs.next()) {
			//输出每行的数据
			/*System.out.println(rs.getInt(1)+"\t"
			             + rs.getString(2)+"\t"
					     + rs.getDate(3)+"\t"
			             + rs.getTimestamp(4));*/
			/*System.out.println(rs.getInt("stu_id")+"\t"
		             + rs.getString("stu_name")+"\t"
				     + rs.getDate("stu_birthday")+"\t"
		             + rs.getTimestamp("create_time"));*/
			//循环输出每列数据
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				//System.out.print(rs.getObject(i)+"\t");
				System.out.print(rs.getObject(rsmd.getColumnName(i))+"\t");
			}
			System.out.println();
		}
		//关闭连接
		rs.close();
		stm.close();
		conn.close();
	}
	
	/**
	 * 更新表中数据
	 * 添加、修改、删除
	 * @param sql
	 * @throws Exception
	 */
	public void update(String sql) throws Exception {
		//获得数据连接
		Connection conn = DataSource.getMySQLConnection();
		//创建执行SQL语句的对象
		Statement stm = conn.createStatement();
		//执行SQL语句，更新数据；返回影响行数
		int rowCount = stm.executeUpdate(sql);
		//判断影响行数是否为0，判断有无更新数据
		if(rowCount==0) {
			throw new Exception("影响行数:0!");
		}
		//关闭连接
		stm.close();
		conn.close();
	}
	
	public static void main(String[] args) {
		try {
			SimpleDataOperaUtils sdou = new SimpleDataOperaUtils();
			//创建表
			/*sdou.createTable("create table t_demo_student("
					+ "stu_id int primary key auto_increment,"
					+ "stu_name varchar(50),"
					+ "stu_birthday date,"
					+ "create_time datetime,"
					+ "stu_header_image mediumblob"
					+ ")");
			System.out.println("创建表成功!");*/
			//添加学生数据
			/*sdou.update("insert into t_demo_student(stu_name,stu_birthday,create_time)"
					+ "values('张三', '1995-08-18', sysdate())");*/
			/*sdou.update("insert into t_demo_student("
					+ "stu_name,stu_birthday,create_time) values"
					+ "('张四', '1995-08-18', sysdate()),"
					+ "('李思', '1995-08-18', sysdate()),"
					+ "('王武', '1995-08-18', sysdate()),"
					+ "('张丽', '1995-08-18', sysdate()),"
					+ "('赵柳', '1995-08-18', sysdate())");
			System.out.println("添加数据成功!");*/
			//修改学生数据
			/*sdou.update("update t_demo_student set stu_birthday='1996-10-12',"
					+ " create_time='"+new Timestamp(new Date().getTime())+"'"
					+ " where stu_id=7");
			System.out.println("修改数据成功!");*/
			//删除学生数据
			/*sdou.update("delete from t_demo_student where stu_id in(9,10,11)");
			System.out.println("删除数据成功!");*/
			//sdou.printData("select * from t_demo_student");
			//sdou.printData("select * from t_demo_employee");
			
			//删除表
			//sdou.createTable("drop table t_demo_student");
			//System.out.println("删除表成功!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
















