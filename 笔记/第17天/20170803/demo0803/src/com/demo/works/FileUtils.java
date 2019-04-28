package com.demo.works;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件操作的工具类
 * @author Teacher
 * @createTime 2017年8月3日 上午9:26:55
 * @version 1.0.0
 */
public class FileUtils {

	/**
	 * 复制文件
	 * @param sourcePath
	 * @param targetDir
	 * @throws IOException
	 */
	public static void copy(String sourcePath,
			String targetDir) throws Exception {
		//创建源文件对象
		File sourceFile = new File(sourcePath);
		//创建存放文件的文件夹的对象
		File dir = new File(targetDir);
		//判断是否不是文件
		if(!sourceFile.isFile()) {
			throw new Exception("错误：不是一个文件!");
		}
		//判断目录是否不存在
		if(!dir.exists()) {
			//创建目录
			dir.mkdirs();
		}
		//获得文件名
		String fileName = sourceFile.getName();
		//创建目标文件对象
		File targetFile = new File(dir, fileName);
		//判断文件是否已存在
		if(targetFile.exists()) {
			//筛选同名的文件
			File[] files = dir.listFiles(new FileFilter() {			
				@Override
				public boolean accept(File pathname) {
					//System.out.println(pathname.getName());
					return pathname.getName().matches(
							fileName.substring(0, fileName.lastIndexOf("."))
							    .replace("(", "\\(").replace(")", "\\)")
							+"(\\(\\d+\\))?"
							+fileName.substring(fileName.lastIndexOf(".")));
				}
			});
			/*System.out.println(fileName.substring(0, fileName.lastIndexOf("."))
							+"(\\(\\d+\\))?"
							+fileName.substring(fileName.lastIndexOf(".")));*/
			System.out.println(files.length);
			//修改文件名，创建新的文件对象
			targetFile = new File(dir, fileName.substring(0, fileName.lastIndexOf("."))
					+"("+(files.length+1)+")"
					+fileName.substring(fileName.lastIndexOf(".")));
			System.out.println(targetFile.getName());
		}
		//创建输入流
		InputStream in = new FileInputStream(sourceFile);
		//创建输出流
		OutputStream out = new FileOutputStream(targetFile);
		//定义缓存数据的数组
		byte[] buff = new byte[1024*1024];
		//定义记录读取字节数的变量
		int len;
		//循环读取并写入
		while((len=in.read(buff))!=-1) {
			out.write(buff, 0, len);
		}
		//关闭流
		out.flush();
		out.close();
		in.close();
		System.out.println("复制文件成功!");
	}
	
	public static void main(String[] args) {
		try {
			FileUtils.copy("D:\\myfile\\Frame(2).jpg", "C:\\myfile\\images");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("sss(12)(1).jpg".matches("sss(\\(\\d+\\))*.jpg"));
		//System.out.println("Frame(2).jpg".matches("Frame\\(2\\)(\\(\\d+\\))?.jpg"));
	}

}
