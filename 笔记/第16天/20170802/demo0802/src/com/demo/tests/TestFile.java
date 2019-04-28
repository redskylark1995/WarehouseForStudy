package com.demo.tests;

import java.io.File;
import java.sql.Timestamp;

/**
 * 使用文件File类
 * @author Teacher
 * @createTime 2017年8月2日 上午11:58:37
 * @version 1.0.0
 */
public class TestFile {

	public static void main(String[] args) {
		//创建文件对象
		File file = new File("D:\\demo\\index.html");
		System.out.println("目录："+file.getParent());
		System.out.println("文件名："+file.getName());
		System.out.println("完整路径："+file.getPath());
		System.out.println("文件大小："+file.length());
		System.out.println("文件最新访问时间："+new Timestamp(file.lastModified()));
	}

}
