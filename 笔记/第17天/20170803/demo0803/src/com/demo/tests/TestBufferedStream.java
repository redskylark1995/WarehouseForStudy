package com.demo.tests;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节缓冲输入输出流
 * @author Teacher
 * @createTime 2017年8月3日 下午2:52:53
 * @version 1.0.0
 */
public class TestBufferedStream {

	public static void main(String[] args) {
		try {
			/*//创建字节缓冲输入流
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream("src/com/demo/tests/databuff.txt"));
			//定义存放数据的数组
			byte[] buff = new byte[1024];
			//定义记录读取字节数的变量
			int len;
			//循环读取数据
			while((len=bis.read(buff))!=-1) {
				System.out.println(new String(buff, 0, len));
			}
			//关闭流
			bis.close();*/
			//创建字节缓冲输出流
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream("src/com/demo/tests/databuff.txt", true));
			//写入数据到文件中
			bos.write("\r\n中软国际!".getBytes());
			//关闭流
			bos.flush();
			//bos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
