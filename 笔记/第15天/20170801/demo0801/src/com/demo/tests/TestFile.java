package com.demo.tests;

import java.io.File;
import java.io.IOException;

/**
 * 使用File类
 * @author Teacher
 * @createTime 2017年8月1日 下午5:47:28
 * @version 1.0.0
 */
public class TestFile {

	public static void main(String[] args) {
		try {
			//创建目录对象
			File dir = new File("d:\\mydir");
			//判断文件是否存在
			if(dir.exists()) {
				System.out.println("文件夹已存在!");
			} else {
				System.out.println("创建文件夹!");
				dir.mkdir();
			}
			//创建文件对象
			File file = new File(dir, "test.txt");
			//创建文件, 检查文件是否存在，若不存在则创建该文件; 已存在，不创建。
			file.createNewFile();
			//删除文件
			//file.delete();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("程序执行完毕!");
		}
	}

}
