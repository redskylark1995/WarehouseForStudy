package com.demo.tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 字符字节转换流
 * @author Teacher
 * @createTime 2017年8月2日 下午6:13:29
 * @version 1.0.0
 */
public class InOutputStreamReaderWriter {

	public static void main(String[] args) {
		try {
			/*//创建字符字节转换输入流
			InputStreamReader isr = new InputStreamReader(
					new FileInputStream("D:\\myfile\\test.txt"), "GBK");
			//读取文件中数据
			char[] cbuf = new char[1024*1024];
			int len;
			while((len=isr.read(cbuf))!=-1) {
				System.out.println(new String(cbuf, 0, len));
			}
			//关闭流
			isr.close();*/
			OutputStreamWriter osr = new OutputStreamWriter(
					new FileOutputStream("D:\\Myfile\\test2.txt", true));
			osr.write("中软国际!\r\n");
			osr.append("中国软件!\r\n");
			osr.append("中兴华为!\r\n");
			//关闭流
			osr.flush();
			//osr.close();
			System.out.println("写入文件完毕!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
