package com.demo.works;

import java.io.File;

/**
 * 文件工具类
 * 获得指定目录下文件列表
 * @author Teacher
 * @createTime 2017年8月4日 上午10:04:01
 * @version 1.0.0
 */
public class FileUtils {
	
	/**
	 * 输出所有文件，不包括子级
	 * @param dir
	 * @throws Exception 
	 */
	public static void printAllFile(String dirPath) throws Exception {
		//创建目录对象
		File dir = new File(dirPath);
		//判断是否不是目录
		if(!dir.isDirectory()) {
			throw new Exception("错误:不是一个目录!");
		}
		//获得文件数组
		File[] files = dir.listFiles();
		//循环输出文件信息
		for(File file: files) {
			if(file.isFile()) {
				System.out.println(file.getName());
			}
		}
	}
	
	/**
	 * 输出指定类型的文件，不包含子级
	 * @param dirPath
	 * @param type
	 */
	public static void printTypeFile(String dirPath, String type) {
		//创建目录对象
		File dir = new File(dirPath);
		//判断是否不是目录
		if(!dir.isDirectory()) {
			try {
				throw new Exception("错误:不是一个目录!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//获得文件数组
		File[] files = dir.listFiles();
		//循环输出文件信息
		for(File file: files) {
			if(file.isFile()&&file.getName().substring(
					file.getName().lastIndexOf("."))
					    .equalsIgnoreCase(type)) {
				System.out.println(file.getName());
			}
		}
	}
	
	/**
	 * 输出指定目录下文件
	 * @param dir
	 * @param grade
	 */
	public static void printAllFile(File dir, int grade) {	
		//获得文件数组
		File[] files = dir.listFiles();
		//循环输出文件信息
		for(File file: files) {
			for(int i=0; i<grade; i++) {
				System.out.print("\t");
			}
			if(file.isFile()) {
				System.out.println(file.getName());
			} else if(file.isDirectory()) {
				System.out.println(file.getName()+":");
				//grade++;
				printAllFile(file, grade+1);
			}
		}
	}
	
	/**
	 * 输出所有的文件，可以输出子级
	 * @param dirPath
	 * @param isSub
	 * @throws Exception 
	 */
	public static void printAllFile(String dirPath, boolean isSub) throws Exception {
		if(!isSub) {
			printAllFile(dirPath);
		} else {
			//创建目录对象
			File dir = new File(dirPath);
			//判断是否不是目录
			if(!dir.isDirectory()) {
				throw new Exception("错误:不是一个目录!");
			}
			//输出目录下的文件
			printAllFile(dir, 0);
		}
	}
	
	/*public static void method(int v) {
		System.out.println(v);
	}*/

	public static void main(String[] args) {
		/*int v = 10;
		method(++v);*/
		try {
			//printAllFile("d:\\myfile");
			//printTypeFile("d:\\myfile", ".txt");
			printAllFile("d:\\myfile", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
