package com.demo.database.utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.demo.database.DataSource;

/**
 * 批量更新数据
 * @author Teacher
 * @createTime 2017年8月11日 下午5:03:28
 * @version 1.0.0
 */
public class BatchDataOperaUtils {

	public static void main(String[] args) {
		//定义数据库连接的变量
		Connection conn = null;
		try {
			//创建数据库连接
			conn = DataSource.getMySQLConnection();
			//取消自动提交模式
			conn.setAutoCommit(false);
			//创建执行SQL的语句对象
			Statement stm = conn.createStatement();
			//添加批量处理多个SQL命令
			stm.addBatch("insert into t_demo_student(stu_name,"
					+ "stu_birthday,create_time) values("
					+ "'Tom','1997-07-16', sysdate())");
			stm.addBatch("update t_demo_student set stu_name1='汤姆'"
					+ " where stu_name='Tom'");
			//批次执行SQL命令
			int[] arr = stm.executeBatch();
			//提交事务
			//conn.commit();
			System.out.println(arr.length);
			for(int count: arr) {
				System.out.print(count);
				System.out.print("\t");
			}
			System.out.println();
		} catch(Exception e) {
			/*if(conn!=null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}*/
			e.printStackTrace();
		} finally {
			if(conn!=null) {
				try {
					conn.commit();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

}
