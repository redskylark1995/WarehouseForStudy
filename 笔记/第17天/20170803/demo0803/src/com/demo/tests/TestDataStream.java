package com.demo.tests;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 基本类型数据输入输出流
 * 输入输出基本数据类型的数据
 * @author Teacher
 * @createTime 2017年8月3日 下午2:38:38
 * @version 1.0.0
 */
public class TestDataStream {

	public static void main(String[] args) {
		try {
			/*//创建基本数据类的输出流
			DataOutputStream dos = new DataOutputStream(
					new FileOutputStream("src/com/demo/tests/data.txt"));
			//写入基本数据类型到文件中
			dos.writeInt(100);
			dos.writeLong(1000);
			dos.writeDouble(10000);
			dos.flush();
			dos.close();*/
			//创建基本数据类型的输入流
			DataInputStream dis = new DataInputStream(
					new FileInputStream("src/com/demo/tests/data.txt"));
			//读取基本类型的数据
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());
			System.out.println(dis.readDouble());
			//System.out.println(dis.readInt()); //抛出异常
			//关闭流
			dis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
