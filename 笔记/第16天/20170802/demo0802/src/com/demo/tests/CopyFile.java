package com.demo.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 剪切文件
 * @author Teacher
 * @createTime 2017年8月2日 下午5:05:58
 * @version 1.0.0
 */
public class CopyFile {

	public static void main(String[] args) {
		try {
			//创建文件对象
			File sourceFile = new File(
					"C:\\Users\\Administrator\\Desktop\\java月考-1月.doc");
			//创建输入流
			FileInputStream fis = new FileInputStream(sourceFile);
			//创建输出流
			FileOutputStream fos = new FileOutputStream(
					"D:\\myfile\\java月考-1月.doc");
			//定义缓存数据的数组
			byte[] buff = new byte[1024*1024];
			//定义记录读取字节数变量
			int len;
			//循环读取并写入数据
			while((len=fis.read(buff))!=-1) {
				//写入数据到文件中
				fos.write(buff, 0, len);
			}
			//关闭流
			fos.flush();
			fos.close();
			fis.close();
			//删除原文件
			sourceFile.delete(); //关闭与文件相连的流后，才能删除文件
			System.out.println("复制文件完毕!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
