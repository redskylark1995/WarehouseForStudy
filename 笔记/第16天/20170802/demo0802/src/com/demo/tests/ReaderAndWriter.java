package com.demo.tests;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 字符输入输出流
 * @author Teacher
 * @createTime 2017年8月2日 下午5:35:23
 * @version 1.0.0
 */
public class ReaderAndWriter {

	public static void main(String[] args) {
		try {
			/*//创建字符文件输入流
			FileReader reader = new FileReader("D:\\MYFILE\\test.txt");
		    //获得编码格式
			System.out.println("编码格式: "+reader.getEncoding());
			//读取文件
			int data;
			while((data=reader.read())!=-1) {
				System.out.print((char) data);
			}
			char[] buff = new char[1024*1024];
			int len;
			while((len=reader.read(buff))!=-1) {
				System.out.println(new String(buff, 0, len));
			}
			//关闭流
			reader.close();*/
			//创建字符文件输出流
			Writer writer = new FileWriter("D:\\myfile\\test2.txt", true);
			//写入内容到文件中
			writer.write("How are you! 你好!\r\n");
			//关闭流
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
