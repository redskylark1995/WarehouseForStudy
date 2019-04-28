package com.demo.tests;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用字节流写入文件
 * @author Teacher
 * @createTime 2017年8月2日 下午4:26:32
 * @version 1.0.0
 */
public class WriteFileStream {

	public static void main(String[] args) {
		try {
			//创建字节文件输出流
			FileOutputStream fos = new FileOutputStream(
					"d:\\myfile\\test1.txt", false); //第二个参数， true 追加数据，false 替换数据
			//写出数据到文件中
			fos.write("Hello World! 你好世界!\r\n".getBytes());
			//关闭流
			fos.flush();
			fos.close();
			System.out.println("写入文件完毕!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
