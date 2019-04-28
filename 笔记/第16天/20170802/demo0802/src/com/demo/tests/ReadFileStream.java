package com.demo.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 使用字节流读取文件
 * @author Teacher
 * @createTime 2017年8月2日 下午3:29:33
 * @version 1.0.0
 */
public class ReadFileStream {

	public static void main(String[] args) {
		//声明字符输入流变量
		FileInputStream fis = null;
		try {
			//创建文件对象
			File file = new File("d:\\myfile\\test.txt");
			//创建字节文件输入流
			fis = new FileInputStream(file);
			//循环读取文件内容
			/*int data = -1;
			while((data=fis.read())!=-1) {
				System.out.print((char)data);
			}*/
			//定义存放字节数组
			byte[] buff = new byte[1024*1024];
			//定义记录读取字符数的变量
			int len = -1;
			//循环读取内容
			while((len=fis.read(buff))!=-1) {
				System.out.println("读取的字节数: "+len);
				System.out.println(new String(buff, 0, len, "gbk"));
			}
			//关闭流
			//fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//判断流对象是否成功创建
				if(fis!=null) {
					//关闭流
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
