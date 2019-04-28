package com.demo.works;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义输出流
 * @author Teacher
 * @createTime 2017年8月4日 上午9:27:20
 * @version 1.0.0
 */
class MyOutputStream extends FilterOutputStream {
	
	private DateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

	public MyOutputStream(OutputStream out) throws IOException {
		super(out);
		writeComment();
	}
	
	/**
	 * 向文件中写入注释
	 * @throws IOException
	 */
	private void writeComment() throws IOException {
		super.out.write(("#"+format.format(new Date())+"\r\n").getBytes());
	}

	public void write(String data) throws IOException {
		write(data.getBytes());
	}

	@Override
	public void write(int b) throws IOException {
		super.write(b);
	}

	@Override
	public void write(byte b[]) throws IOException {
		super.write(b);
	}

	@Override
	public void write(byte b[], int off, int len) throws IOException {
		super.write(b, off, len);
	}

}

/**
 * 使用自定义输出流
 * @author Teacher
 * @createTime 2017年8月4日 上午9:25:06
 * @version 1.0.0
 */
public class MyOutputStreamClient {

	public static void main(String[] args) {
		try {
			MyOutputStream mos = new MyOutputStream(
					new FileOutputStream("src/com/demo/works/data.txt",true));
			/*mos.write("中软国际\r\n");
			mos.write("中国软件\r\n");
			mos.write("中国移动\r\n");*/
			mos.write('H');
			mos.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
