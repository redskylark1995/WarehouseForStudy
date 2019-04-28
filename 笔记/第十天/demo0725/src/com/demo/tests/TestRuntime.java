package com.demo.tests;

import java.io.IOException;

/**
 * Java运行时实例
 * 使用Java打开其他程序
 * @author Teacher
 * @createTime 2017年7月25日 下午5:09:15
 * @version 1.0.0
 */
public class TestRuntime {

	public static void main(String[] args) throws IOException, InterruptedException {
		//获得运行时实例对象
		Runtime runtime = Runtime.getRuntime();
		//打开另一个程序的进程
		//使用exe文件, 并返回子进程对象
		Process process = runtime.exec("C:\\Users\\Administrator\\AppData\\"
				+ "Roaming\\360se6\\Application\\360se.exe http://www.baidu.com/#wd=最新电影");
		//使用命令
		//runtime.exec("IEXPLORE http://www.baidu.com/#wd=最新电影");
		//runtime.exec("notepad C:\\Users\\Administrator\\Desktop\\课程记录.txt");
		//Thread.sleep(5000);
		//process.destroy();
	}

}
