package com.demo.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符缓冲输入输出流
 * @author Teacher
 * @createTime 2017年8月3日 下午3:24:30
 * @version 1.0.0
 */
public class TestBufferedReaderWriter {

	public static void main(String[] args) {
		try {
			/*//创建字符缓冲输入流
			BufferedReader br = new BufferedReader(
					new FileReader("src/com/demo/tests/databuff.txt"));
			//循环读取行
			String data;
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
			//关闭流
			br.close();*/
			//创建字符缓冲输出流
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("src/com/demo/tests/databuff.txt", true));
			//新建行
			bw.newLine();
			//写入数据到文件中
			bw.write("中国软件!");
			//关闭流
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
